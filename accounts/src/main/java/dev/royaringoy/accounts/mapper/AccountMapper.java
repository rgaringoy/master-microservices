package dev.royaringoy.accounts.mapper;

import dev.royaringoy.accounts.dto.AccountDto;
import dev.royaringoy.accounts.entity.Account;


public class AccountMapper {

    public static AccountDto mapToAccountDto(Account Account, AccountDto AccountDto) {
        AccountDto.setAccountNumber(Account.getAccountNumber());
        AccountDto.setAccountType(Account.getAccountType());
        AccountDto.setBranchAddress(Account.getBranchAddress());
        return AccountDto;
    }

    public static Account mapToAccount(AccountDto AccountDto, Account Account) {
        Account.setAccountNumber(AccountDto.getAccountNumber());
        Account.setAccountType(AccountDto.getAccountType());
        Account.setBranchAddress(AccountDto.getBranchAddress());
        return Account;
    }
}
