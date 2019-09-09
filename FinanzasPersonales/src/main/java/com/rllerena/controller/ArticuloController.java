package com.rllerena.controller;

import com.rllerena.exception.NotFoundException;
import com.rllerena.model.Articulo;
import com.rllerena.model.Categoria;
import com.rllerena.repository.ArticuloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;


@RestController
@RequestMapping(value = "/articulo")
public class ArticuloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArticuloController.class);
    @Autowired
    private ArticuloRepository articuloRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Articulo getArticulo(@PathVariable("id") int id) {
        LOGGER.info("ArticuloController - getArticulo");
        return articuloRepository.findById(id).orElseThrow(() -> new NotFoundException("Elemento no encontrado"));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Articulo> getAll() {
        LOGGER.info("ArticuloController - getAll");
        return articuloRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Articulo createArticulo(@RequestBody Articulo articulo) {
        LOGGER.info("ArticuloController - createArticulo");
        return articuloRepository.save(articulo);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Articulo udpateArticulo(@PathVariable("id") int id, @RequestBody Articulo articulo) {
        LOGGER.info("ArticuloController - udpateArticulo");
        articulo.setId(id);
        return articuloRepository.save(articulo);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteArticulo(@PathVariable int id) {
        LOGGER.info("ArticuloController - deleteArticulo");
        Articulo articulo = articuloRepository.getOne(id);
        articuloRepository.delete(articulo);
    }
}
