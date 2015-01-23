package br.com.infowhere.exception;

public class BusinessException extends Exception {

    private static final long serialVersionUID = 1L;

    public BusinessException() {
        super();
    }

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Throwable t) {
        super(msg, t);
    }

    public BusinessException(Throwable t) {
        super(t);
    }
}