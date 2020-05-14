package ua.restest.model.service;

import ua.restest.model.dto.Account;

public interface AccountService {
    void save(Account account);

    Account findById(Long id);

    void update(Account account);

    void delete(Account account);
}
