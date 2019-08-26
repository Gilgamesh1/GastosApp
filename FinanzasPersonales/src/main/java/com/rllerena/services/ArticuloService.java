package com.rllerena.services;

import com.rllerena.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;
}
