package utils;

public class IncorrectBankNumberException extends RuntimeException{
    public IncorrectBankNumberException(String errorMessage) {
        super(errorMessage);
    }
}
