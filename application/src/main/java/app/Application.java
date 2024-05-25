package app;

import static userBankCardSubscription.BankCard.getUsersBankCardNumber;

import java.time.LocalDate;
import java.time.Month;

import userBankCardSubscription.BankCard;
import userBankCardSubscription.CreditBankCard;
import userBankCardSubscription.DebitBankCard;
import userBankCardSubscription.Subscription;
import userBankCardSubscription.User;
import utils.IncorrectBankNumberException;

public class Application{
    public static void main(String[] args) {
        var user1 = new User("John", "Brown", LocalDate.of(1980, Month.MAY, 25));
        var user2 = new User("Kate", "Brown", LocalDate.of(1990, 01, 25));
        var user3 = new User("Sarah", "Parker", LocalDate.of(1997, Month.MAY, 01));

        var creditCardForUser1 = new CreditBankCard(user1);
        var debitCardForUser2 = new DebitBankCard(user2);
        var creditCardForUser3 = new CreditBankCard(user3);

        var firstUserSubscription = new Subscription(creditCardForUser1.getNumber());
        var secondUserSubscription = new Subscription(debitCardForUser2.getNumber());

        var s = Subscription.getSubscriptionByCardNumber("564646")
            .orElseThrow(() -> new IncorrectBankNumberException("incorrect ban card number"));

    }
}
