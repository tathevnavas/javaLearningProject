package userBankCardSubscription;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class BankCard {
    String number;
    User user;
    Random rand = new Random();
    static Set<BankCard> bankCards = new HashSet<>();
    public BankCard(User user){
        this.number = rand.nextInt(1000) + "-" + rand.nextInt(1000) + "-" + rand.nextInt(1000) + "-" + rand.nextInt(1000);
        this.user = user;
        bankCards.add(this);
    }

    public String getNumber() {
        return number;
    }

    public static Optional<BankCard> getUsersBankCardNumber(User user) {
        return bankCards
            .stream()
            .filter(x -> (x.user.name.equals(user.name) & x.user.surname.equals(user.surname)))
            .findFirst();
    }
}
