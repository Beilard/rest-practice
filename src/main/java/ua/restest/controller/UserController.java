package ua.restest.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.restest.model.dto.User;
import ua.restest.model.service.UserService;

@RestController
@RequestMapping("/user")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService userService;

    @PostMapping
    public void createUser(User user) {
        userService.save(user);
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PutMapping
    public void updateUser(@PathVariable Long id, @RequestParam User user) {
        User modifiedUser = user.toBuilder()
                .id(id)
                .build();

        userService.update(modifiedUser);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
