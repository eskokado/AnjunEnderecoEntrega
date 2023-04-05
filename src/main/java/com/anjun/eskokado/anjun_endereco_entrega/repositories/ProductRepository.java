package com.anjun.eskokado.anjun_endereco_entrega.repositories;

import com.anjun.eskokado.anjun_endereco_entrega.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
