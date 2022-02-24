package com.example.HolaSpring.service;

import com.example.HolaSpring.dto.Carro;
import com.example.HolaSpring.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarroService {
    CarroRepository carroRepository;

    public List<Carro> getMarcaCarrosCompleto(){
        return carroRepository.getCarros();
    }
    public List<String> getMarcaCarros(){
        return carroRepository.getCarros()
                .stream()
                .filter(carro -> carro.getMarca().equals("Chevrolet"))
                .map(carro -> carro.getMarca())
                .collect(Collectors.toList());
    }
}
