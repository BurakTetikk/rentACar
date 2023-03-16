package com.brkttk.rentACar.core.utilities.results;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(Object data) {
        super(data, false);
    }

    public ErrorDataResult(Object data, String message) {
        super(data, false, message);
    }
}
