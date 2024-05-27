package app;

import static userBankCardSubscription.BankCard.getUsersBankCardNumber;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import RealBank.BankSample;
import bankInterface.Bank;
import commons.BankCardType;
import commons.SubscriptionStatus;
import realService.ServiceProvider;
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

        Bank bankcard = (x, y) -> {
            switch (y){
                case CREDIT:
                    return new CreditBankCard(x);
                case DEBIT:
                    return new DebitBankCard(x);
            }
            return null;
        };

        var creditCard = bankcard.createBankCard(user2, BankCardType.CREDIT);

        var firstUserSubscription = new Subscription(creditCardForUser1.getNumber());
        var secondUserSubscription = new Subscription(debitCardForUser2.getNumber());

        var subscription = Subscription.getSubscriptionByCardNumber("564646")
            .orElseThrow(() -> new IncorrectBankNumberException("incorrect ban card number"));

        Predicate<Subscription> myPredicate = status -> status.getSubscriptionStatus() == SubscriptionStatus.ACTIVE;

        var activeSubscriptions = new ServiceProvider().getAllSubscriptionsByCondition(myPredicate);
    }
}
