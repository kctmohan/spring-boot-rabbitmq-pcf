package com.pras.springbootpcfrabbitmqmessageproducer.model;

public class SampleRequest {

    private String userId;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "{ \"userId\" : \"" + getUserId() + "\",\n" +
                "\"password\" : \"" + getPassword() + "\"\n" +
                "}";
    }
}
