package com.anjun.eskokado.anjun_endereco_entrega.repositories;

import com.anjun.eskokado.anjun_endereco_entrega.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
