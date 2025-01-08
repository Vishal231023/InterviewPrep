package CoreJava.CustomExceptions;

public class CustomExceptionExtendingRuntimeException extends RuntimeException {
    public CustomExceptionExtendingRuntimeException(String message){
        super(message);
    }

    public CustomExceptionExtendingRuntimeException(String message, Throwable cause){
        super(message, cause);
    }

    public CustomExceptionExtendingRuntimeException( Throwable cause){
        super( cause);
    }


    public static void main(String[] args) throws CustomExceptionExtendingRuntimeException {

    }

}
