package com.rllerena.controller;

import com.rllerena.model.Articulo;
import com.rllerena.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/articulo")
public class ArticuloController {
    @Autowired
    private ArticuloRepository articuloRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Articulo getArticulo(@PathVariable("id") int id) {
        return articuloRepository.getOne(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Articulo> getAll() {
        return articuloRepository.findAll();
    }

    @PostMapping("/create")
    public Articulo createArticulo(@RequestBody Articulo Articulo) {
        return null;
    }

    @PutMapping("/update/{id}")
    public Articulo udpateArticulo(@PathVariable int id, @RequestBody Articulo Articulo) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public Articulo deleteArticulo(@PathVariable int id) {
        return null;
    }
}
