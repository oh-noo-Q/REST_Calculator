package com.example.resthomework;

public class InvalidResult implements IResult {

    private final String errMsg;

    public InvalidResult(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String getResult() {
        return errMsg;
    }
}
