package pl.narodzinyprogramisty.MVC.model;

import pl.narodzinyprogramisty.MVC.domain.Account;

import java.util.Objects;

public class BankOpperationImpl implements BankOpperation {

    private BankService bankService = new BankServiceImpl();


    @Override
    public boolean getCash(Account account, double value) {


        if (canWindrowMoney(value, account)) {
            getCashFromAccount(account, value);
            return true;
        }
        return false;
    }

    @Override
    public boolean addCash(Account account, double value) {


        if (isValuePositive(value)) {
            addCashToAccount(account, value);
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, String userLoginTo, double value) {
        Account to = bankService.getAccountByLogin(userLoginTo);

        Objects.requireNonNull(to);


        if (canWindrowMoney(value, account)) {
            payMoney(account, to, value);
            return true;
        }
        return false;
    }

    @Override
    public void changeUserPin(Account account, int newPin) {
        changePin(account, newPin);
    }

    private void changePin(Account account, int newPin) {
        account.setPIN(newPin);
    }

    private void payMoney(Account from, Account to, double value) {
        getCashFromAccount(from, value);
        addCashToAccount(to, value);
    }

    private void getCashFromAccount(Account account, double value) {
        account.setBalance(account.getBalance() - value);
    }

    private void addCashToAccount(Account account, double value) {
        account.setBalance(account.getBalance() + value);
    }

    private boolean canWindrowMoney(double value, Account account) {
        return isValuePositive(value) && hasUserMoney(value, account);
    }

    private boolean isValuePositive(double value) {
        return value > 0;
    }

    private boolean hasUserMoney(double value, Account account) {
        return account.getBalance() - value > 0;
    }
}
