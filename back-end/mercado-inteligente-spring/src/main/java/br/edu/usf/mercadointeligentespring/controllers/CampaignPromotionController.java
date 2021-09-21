package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.usecase.campaign.CreateCampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.usecase.campaign.DeleteCampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.usecase.campaign.FindCampaignPromotionById;
import br.edu.usf.mercadointeligentespring.core.usecase.campaign.FindCampaignPromotions;
import br.edu.usf.mercadointeligentespring.core.usecase.campaign.UpdateCampaignPromotion;
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
@RequestMapping("/campaigns")
public class CampaignPromotionController {
    private final CreateCampaignPromotion createCampaignPromotion;
    private final DeleteCampaignPromotion deleteCampaignPromotion;
    private final UpdateCampaignPromotion updateCampaignPromotion;
    private final FindCampaignPromotions findCampaignPromotions;
    private final FindCampaignPromotionById findCampaignPromotionById;

    @PostMapping
    public CampaignPromotion create(@RequestBody CampaignPromotion CampaignPromotion) {
        return createCampaignPromotion.execute(CampaignPromotion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteCampaignPromotion.execute(id);
    }

    @GetMapping("/{id}")
    public CampaignPromotion findCampaignPromotionById(@PathVariable Long id) {
        return findCampaignPromotionById.execute(id);
    }

    @PutMapping("/{id}")
    public CampaignPromotion updateCampaignPromotion(@PathVariable Long id, @RequestBody CampaignPromotion CampaignPromotion) {
        return updateCampaignPromotion.execute(id, CampaignPromotion);
    }

    @GetMapping
    public List<CampaignPromotion> findCampaignPromotions() {
        return findCampaignPromotions.execute();
    }

}
