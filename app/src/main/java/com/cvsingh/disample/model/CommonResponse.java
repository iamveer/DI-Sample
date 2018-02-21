package com.cvsingh.disample.model;

/**
 * Created by audax on 12-02-2018.
 */

public class CommonResponse<T> {
    int status;
    String statusMessage;

    T notificationList;

    public int getStatus() {
        return status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public T getNotificationList() {
        return notificationList;
    }
}
