package com.rllerena.controller;

import com.rllerena.model.Categoria;
import com.rllerena.model.Gasto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/one")
    public Categoria getCategoria() {
        return new Categoria();
    }

    @PostMapping("/create")
    public Categoria createCategoria(@RequestBody Categoria Categoria) {
        return null;
    }

    @PutMapping("/udpate/{id}")
    public Categoria udpateCategoria(@PathVariable int id, @RequestBody Categoria Categoria) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public Categoria deleteCategoria(@PathVariable int id) {
        return null;
    }
}