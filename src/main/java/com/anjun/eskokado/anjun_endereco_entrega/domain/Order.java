package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    @ManyToOne
    private Client client;

    public Order(LocalDate orderDate, Client client) {
        this.orderDate = orderDate;
        this.client = client;
    }

    public List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        items.stream().map(x -> list.add(x.getProduct()));
        return list;
    }

}
