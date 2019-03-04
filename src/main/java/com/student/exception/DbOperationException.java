package com.student.exception;

/**
 * @author Arun Kaushik
 */
public class DbOperationException extends RuntimeException {

    public DbOperationException() {
        super();
    }

    public DbOperationException(String message) {
        super(message);
    }
}
