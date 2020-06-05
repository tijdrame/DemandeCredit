package com.boa.api.response;



public class Data {

private Boolean success;
private Body body;
private Integer code;

public Boolean getSuccess() {
return success;
}

public void setSuccess(Boolean success) {
this.success = success;
}

public Body getBody() {
return body;
}

public void setBody(Body body) {
this.body = body;
}

public Integer getCode() {
return code;
}

public void setCode(Integer code) {
this.code = code;
}

    @Override
    public String toString() {
        return "{" +
            " success='" + success + "'" +
            ", body='" + body + "'" +
            ", code='" + code + "'" +
            "}";
    }

}