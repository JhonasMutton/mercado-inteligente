package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.CreateInteraction;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.DeleteInteraction;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.FindInteractionById;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.FindInteractions;
import br.edu.usf.mercadointeligentespring.core.usecase.interaction.UpdateInteraction;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/interactions")
public class InteractionController {
    private final CreateInteraction createInteraction;
    private final DeleteInteraction deleteInteraction;
    private final UpdateInteraction updateInteraction;
    private final FindInteractions findInteractions;
    private final FindInteractionById findInteractionById;

    @PostMapping
    public Interaction create(@RequestBody Interaction Interaction) {
        return createInteraction.execute(Interaction);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteInteraction.execute(id);
    }

    @GetMapping("/{id}")
    public Interaction findInteractionById(@PathVariable Long id) {
        return findInteractionById.execute(id);
    }

    @PutMapping("/{id}")
    public Interaction updateInteraction(@PathVariable Long id, @RequestBody Interaction Interaction) {
        return updateInteraction.execute(id, Interaction);
    }

    @GetMapping
    public List<Interaction> findInteractions() {
        return findInteractions.execute();
    }

}
