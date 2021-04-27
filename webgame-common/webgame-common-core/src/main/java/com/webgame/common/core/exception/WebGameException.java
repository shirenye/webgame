package com.webgame.common.core.exception;

/**
 * webgame系统异常
 *
 * @author MrBird
 */
public class WebGameException extends RuntimeException {

    private static final long serialVersionUID = -6916154462432027437L;

    public WebGameException(String message) {
        super(message);
    }
}
