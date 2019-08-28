package com.rllerena.controller;

import com.rllerena.model.Articulo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/articulo")
public class ArticuloController {
    @GetMapping(value = "/one")
    public Articulo getArticulo() {
        return new Articulo();
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
