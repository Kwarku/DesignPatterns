package pl.narodzinyprogramisty.MVC.model;

import pl.narodzinyprogramisty.MVC.domain.Account;

public interface BankOpperation {

    boolean getCash(Account account, double value);

    boolean addCash(Account account, double value);

    boolean transfer(Account account, String userLoginTo, double value);

    void changeUserPin(Account account, int newPin);

}
