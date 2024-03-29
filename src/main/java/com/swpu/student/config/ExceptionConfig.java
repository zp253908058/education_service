package com.swpu.student.config;

import com.swpu.student.auth.exception.*;
import com.swpu.student.exception.EmptyFileException;
import com.swpu.student.exception.InnerServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see ExceptionConfig
 * @since 2019-06-19
 */
@ControllerAdvice
public class ExceptionConfig {
    //1、浏览器客户端返回的都是json
    @ResponseBody
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(Exception e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler({DifferentPasswordException.class, EmptyPasswordException.class, EmptyUsernameException.class, PasswordTooShortException.class, UserNotFoundException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleUserException(Exception e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler({IllegalPhoneNumberException.class})
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public String handleIllegalException(Exception e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler({InnerServiceException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleInnerException(Exception e) {
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler({EmptyFileException.class})
    public String handleBadRequestException(Exception e) {
        return e.getMessage();
    }
}
