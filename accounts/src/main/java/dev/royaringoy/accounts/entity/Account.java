package dev.royaringoy.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account extends BaseEntity {

    private Long customerId;

    @Id
    private  Long accountNumber;

    private String accountType;

    private String branchAddress;
}
