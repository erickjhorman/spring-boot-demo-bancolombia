package com.demo.springbootdemo.serviceimpl;

import com.demo.springbootdemo.mapper.CreditCardMapper;
import com.demo.springbootdemo.model.CreditCardDTO;
import com.demo.springbootdemo.service.CreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl {

    private final CreditCardRepository creditCardRepository;
    private final CreditCardMapper creditCardMapper;

    public List<CreditCardDTO> getCards() {
        return creditCardRepository.findAll()
                .stream()
                .map(creditCardMapper::entityToDTO)
                .toList();
    }
}
