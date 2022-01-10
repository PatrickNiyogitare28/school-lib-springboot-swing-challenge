package org.school.library.utils;

public class APICustomResponse {

    private boolean status;

    private String message;


    public APICustomResponse() {
        super();
    }


    public APICustomResponse(boolean status, String message) {
        super();
        this.status = status;
        this.message = message;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus(){
        return this.status;
    }


}
