package com.demo.springbootdemo.service;

import com.demo.springbootdemo.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
