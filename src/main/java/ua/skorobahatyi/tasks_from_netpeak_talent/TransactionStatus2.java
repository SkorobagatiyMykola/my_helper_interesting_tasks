package ua.skorobahatyi.tasks_from_netpeak_talent;

public enum TransactionStatus2 {

    NEW,
    PROCESSING,
    SUCCESS{
        @Override
        public boolean isFinal(){
            return true;
        }
    },
    ERROR{
        @Override
        public boolean isFinal(){
            return true;
        }
    },
    ;

    public boolean isFinal() {
        return false;
    }

    public boolean isFinal2() {
        return switch (this) {
            case ERROR, SUCCESS -> true;
            default -> false;
        };
    }
}
