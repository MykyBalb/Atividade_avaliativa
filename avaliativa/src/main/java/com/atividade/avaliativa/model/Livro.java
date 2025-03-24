package com.atividade.avaliativa.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    private Long idLivro;
    private String nome;
    private String autor;
    private String genero;
}
