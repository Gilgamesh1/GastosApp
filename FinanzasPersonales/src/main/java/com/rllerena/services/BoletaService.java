package com.rllerena.services;

import com.rllerena.repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;
}
