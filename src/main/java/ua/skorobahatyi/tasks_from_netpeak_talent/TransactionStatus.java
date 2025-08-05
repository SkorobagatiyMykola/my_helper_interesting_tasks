package ua.skorobahatyi.tasks_from_netpeak_talent;

public enum TransactionStatus {

    NEW,
    PROCESSING,
    SUCCESS,
    ERROR,
    ;

    public boolean isFinal() {
        return this == SUCCESS || this == ERROR;
    }

    public boolean isFinal2() {
        return switch (this) {
            case ERROR, SUCCESS -> true;
            default -> false;
        };
    }
}
