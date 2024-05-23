package realService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import serviceInterface.Service;
import userBankCardSubscription.BankCard;
import userBankCardSubscription.Subscription;
import userBankCardSubscription.User;

public class ServiceSample implements Service {
    @Override
    public void subscribe(BankCard bankCard) {
        new Subscription(bankCard.getNumber());
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return Optional.ofNullable(Subscription.getSubscriptions()
            .stream()
            .filter(s -> s.getBankcardNumber().equals(cardNumber))
            .findFirst().orElseThrow(NoSuchElementException::new));
    }

    @Override
    public List<User> getAllUsers() {
        return User.getUsers();
    }
}
