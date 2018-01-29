
package com.assignment.businessboomertask.products.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class _links {

    @SerializedName("first")
    private First mFirst;
    @SerializedName("last")
    private Last mLast;
    @SerializedName("next")
    private Next mNext;
    @SerializedName("self")
    private Self mSelf;

    public First getFirst() {
        return mFirst;
    }

    public void setFirst(First first) {
        mFirst = first;
    }

    public Last getLast() {
        return mLast;
    }

    public void setLast(Last last) {
        mLast = last;
    }

    public Next getNext() {
        return mNext;
    }

    public void setNext(Next next) {
        mNext = next;
    }

    public Self getSelf() {
        return mSelf;
    }

    public void setSelf(Self self) {
        mSelf = self;
    }

}
