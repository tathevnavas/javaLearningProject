package userBankCardSubscription;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Subscription {
    String bankcard;
    LocalDate startDate;
    static Set<Subscription> subscriptionsList = new HashSet<>();

    public Subscription(String bankcard){
        this.bankcard = bankcard;
        startDate = LocalDate.now();
        subscriptionsList.add(this);
    }

    public static Set<Subscription> getSubscriptions(){
        return subscriptionsList;
    }

    public static Optional<Subscription> getSubscriptionByCardNumber(String number){
        return subscriptionsList
            .stream()
            .filter(s -> s.bankcard.equals(number))
            .findFirst();
    }

    public String getBankcardNumber() {
        return  bankcard;
    }
}
