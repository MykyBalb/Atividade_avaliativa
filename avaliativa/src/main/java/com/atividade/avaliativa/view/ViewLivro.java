package com.atividade.avaliativa.view;

import com.atividade.avaliativa.controller.LivroController;
import com.atividade.avaliativa.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class ViewLivro {
    LivroController bc = new LivroController();

    @GetMapping
    public List<Livro> getall() {
        return bc.getAllBooks();
    }

    @PostMapping
    public void postBook(@RequestBody Livro v) {
        bc.createLivro(v);
    }

    @PutMapping
    public String putBook(@RequestBody Livro v) {
        return (bc.updateBook(v)) ? "Sucesso" : "Erro, usuário não encontrado";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@RequestParam Long id) {
        return (bc.deleteBook(id)) ? "Sucesso" : "Erro, usuário não encontrado";
    }
}
