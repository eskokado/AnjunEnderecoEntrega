package com.anjun.eskokado.anjun_endereco_entrega.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tests")
public class TestResource {
    @GetMapping
    public String test()
    {
        return "REST está funcionando!";
    }
}