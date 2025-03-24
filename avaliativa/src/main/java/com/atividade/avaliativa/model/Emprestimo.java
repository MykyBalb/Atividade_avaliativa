package com.atividade.avaliativa.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {
    private Long idEmprestimo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int livrosEmprestados;
    private String nomeCliente;
}
