
package com.assignment.businessboomertask.products.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AuthToken {

    @SerializedName("access_token")
    private String mAccessToken;
    @SerializedName("expires_in")
    private Long mExpiresIn;
    @SerializedName("refresh_token")
    private String mRefreshToken;
    @SerializedName("scope")
    private Object mScope;
    @SerializedName("token_type")
    private String mTokenType;

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public Long getExpiresIn() {
        return mExpiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        mExpiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return mRefreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        mRefreshToken = refreshToken;
    }

    public Object getScope() {
        return mScope;
    }

    public void setScope(Object scope) {
        mScope = scope;
    }

    public String getTokenType() {
        return mTokenType;
    }

    public void setTokenType(String tokenType) {
        mTokenType = tokenType;
    }

}
