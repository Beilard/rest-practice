package ua.restest.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.restest.model.dto.Account;
import ua.restest.model.service.AccountService;

@RestController
@RequestMapping("/account")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public void createUser(Account account) {
        accountService.save(account);
    }

    @GetMapping("/{id}")
    public Account getUser(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PutMapping
    public void updateUser(@PathVariable Long id, @RequestParam Account account) {
        Account modifiedAccount = new Account(id, account.getAccountNumber());

        accountService.update(modifiedAccount);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        accountService.deleteById(id);
    }
}
