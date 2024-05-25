package serviceInterface;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import userBankCardSubscription.BankCard;
import userBankCardSubscription.Subscription;
import userBankCardSubscription.User;

public interface Service {
    void subscribe(BankCard bankCard);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);
    List<User> getAllUsers();
    default double getAverageUsersAge(){
        return getAllUsers()
            .stream()
            .mapToDouble(u -> ChronoUnit.YEARS.between(u.getBirthday(),LocalDate.now()))
            .average()
            .orElseThrow();
    }
    static boolean isPayableUser(User user){
        if (ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) > 18)
            return true;
        return false;
    }
}
