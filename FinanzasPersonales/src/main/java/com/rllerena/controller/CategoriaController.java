package com.rllerena.controller;

import com.rllerena.exception.NotFoundException;
import com.rllerena.model.Categoria;
import com.rllerena.model.Gasto;
import com.rllerena.repository.CategoriaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.xml.ws.Response;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriaController.class);
    @Autowired
    private CategoriaRepository categoriaRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Categoria getCategoria(@PathVariable("id") int id) {
        LOGGER.info("CategoriaController - getCategoria");
        return categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Elemento no encontrado"));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categoria> findAll() {
        LOGGER.info("CategoriaController - findAll");
        return categoriaRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        LOGGER.info("CategoriaController - createCategoria");
        return categoriaRepository.save(categoria);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Categoria udpateCategoria(@PathVariable int id, @RequestBody Categoria categoria) {
        LOGGER.info("CategoriaController - udpateCategoria");
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        categoriaOptional.ifPresent(categoriaDb -> {
            categoriaDb.setDescripcion(categoria.getDescripcion());
            categoriaDb.setUpdatedAt(new Date());
            categoriaRepository.save(categoriaDb);
        });
        return null;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteCategoria(@PathVariable int id) {
        LOGGER.info("CategoriaController - deleteCategoria");
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()) {
            categoriaRepository.delete(categoriaOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}