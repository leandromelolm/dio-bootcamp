package me.dio.academia.digital.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDTO {

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    private double peso;

    private double altura;
}
