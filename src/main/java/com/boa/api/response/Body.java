package com.boa.api.response;

public class Body {

    private String referenceID;
    private String designation;
    private String requester;
    private String createdAt;
    private Integer amount;
    
    public String getReferenceID() {
    return referenceID;
    }
    
    public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
    }
    
    public String getDesignation() {
    return designation;
    }
    
    public void setDesignation(String designation) {
    this.designation = designation;
    }
    
    public String getRequester() {
    return requester;
    }
    
    public void setRequester(String requester) {
    this.requester = requester;
    }
    
    public String getCreatedAt() {
    return createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    }
    
    public Integer getAmount() {
    return amount;
    }
    
    public void setAmount(Integer amount) {
    this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" +
            " referenceID='" + referenceID + "'" +
            ", designation='" + designation + "'" +
            ", requester='" + requester + "'" +
            ", createdAt='" + createdAt + "'" +
            ", amount='" + amount + "'" +
            "}";
    }
    
    }