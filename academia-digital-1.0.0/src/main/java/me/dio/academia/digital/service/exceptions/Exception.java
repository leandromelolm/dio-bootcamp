package me.dio.academia.digital.service.exceptions;

public class Exception extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public Exception(String msg) {
        super(msg);
    }

    public Exception(String msg, Throwable cause) {
        super(msg, cause);
    }
}
