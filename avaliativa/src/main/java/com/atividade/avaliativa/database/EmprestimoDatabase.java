package com.atividade.avaliativa.database;

import com.atividade.avaliativa.model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDatabase {
    private List<Emprestimo> emprestimos;

    public EmprestimoDatabase() {
        this.emprestimos = new ArrayList<>();
    }

    public void insert(Emprestimo c) {
        emprestimos.add(c);
    }

    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimos);
    }

    public boolean update(Emprestimo c) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getIdEmprestimo() == c.getIdEmprestimo()) {
                emprestimos.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        return emprestimos.removeIf(c -> c.getIdEmprestimo() == id);
    }
}
