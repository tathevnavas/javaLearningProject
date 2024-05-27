package userBankCardSubscription;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import commons.SubscriptionStatus;

public class Subscription {
    String bankcard;
    LocalDate startDate;
    SubscriptionStatus subscriptionStatus;
    static Set<Subscription> subscriptionsList = new HashSet<>();

    public Subscription(String bankcard){
        this.bankcard = bankcard;
        startDate = LocalDate.now();
        subscriptionStatus = SubscriptionStatus.ACTIVE;
        subscriptionsList.add(this);
    }

    public void updateSubscriptionStatus(SubscriptionStatus status){
        subscriptionStatus = status;
    }

    public SubscriptionStatus getSubscriptionStatus(){
        return subscriptionStatus;
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
