package com.atividade.avaliativa.controller;

import com.atividade.avaliativa.database.LivroDatabase;
import com.atividade.avaliativa.model.Livro;

import java.util.List;

public class LivroController {
    LivroDatabase bcLivro = new LivroDatabase();

    public void createLivro(Livro v) {
        bcLivro.insert(v);
    }

    public List<Livro> getAllBooks() {
        return bcLivro.findAll();
    }

    public boolean updateBook(Livro v) {
        return bcLivro.update(v);
    }

    public boolean deleteBook(Long id) {
        return bcLivro.delete(id);
    }
}
