package ua.restest.model.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.restest.model.dto.User;
import ua.restest.model.repository.UserRepository;
import ua.restest.model.service.UserService;
import ua.restest.model.service.mapper.UserMapper;

import javax.persistence.EntityNotFoundException;
import java.util.Objects;
@Service("userService")
@AllArgsConstructor
public class DefaultUserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public void save(User user) {
        if (Objects.isNull(user)) {
            throw new IllegalArgumentException("Null user passed to save");
        }
        userRepository.save(userMapper.mapDtoToEntity(user));
    }

    @Override
    public User findById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null id passed");
        }
        return userRepository.findById(id)
                .map(userMapper::mapEntityToDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void update(User user) {
        if (Objects.isNull(user)) {
            throw new IllegalArgumentException("Null user passed to update");
        }
        userRepository.save(userMapper.mapDtoToEntity(user));
    }

    @Override
    public void deleteById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null id passed to delete");
        }
        userRepository.deleteById(id);
    }
}
