package ua.restest.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class User {
    private final Long id;
    private final String email;
    private final String password;
    private final List<Account> accounts;
}
