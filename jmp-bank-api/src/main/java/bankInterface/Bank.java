package bankInterface;

import userBankCardSubscription.BankCard;
import userBankCardSubscription.User;
import utils.BankCardType;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
