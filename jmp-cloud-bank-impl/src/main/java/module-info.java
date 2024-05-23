module jmp.cloud.bank.impl {
    requires jmp.dto;
    requires transitive jmp.bank.api;
    exports RealBank;
}