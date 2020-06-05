package com.boa.api.response;

public class CheckFactoryRequest {

    private Data data;
    
    public Data getData() {
    return data;
    }
    
    public void setData(Data data) {
    this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            "}";
    }
    
    }