package com.cvsingh.disample.api;

import com.cvsingh.disample.model.CommonResponse;
import com.cvsingh.disample.model.request.NotificationRequest;
import com.cvsingh.disample.model.response.NotificationModel;
import com.cvsingh.disample.utils.Constants;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Notification;
import rx.Observable;

/**
 * Created by audax on 01-02-2018.
 */

public interface ApiService {

    @POST(Constants.END_POINT+"notification/getNotifications")
    Observable<CommonResponse<List<NotificationModel>>> getNotificationList(@Body NotificationRequest request);
}
