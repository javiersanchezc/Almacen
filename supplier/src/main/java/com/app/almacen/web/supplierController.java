package com.app.almacen.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class supplierController {

    @GetMapping("/api/supplier")
    public String getSupplier(){
        return "proveedores";
    }
}
