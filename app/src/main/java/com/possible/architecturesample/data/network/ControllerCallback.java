package com.possible.architecturesample.data.network;

public class ControllerCallback<T> {
    public void onControllerNext(T t) {}

    public void onControllerComplete() {}

    public void onControllerError(Exception exception) {}
}
