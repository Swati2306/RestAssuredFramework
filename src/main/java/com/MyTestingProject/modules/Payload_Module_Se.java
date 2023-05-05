package com.MyTestingProject.modules;

import com.MyTestingProject.payload.pojos.ATBBooking;
import com.MyTestingProject.payload.pojos.Bookingdates;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Payload_Module_Se {
    ObjectMapper objectMapper;

    public String createPayload() throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        ATBBooking booking = new ATBBooking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice((200));
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Lunch");
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-10-01");
        bookingdates.setCheckout("2022-10-01");
        booking.setBookingdates(bookingdates);
        // Java Object -> Json String ->
        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        return payload;
    }
}
