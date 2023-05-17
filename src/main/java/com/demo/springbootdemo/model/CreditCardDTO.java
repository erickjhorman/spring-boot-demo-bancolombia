package com.demo.springbootdemo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreditCardDTO {

    private String id;
    public String amount;

}
