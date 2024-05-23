package RealBank;

import java.util.Random;

import bankInterface.Bank;
import userBankCardSubscription.BankCard;
import userBankCardSubscription.CreditBankCard;
import userBankCardSubscription.DebitBankCard;
import userBankCardSubscription.User;
import utils.BankCardType;

public class BankSample implements Bank {
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        switch (bankCardType){
            case CREDIT: return new CreditBankCard("4646464", user);
            case DEBIT: return new DebitBankCard("546464", user);
            default: return null;
        }
    }
}
