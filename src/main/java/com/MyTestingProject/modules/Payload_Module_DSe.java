package com.MyTestingProject.modules;

import com.MyTestingProject.payload.pojos.ATBBooking;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Payload_Module_DSe {

    ObjectMapper objectMapper;

    public Object CreateObject(String responseLog) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        String JsonString = responseLog;
        ATBBooking atbBooking = objectMapper.readValue(JsonString, ATBBooking.class);
        return atbBooking;
    }
}
