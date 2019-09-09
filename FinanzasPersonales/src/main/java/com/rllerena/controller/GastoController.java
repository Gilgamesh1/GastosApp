package com.rllerena.controller;

import com.rllerena.model.Gasto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/gasto")
public class GastoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GastoController.class);

    @GetMapping(value = "/one")
    public Gasto getGasto() {
        return new Gasto();
    }

    @PostMapping("/create")
    public Gasto createGasto(@RequestBody Gasto gasto) {
        return null;
    }

    @PutMapping("/update/{id}")
    public Gasto udpateGasto(@PathVariable int id, @RequestBody Gasto gasto) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public Gasto deleteGasto(@PathVariable int id) {
        return null;
    }
}
