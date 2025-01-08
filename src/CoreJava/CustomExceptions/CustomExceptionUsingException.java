package CoreJava.CustomExceptions;

public class CustomExceptionUsingException extends Exception{
    public CustomExceptionUsingException(String message){
        super(message);

    }
    public CustomExceptionUsingException(String message, Throwable cause){
        super(message,cause);
    }
    public CustomExceptionUsingException(Throwable cause){
        super(cause);
    }

}
