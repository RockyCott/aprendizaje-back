package com.uis.aprendizaje.exceptions;

public class customException extends RuntimeException {

    public customException(String message) {
        super(message);
    }

    public customException(String message, Throwable cause) {
        super(message, cause);
    }

    public customException(Throwable cause) {
        super(cause);
    }

    public customException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
