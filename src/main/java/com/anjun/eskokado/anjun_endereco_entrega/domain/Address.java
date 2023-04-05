package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String street;

    @Column(length = 30, nullable = false)
    private String number;

    @Column(length = 50)
    private String complement;

    @Column(length = 50, nullable = false)
    private String neighborhood;

    @Column(name = "zip_code", length = 8)
    private String zipCode;

    @ManyToOne()
    private City city;
}
