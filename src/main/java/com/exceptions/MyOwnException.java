package com.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MyOwnException extends  Exception {

   public  MyOwnException(String msg){
     this.Message=msg;
    }
    @Override
    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
   @XmlElement
    private String Message;

}
