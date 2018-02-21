package com.cvsingh.disample.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationRequest {

@SerializedName("noOfRecords")
@Expose
private String noOfRecords;
@SerializedName("offset")
@Expose
private String offset;
@SerializedName("searchText")
@Expose
private String searchText;
@SerializedName("userId")
@Expose
private String userId;

public String getNoOfRecords() {
return noOfRecords;
}

public void setNoOfRecords(String noOfRecords) {
this.noOfRecords = noOfRecords;
}

public String getOffset() {
return offset;
}

public void setOffset(String offset) {
this.offset = offset;
}

public String getSearchText() {
return searchText;
}

public void setSearchText(String searchText) {
this.searchText = searchText;
}

public String getUserId() {
return userId;
}

public void setUserId(String userId) {
this.userId = userId;
}

}