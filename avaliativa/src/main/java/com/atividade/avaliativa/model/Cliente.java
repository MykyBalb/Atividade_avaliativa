package com.atividade.avaliativa.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long idCliente;
    private String nome;
    private String cpf;
    private String number;
    private String eMail;
}
