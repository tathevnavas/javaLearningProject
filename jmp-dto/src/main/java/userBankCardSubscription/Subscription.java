package userBankCardSubscription;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Subscription {
    String bankcard;
    LocalDate startDate;
    static List<Subscription> subscriptionsList = new ArrayList<>();

    public Subscription(String bankcard){
        this.bankcard = bankcard;
        startDate = LocalDate.now();
        subscriptionsList.add(this);
    }

    public static List<Subscription> getSubscriptions(){
        return subscriptionsList;
    }

    public String getBankcardNumber() {
        return  bankcard;
    }
}
