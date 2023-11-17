package com.app.almacen.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
@GetMapping("/api/orders")
    public String getAllOrder(){

        return "ordenes";
    }
}
