package com.training.spring.rest.error;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ErrorAdvice.class);


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(final IllegalArgumentException exp) {
        ErrorObj errorObjLoc = new ErrorObj();
        errorObjLoc.setMsg(exp.getMessage());
        errorObjLoc.setCause(1001);
        ErrorAdvice.logger.error("[ErrorAdvice][handleException]-> *Error* : " + exp.getMessage(),
                                 exp);
        return errorObjLoc;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(final MethodArgumentNotValidException exp) {
        ErrorAdvice.logger.error("[ErrorAdvice][handleException]-> *Error* : " + exp.getMessage(),
                                 exp);
        ErrorObj rootErrorLoc = new ErrorObj();
        rootErrorLoc.setMsg("Validation Error");
        rootErrorLoc.setCause(1202);
        List<ErrorObj> errorObjsLoc = new ArrayList<>();
        rootErrorLoc.setSubErrors(errorObjsLoc);

        List<ObjectError> allErrorsLoc = exp.getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            ErrorObj errorObjLoc = new ErrorObj();
            errorObjLoc.setMsg(objectErrorLoc.toString());
            errorObjLoc.setCause(1005);
            errorObjsLoc.add(errorObjLoc);
        }
        return rootErrorLoc;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handleException(final Exception exp) {
        ErrorAdvice.logger.error("[ErrorAdvice][handleException]-> *Error* : " + exp.getMessage(),
                                 exp);
        ErrorObj errorObjLoc = new ErrorObj();
        errorObjLoc.setMsg(exp.getMessage());
        errorObjLoc.setCause(2001);
        return errorObjLoc;
    }

}
