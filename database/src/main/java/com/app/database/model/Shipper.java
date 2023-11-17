package com.app.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Shipper")
public class Shipper {
    @Id
    private int shipperID;
    private String companyName;
    private String phone;

    // Getters y setters aquí
}
