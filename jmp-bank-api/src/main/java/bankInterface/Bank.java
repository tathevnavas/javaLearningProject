package bankInterface;

import userBankCardSubscription.BankCard;
import userBankCardSubscription.User;
import commons.BankCardType;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
