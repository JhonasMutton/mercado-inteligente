package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.usecase.user.CreateUser;
import br.edu.usf.mercadointeligentespring.core.usecase.user.DeleteUser;
import br.edu.usf.mercadointeligentespring.core.usecase.user.UpdateUser;
import br.edu.usf.mercadointeligentespring.core.usecase.user.FindUsers;
import br.edu.usf.mercadointeligentespring.core.usecase.user.FindUserById;
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
@RequestMapping("/users")
public class UserController {
    private final CreateUser createUser;
    private final DeleteUser deleteUser;
    private final UpdateUser updateUser;
    private final FindUsers findUsers;
    private final FindUserById findUserById;

    @PostMapping
    public User create(@RequestBody User user) {
        return createUser.execute(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteUser.execute(id);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id) {
        return findUserById.execute(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return updateUser.execute(id, user);
    }

    @GetMapping
    public List<User> findUsers() {
        return findUsers.execute();
    }

}
