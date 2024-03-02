package dev.royaringoy.accounts.service;

import dev.royaringoy.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
