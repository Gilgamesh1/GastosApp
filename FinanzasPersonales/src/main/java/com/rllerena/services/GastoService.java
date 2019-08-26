package com.rllerena.services;

import com.rllerena.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService {
    @Autowired
    private GastoRepository gastoRepository;
}
