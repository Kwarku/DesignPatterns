package pl.narodzinyprogramisty.MVC.model;

import pl.narodzinyprogramisty.MVC.domain.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankServiceImpl implements BankService {

    private List<Account> accounts = new ArrayList<>();


    @Override
    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public Account logIn(String login, String password) {

        Account account = getAccount(login);
        Objects.requireNonNull(account);

        if (isPasswordCorrect(password, account))
            return account;


        //todo dodac oblsuge wyjatkow, gdy uzytkonik nie istnieje, gdy haslo jest bledne i login bledny
        return null;
    }

    @Override
    public Account getAccountByLogin(String login) {
        return getAccount(login);
    }

    private Account getAccount(String login) {
        for (Account account : accounts) {
            account.getLogin().equals(login);
            return account;
        }
        return null;
    }

    private boolean isPasswordCorrect(String password, Account account) {
        if (account.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
