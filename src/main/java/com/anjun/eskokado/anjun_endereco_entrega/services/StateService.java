package com.anjun.eskokado.anjun_endereco_entrega.services;

import com.anjun.eskokado.anjun_endereco_entrega.domain.State;
import com.anjun.eskokado.anjun_endereco_entrega.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository repository;

    public State findByCode(String code) {
        State obj = repository.findByCode(code);
        return obj;
    }

    public List<State> findByName(String name) {
        List<State> list = repository.findByName(name);
        return list;
    }

    public State findById(Integer id) {
        State obj = repository.findById(id).get();
        return obj;
    }
}
