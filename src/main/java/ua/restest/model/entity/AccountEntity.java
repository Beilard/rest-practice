package ua.restest.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Data
@Setter
@NoArgsConstructor
@Entity(name = "account")
public class AccountEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "account_number")
    private Long accountNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;


}
