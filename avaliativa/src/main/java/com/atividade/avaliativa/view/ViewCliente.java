package com.atividade.avaliativa.view;

import com.atividade.avaliativa.controller.ClienteController;
import com.atividade.avaliativa.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ViewCliente {

    ClienteController cc = new ClienteController();

    @GetMapping
    public List<Cliente> getAll() {
        return cc.getAllClients();
    }

    @PostMapping
    public void postClients(@RequestBody Cliente c) {
        cc.createClient(c);
    }

    @PutMapping
    public String putClient(@RequestBody Cliente c) {
        return (cc.updateClient(c)) ? "Sucesso" : "Erro, usuário não encontrado";
    }

    @DeleteMapping("/{id}")
    public String deleteClient(@RequestParam Long id) {
        return (cc.deleteClient(id)) ? "Sucesso" : "Erro, usuário não encontrado";
    }
}
