package com.cvsingh.disample.model.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationModel {

@SerializedName("notificationTxnId")
@Expose
private Integer notificationTxnId;
@SerializedName("notificationTypeId")
@Expose
private Integer notificationTypeId;
@SerializedName("notifiedByUserId")
@Expose
private Integer notifiedByUserId;
@SerializedName("notifiedByUserName")
@Expose
private String notifiedByUserName;
@SerializedName("notifiedByUserPicture")
@Expose
private String notifiedByUserPicture;
@SerializedName("notificationReadFl")
@Expose
private String notificationReadFl;
@SerializedName("notificationFeedId")
@Expose
private Integer notificationFeedId;
@SerializedName("notificationFeedText")
@Expose
private String notificationFeedText;
@SerializedName("notificationDateTime")
@Expose
private String notificationDateTime;
@SerializedName("notificationFeedTextArray")
@Expose
private List<NotificationFeedTextArray> notificationFeedTextArray = null;

public Integer getNotificationTxnId() {
return notificationTxnId;
}

public void setNotificationTxnId(Integer notificationTxnId) {
this.notificationTxnId = notificationTxnId;
}

public Integer getNotificationTypeId() {
return notificationTypeId;
}

public void setNotificationTypeId(Integer notificationTypeId) {
this.notificationTypeId = notificationTypeId;
}

public Integer getNotifiedByUserId() {
return notifiedByUserId;
}

public void setNotifiedByUserId(Integer notifiedByUserId) {
this.notifiedByUserId = notifiedByUserId;
}

public String getNotifiedByUserName() {
return notifiedByUserName;
}

public void setNotifiedByUserName(String notifiedByUserName) {
this.notifiedByUserName = notifiedByUserName;
}

public String getNotifiedByUserPicture() {
return notifiedByUserPicture;
}

public void setNotifiedByUserPicture(String notifiedByUserPicture) {
this.notifiedByUserPicture = notifiedByUserPicture;
}

public String getNotificationReadFl() {
return notificationReadFl;
}

public void setNotificationReadFl(String notificationReadFl) {
this.notificationReadFl = notificationReadFl;
}

public Integer getNotificationFeedId() {
return notificationFeedId;
}

public void setNotificationFeedId(Integer notificationFeedId) {
this.notificationFeedId = notificationFeedId;
}

public String getNotificationFeedText() {
return notificationFeedText;
}

public void setNotificationFeedText(String notificationFeedText) {
this.notificationFeedText = notificationFeedText;
}

public String getNotificationDateTime() {
return notificationDateTime;
}

public void setNotificationDateTime(String notificationDateTime) {
this.notificationDateTime = notificationDateTime;
}

public List<NotificationFeedTextArray> getNotificationFeedTextArray() {
return notificationFeedTextArray;
}

public void setNotificationFeedTextArray(List<NotificationFeedTextArray> notificationFeedTextArray) {
this.notificationFeedTextArray = notificationFeedTextArray;
}

}