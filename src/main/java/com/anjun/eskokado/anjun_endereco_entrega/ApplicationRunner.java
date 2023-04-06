package com.anjun.eskokado.anjun_endereco_entrega;

import com.anjun.eskokado.anjun_endereco_entrega.domain.*;
import com.anjun.eskokado.anjun_endereco_entrega.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository produtoRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String...arg0) throws Exception {
        Product p1 = new Product("Notebook", BigDecimal.valueOf(1500.00));
        Product p2 = new Product("Impressora", BigDecimal.valueOf(800.00));
        Product p3 = new Product("Mouse", BigDecimal.valueOf(80.00));

        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        State st1 = new State("Minas Gerais", "MG");
        State st2 = new State("São Paulo", "SP");

        City c1 = new City("Uberlândia", st1);
        City c2 = new City("São Paulo", st2);
        City c3 = new City("Campinas", st2);

        st1.getCities().addAll(Arrays.asList(c1));
        st2.getCities().addAll(Arrays.asList(c2, c3));

        stateRepository.saveAll(Arrays.asList(st1, st2));
        cityRepository.saveAll(Arrays.asList(c1,c2,c3));

        Address add = new Address("Rua Flores", "300", "Apto 203", "Jardim", "38220834", c1);
        Client cli1 = new Client("Maria Silva", "maria@gmail.com", add);

        addressRepository.save(add);
        clientRepository.save(cli1);

        Order order1 = new Order(LocalDate.now(), cli1);
        Order order2 = new Order(LocalDate.now(), cli1);

        orderRepository.saveAll(Arrays.asList(order1, order2));

        OrderItem oi1 = new OrderItem(order1, p1, BigDecimal.ZERO, 1, BigDecimal.valueOf(2000.00));
        OrderItem oi2 = new OrderItem(order1, p3, BigDecimal.ZERO, 1, BigDecimal.valueOf(2000.00));
        OrderItem oi3 = new OrderItem(order1, p2, BigDecimal.valueOf(100.00), 1, BigDecimal.valueOf(800.00));

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3));
    }
}
