package pl.wwsis.java;

public class InputParseException extends Exception {
    public InputParseException(String message) {
        super(message);
    }

    public InputParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
