package exception;

public class FileEndException extends RuntimeException {
    public FileEndException() {
    }

    public FileEndException(String message) {
        super(message);
    }

    public FileEndException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileEndException(Throwable cause) {
        super(cause);
    }
}
