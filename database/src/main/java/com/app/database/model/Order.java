package com.app.database.model;


import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderID;

    @Column(name = "CustomerID")
    private int customerID;

    @Column(name = "EmployeeID")
    private int employeeID;

    @Column(name = "OrderDate")
    private Date orderDate;

    @Column(name = "RequiredDate")
    private Date requiredDate;

    @Column(name = "ShippedDate")
    private Date shippedDate;

    @Column(name = "ShipVia")
    private int shipVia;

    @Column(name = "Freight")
    private double freight;

    @Column(name = "ShipName")
    private String shipName;

    @Column(name = "ShipAddress")
    private String shipAddress;

    @Column(name = "ShipCity")
    private String shipCity;

    @Column(name = "ShipRegion")
    private String shipRegion;

    @Column(name = "ShipPostalCode")
    private String shipPostalCode;

    @Column(name = "ShipCountry")
    private String shipCountry;

    // Getters and Setters
}

