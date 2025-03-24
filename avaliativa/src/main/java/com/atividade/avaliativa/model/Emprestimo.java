package com.atividade.avaliativa.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {
    private Long idEmprestimo;
    private LocalDate dataInicio;
    private Date dataFim;
    private int livrosEmprestados;
    private String nomeCliente;
}
