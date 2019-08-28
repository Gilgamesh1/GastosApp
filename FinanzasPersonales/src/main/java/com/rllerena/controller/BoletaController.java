package com.rllerena.controller;

import com.rllerena.model.Boleta;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/boleta")
public class BoletaController {

    @GetMapping(value = "/one")
    public Boleta getBoleta() {
        return new Boleta();
    }

    @PostMapping("/create")
    public Boleta createBoleta(@RequestBody Boleta Boleta) {
        return null;
    }

    @PutMapping("/update/{id}")
    public Boleta udpateBoleta(@PathVariable int id, @RequestBody Boleta Boleta) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public Boleta deleteBoleta(@PathVariable int id) {
        return null;
    }
}
