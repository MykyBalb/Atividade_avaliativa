package com.atividade.avaliativa.controller;

import com.atividade.avaliativa.database.EmprestimoDatabase;
import com.atividade.avaliativa.model.Emprestimo;

import java.util.List;

public class EmprestimoController {
    EmprestimoDatabase bcLoan = new EmprestimoDatabase();

    public void createLoan(Emprestimo l) {
        bcLoan.insert(l);
    }

    public List<Emprestimo> getAllLoans() {
        return bcLoan.findAll();
    }

    public boolean updateLoan(Emprestimo l) {
        return bcLoan.update(l);
    }

    public boolean deleteLoan(Long id) {
        return bcLoan.delete(id);
    }
}
