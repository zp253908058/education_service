package com.swpu.student.auth.exception;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see UserNotFoundException
 * @since 2019-06-16
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("student number not fount or password error.");
    }
}
