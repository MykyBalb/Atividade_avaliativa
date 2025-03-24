package com.atividade.avaliativa.controller;

import com.atividade.avaliativa.database.ClienteDatabase;
import com.atividade.avaliativa.model.Cliente;

import java.util.List;

public class ClienteController {

    ClienteDatabase bcCliente = new ClienteDatabase();

    public void createClient(Cliente c) {
        bcCliente.insert(c);
    }

    public List<Cliente> getAllClients() {
        return bcCliente.findAll();
    }

    public boolean updateClient(Cliente c) {
        return bcCliente.update(c);
    }

    public boolean deleteClient(Long id) {
        return bcCliente.delete(id);
    }
}
