package ua.restest.model.dto;

import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder(toBuilder = true)
public class User {
    private final Long id;
    private final String email;
    private final String password;
    private final List<Account> accounts;
}
