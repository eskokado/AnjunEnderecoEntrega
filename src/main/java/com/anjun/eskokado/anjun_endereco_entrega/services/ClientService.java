package com.anjun.eskokado.anjun_endereco_entrega.services;

import com.anjun.eskokado.anjun_endereco_entrega.domain.Client;
import com.anjun.eskokado.anjun_endereco_entrega.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client findById(Integer id) {
        Client obj = repository.findById(id).get();
        return obj;
    }
}
