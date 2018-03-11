package pl.narodzinyprogramisty.MVC.model;

import pl.narodzinyprogramisty.MVC.domain.Account;

public interface BankService {

    void addAccount(Account account);

    Account logIn(String login, String password);

    Account getAccountByLogin(String login);
}
