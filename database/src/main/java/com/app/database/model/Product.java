package com.app.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity

@Getter
@Setter
@Table(name = "Product")
public class Product {
    @Id
    private int productID;
    private int supplierID;
    private int categoryID;
    private String quantityPerUnit;
    private double initPrice; // 'money' en SQL se mapea generalmente a 'double' en Java
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private boolean discontinued; // 'bit' en SQL se mapea a 'boolean' en Java

    // Getters y setters aquí
}
