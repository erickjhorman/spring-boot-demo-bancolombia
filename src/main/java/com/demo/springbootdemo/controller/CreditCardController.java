package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.model.CreditCardDTO;
import com.demo.springbootdemo.serviceimpl.CreditCardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/cards")
public class CreditCardController {

    private final CreditCardServiceImpl creditCardService;
    @GetMapping()
    public ResponseEntity<List<CreditCardDTO>> getCard() {
       return ResponseEntity.ok(creditCardService.getCards());
    }

    /*
    TODO
    - Completar el resto de las operaciones del CRUD, Save, delete and update
     */
}
