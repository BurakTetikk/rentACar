package com.brkttk.rentACar.core.utilities.results;

public class SuccessDataResult<T> extends DataResult{
    public SuccessDataResult(Object data) {
        super(data, true);
    }

    public SuccessDataResult(Object data, String message) {
        super(data, true, message);
    }
}
