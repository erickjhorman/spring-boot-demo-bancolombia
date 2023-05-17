package com.demo.springbootdemo.mapper;

import com.demo.springbootdemo.model.CreditCard;
import com.demo.springbootdemo.model.CreditCardDTO;
import org.springframework.stereotype.Component;

@Component
public class CreditCardMapper {

    public CreditCardDTO entityToDTO(CreditCard creditCard) {
        return CreditCardDTO.builder()
                .id(String.valueOf(creditCard.getId()))
                .amount(creditCard.getName())
                .build();
    }
}
