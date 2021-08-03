package com.training.spring.rest.error;

import java.util.List;

public class ErrorObj {

    private List<ErrorObj> subErrors;
    private String         msg;
    private int            cause;

    public List<ErrorObj> getSubErrors() {
        return this.subErrors;
    }

    public void setSubErrors(final List<ErrorObj> subErrorsParam) {
        this.subErrors = subErrorsParam;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msgParam) {
        this.msg = msgParam;
    }

    public int getCause() {
        return this.cause;
    }

    public void setCause(final int causeParam) {
        this.cause = causeParam;
    }


}
