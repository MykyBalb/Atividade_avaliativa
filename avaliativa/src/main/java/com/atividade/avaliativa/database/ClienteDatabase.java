package com.atividade.avaliativa.database;

import com.atividade.avaliativa.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDatabase {
    private List<Cliente> clientes;

    public ClienteDatabase() {
        this.clientes = new ArrayList<>();
    }

    public void insert(Cliente c) {
        clientes.add(c);
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    public boolean update(Cliente c) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == c.getIdCliente()) {
                clientes.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        return clientes.removeIf(c -> c.getIdCliente() == id);
    }
}
