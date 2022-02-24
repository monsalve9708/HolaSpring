package com.example.HolaSpring.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Carro {
    String color;
    int modelo;
    String Marca;
}
