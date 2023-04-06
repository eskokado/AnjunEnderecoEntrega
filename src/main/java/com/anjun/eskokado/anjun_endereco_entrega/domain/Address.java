package com.anjun.eskokado.anjun_endereco_entrega.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String street;

    @Column(length = 30, nullable = false)
    private String number;

    @Column(length = 50)
    private String complement;

    @Column(length = 50, nullable = false)
    private String neighborhood;

    @Column(name = "zip_code", length = 8, nullable = false)
    private String zipCode;

    @ManyToOne(optional = false)
    private City city;

    public Address(String street, String number, String complement, String neighborhood, String zipCode, City city) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.zipCode = zipCode;
        this.city = city;
    }
}
