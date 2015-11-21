package com.droidbots.bulletin.info;

import java.util.List;

/**
 * Created by Ashish on 11/21/2015.
 */
public class EventInfo {
    String mName,mDescription,mDate,mVenue,mRegistrationLink,mPostedBy;
    List<String> mComments,mQueries;
    public EventInfo(){

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

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmVenue() {
        return mVenue;
    }

    public void setmVenue(String mVenue) {
        this.mVenue = mVenue;
    }

    public String getmRegistrationLink() {
        return mRegistrationLink;
    }

    public void setmRegistrationLink(String mRegistrationLink) {
        this.mRegistrationLink = mRegistrationLink;
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
