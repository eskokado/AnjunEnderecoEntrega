package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 100, nullable = false)
    private String name;

    @Column(unique = true, length = 150, nullable = false)
    private String email;

    @ManyToOne(optional = false)
    private Address address;

    public Client(String name, String email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
