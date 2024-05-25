package RealBank;

import bankInterface.Bank;
import userBankCardSubscription.BankCard;
import userBankCardSubscription.CreditBankCard;
import userBankCardSubscription.DebitBankCard;
import userBankCardSubscription.User;
import commons.BankCardType;

public class BankSample implements Bank {
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        switch (bankCardType){
            case CREDIT: return new CreditBankCard(user);
            case DEBIT: return new DebitBankCard(user);
            default: return null;
        }
    }
}
