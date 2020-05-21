package ua.restest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.restest.model.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
