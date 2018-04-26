package com.npci.isc.model.exception;

public class EntityIdIsNullException extends RuntimeException {
    public EntityIdIsNullException() {
        super();
    }

    public EntityIdIsNullException(String message) {
        super(message);
    }

    public EntityIdIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityIdIsNullException(Throwable cause) {
        super(cause);
    }

    protected EntityIdIsNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}