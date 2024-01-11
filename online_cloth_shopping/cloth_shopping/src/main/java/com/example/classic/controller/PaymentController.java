package com.example.classic.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classic.model.Payment;
import com.example.classic.service.PaymentService;

@RestController
@CrossOrigin
public class PaymentController {

    @Autowired
    PaymentService paymentService;

//  *********************************************************************************
//  http://localhost:8082/api/v1/payments/date
    @GetMapping("/payments/{date}")
    public ResponseEntity<List<Payment>> getByDate(@PathVariable(name = "date") String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = null;
        try {
            date1 = dateFormat.parse(date);
        } catch (ParseException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        List<Payment> payments = paymentService.searchByPaymentDate(date1);
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }


}
