package ua.restest.model.service;

import ua.restest.model.dto.User;

public interface UserService {
    void save(User user);

    User findById(Long id);

    void update(User user);

    void delete(User user);
}
