import RealBank.BankSample;

module jmp.cloud.bank.impl {
    requires jmp.dto;
    requires transitive jmp.bank.api;
    exports RealBank;
    provides bankInterface.Bank with BankSample;
}