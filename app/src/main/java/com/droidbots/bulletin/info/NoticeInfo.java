package com.droidbots.bulletin.info;

import java.util.List;

/**
 * Created by Ashish on 11/21/2015.
 */
public class NoticeInfo {
    String mName,mDescription,mId,mPostedBy;
    List<String> mComments,mQueries;
    public NoticeInfo(){

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }


    public List<String> getmComments() {
        return mComments;
    }

    public void setmComments(List<String> mComments) {
        this.mComments = mComments;
    }

    public List<String> getmQueries() {
        return mQueries;
    }

    public void setmQueries(List<String> mQueries) {
        this.mQueries = mQueries;
    }
}
