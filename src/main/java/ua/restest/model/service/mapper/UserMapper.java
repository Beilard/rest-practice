package ua.restest.model.service.mapper;

import org.springframework.stereotype.Component;
import ua.restest.model.dto.User;
import ua.restest.model.entity.UserEntity;

import java.util.Objects;

@Component
public class UserMapper {
    public UserEntity mapDtoToEntity(User user) {
        if (Objects.isNull(user)) {
            return null;
        }
        return UserEntity.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public User mapEntityToDto(UserEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }
        return User.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();
    }


}
