package userBankCardSubscription;

public class BankCard {
    String number;
    User user;
    public BankCard(String number, User user){
        this.number = number;
        this.user = user;
    }

    public String getNumber() {
        return number;
    }
}
