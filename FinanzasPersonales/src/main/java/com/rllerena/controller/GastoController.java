package com.rllerena.controller;

import com.rllerena.exception.NotFoundException;
import com.rllerena.model.Gasto;
import com.rllerena.repository.GastoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/gasto")
public class GastoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GastoController.class);
    @Autowired
    private GastoRepository gastoRepository;

    @GetMapping(value = "/one")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Gasto getGasto(@PathVariable("id") int id) {
        LOGGER.info("GastoController - getGasto");
        return gastoRepository.findById(id).orElseThrow(() -> new NotFoundException("No se encontraron datos"));
    }

    @RequestMapping(name = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> createGasto(@RequestBody Gasto gasto) {
        LOGGER.info("GastoController - createGasto");
        Gasto gasto1 = new Gasto();
        gasto1.setArticulo(gasto.getArticulo());
        gasto1.setBoleta(gasto.getBoleta());
        gasto1.setFecha(gasto.getFecha());
        gasto1.setGasto(gasto.getGasto());
        gastoRepository.save(gasto1);
        if (gasto1.getId() != 0) {
            return ResponseEntity.ok().body(gasto1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> udpateGasto(@PathVariable int id, @RequestBody Gasto gasto) {
        LOGGER.info("GastoController - udpateGasto");
        Optional<Gasto> gastoOptional = gastoRepository.findById(id);
        if (gastoOptional.isPresent()) {
            gastoOptional.get().setArticulo(gasto.getArticulo());
            gastoOptional.get().setFecha(gasto.getFecha());
            gastoOptional.get().setBoleta(gasto.getBoleta());
            gastoOptional.get().setGasto(gasto.getGasto());
            Gasto gasto1 = gastoRepository.save(gastoOptional.get());
            return ResponseEntity.ok().body(gasto1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> deleteGasto(@PathVariable int id) {
        LOGGER.info("GastoController - deleteGasto");
        Optional<Gasto> gastoOptional = gastoRepository.findById(id);
        if (gastoOptional.isPresent()) {
            gastoRepository.delete(gastoOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
