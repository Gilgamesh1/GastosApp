package com.rllerena.controller;

import com.rllerena.exception.NotFoundException;
import com.rllerena.model.Boleta;
import com.rllerena.repository.BoletaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/boleta")
public class BoletaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoletaController.class);
    @Autowired
    private BoletaRepository boletaRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Boleta getBoleta(@PathVariable("id") int id) {
        LOGGER.info("BoletaController - getBoleta");
        return boletaRepository.findById(id).orElseThrow(() -> new NotFoundException("No se encontraron datos"));
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> createBoleta(@RequestBody Boleta boleta) {
        LOGGER.info("BoletaController - createBoleta");
        Boleta boleta1 = new Boleta();
        boleta1.setNumero(boleta.getNumero());
        boleta1.setSerie(boleta.getSerie());
        boleta1.setArchivo(boleta.getArchivo());
        boletaRepository.save(boleta1);
        if (boleta1.getId() != 0) {
            return ResponseEntity.ok().body(boleta1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/update/{id}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> udpateBoleta(@PathVariable("id") int id, @RequestBody Boleta boleta) {
        LOGGER.info("BoletaController - udpateBoleta");
        Optional<Boleta> boletaOptional = boletaRepository.findById(id);
        if (boletaOptional.isPresent()) {
            boletaOptional.get().setNumero(boleta.getNumero());
            boletaOptional.get().setSerie(boleta.getSerie());
            boletaOptional.get().setArchivo(boleta.getArchivo());
            Boleta bo = boletaRepository.save(boletaOptional.get());
            return ResponseEntity.ok().body(bo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> deleteBoleta(@PathVariable int id) {
        LOGGER.info("BoletaController - deleteBoleta");
        Optional<Boleta> boletaOptional = boletaRepository.findById(id);
        if (boletaOptional.isPresent()) {
            boletaRepository.delete(boletaOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
