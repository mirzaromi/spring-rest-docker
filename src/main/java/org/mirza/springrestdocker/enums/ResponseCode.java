package org.mirza.springrestdocker.enums;

public enum ResponseCode {

    POST_NOT_FOUND("4001", "Post Not Found"),
    ;

    private final String code;
    private final String message;

    ResponseCode(String code, String message){
        this.code = code;
        this.message = message;
    }
    public String code(){
        return code;
    }

    public String message(){
        return message;
    }
}
