package pl.narodzinyprogramisty.MVC.domain;

public class Account {
    private String login;
    private String password;
    private int PIN;
    private double balance;

    public Account(String login, String password, int PIN) {
        this(login, password, PIN, 0);
    }

    public Account(String login, String password, int PIN, double balance) {
        this.login = login;
        this.password = password;
        this.PIN = PIN;
        this.balance = balance;


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", PIN=" + PIN +
                ", balance=" + balance +
                '}';
    }
}
