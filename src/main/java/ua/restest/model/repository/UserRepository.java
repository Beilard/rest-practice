package ua.restest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.restest.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
