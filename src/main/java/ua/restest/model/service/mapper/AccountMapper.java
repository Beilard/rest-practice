package ua.restest.model.service.mapper;

import org.springframework.stereotype.Component;
import ua.restest.model.dto.Account;
import ua.restest.model.entity.AccountEntity;

import java.util.Objects;

@Component
public class AccountMapper {
    public AccountEntity  mapDtoToEntity(Account account) {
        if (Objects.isNull(account)) {
            return null;
        }
        return new AccountEntity(account.getId(), account.getAccountNumber());
    }

    public Account mapEntityToDto(AccountEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }
        return new Account(entity.getId(), entity.getAccountNumber());
    }
}
