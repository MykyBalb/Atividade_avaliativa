package com.atividade.avaliativa.view;

import com.atividade.avaliativa.controller.EmprestimoController;
import com.atividade.avaliativa.model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class ViewEmprestimo {
    EmprestimoController lc = new EmprestimoController();

    @GetMapping
    public List<Emprestimo> getAll() {
        return lc.getAllLoans();
    }

    @PostMapping
    public void postLoan(@RequestBody Emprestimo l) {
        lc.createLoan(l);
    }

    @PutMapping
    public String putLoan(@RequestBody Emprestimo l) {
        return (lc.updateLoan(l)) ? "Sucesso" : "Erro, usuário não encontrado";
    }

    @DeleteMapping("/{id}")
    public String deleteLoan(@RequestParam Long id) {
        return (lc.deleteLoan(id)) ? "Sucesso" : "Erro, usuário não encontrado";
    }
}
