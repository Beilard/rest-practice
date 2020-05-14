package ua.restest.model.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.restest.model.dto.Account;
import ua.restest.model.repository.AccountRepository;
import ua.restest.model.service.AccountService;
import ua.restest.model.service.mapper.AccountMapper;

import javax.persistence.EntityNotFoundException;
import java.util.Objects;

@AllArgsConstructor
@Service("accountService")
public class DefaultAccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        if (Objects.isNull(account)) {
            throw new IllegalArgumentException("Null account passed to save");
        }
        accountRepository.save(accountMapper.mapDtoToEntity(account));
    }

    @Override
    public Account findById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null id passed");
        }
        return accountRepository.findById(id)
                .map(accountMapper::mapEntityToDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void update(Account account) {
        if (Objects.isNull(account)) {
            throw new IllegalArgumentException("Null id passed to update");
        }
        accountRepository.save(accountMapper.mapDtoToEntity(account));
    }

    @Override
    public void delete(Account account) {
        if (Objects.isNull(account)) {
            throw new IllegalArgumentException("Null id passed to delete");
        }
        accountRepository.delete(accountMapper.mapDtoToEntity(account));
    }
}
