package serviceInterface;

import userBankCardSubscription.BankCard;
import userBankCardSubscription.Subscription;
import userBankCardSubscription.User;

import java.util.List;
import java.util.Optional;

public interface Service {
    void subscribe(BankCard bankCard);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);
    List<User> getAllUsers();
    default double getAverageUsersAge(){
        return getAllUsers()
                .stream()
                .mapToLong(User::getUserAge) // can be extracted to separate function, reference can be used
                .average()
                .orElseThrow();
    }

    static boolean isPayableUser(User user) {
        return user.getUserAge() > 18; // align, no need in if
    }
}
