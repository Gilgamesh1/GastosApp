package com.rllerena.controller;

import com.rllerena.exception.NotFoundException;
import com.rllerena.model.Categoria;
import com.rllerena.model.Gasto;
import com.rllerena.repository.CategoriaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.xml.ws.Response;
import java.util.Date;
import java.util.Optional;

import static java.util.Optional.empty;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/one/{id}")
    public Categoria getCategoria(@PathVariable("id") int id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Elemento no encontrado"));
    }

    @PostMapping("/create")
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping("/update/{id}")
    public Categoria udpateCategoria(@PathVariable int id, @RequestBody Categoria categoria) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        categoriaOptional.ifPresent(categoriaDb -> {
            categoriaDb.setDescripcion(categoria.getDescripcion());
            categoriaDb.setUpdatedAt(new Date());
            categoriaRepository.save(categoriaDb);
        });
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategoria(@PathVariable int id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()) {
            categoriaRepository.delete(categoriaOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}