package com.example.HolaSpring.repository;

import com.example.HolaSpring.dto.Carro;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroRepository {
    //inyecta dependencia de la bd

    public List<Carro> getCarros(){
        List carros = new ArrayList<>();
        carros.add(Carro.builder()
                .modelo(2011)
                .Marca("Chevrolet")
                .color("Negro").build());
        carros.add(Carro.builder().color("Rojo")
                .Marca("Nissan")
                .modelo(2020).build());
        carros.add(Carro.builder().color("Rojo")
                .Marca("Chevrolet")
                .modelo(2020).build());
        return carros;
    }
}
