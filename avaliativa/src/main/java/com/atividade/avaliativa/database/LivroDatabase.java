package com.atividade.avaliativa.database;

import com.atividade.avaliativa.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDatabase {
    private List<Livro> livros;

    public LivroDatabase() {
        this.livros = new ArrayList<>();
    }

    public void insert(Livro c) {
        livros.add(c);
    }

    public List<Livro> findAll() {
        return new ArrayList<>(livros);
    }

    public boolean update(Livro c) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIdLivro() == c.getIdLivro()) {
                livros.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        return livros.removeIf(c -> c.getIdLivro() == id);
    }
}
