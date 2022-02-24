package com.example.HolaSpring.controller;

import com.example.HolaSpring.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carro")
@AllArgsConstructor
public class CarroController {
    CarroService carroService;

    @GetMapping("/get")
    public ResponseEntity<List<String>> getCarrros(){
        List carros = carroService.getMarcaCarros();
        if (carros.isEmpty()){
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(carros);
    }
}
