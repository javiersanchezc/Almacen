package com.app.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Employee")
public class Employee {
    @Id
    private int employeeID;
    private String lastName;
    private String firstName;
    private String title;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String postalCode;
    private String country;
    private String extension;
    private byte[] photo; // 'varbinary(max)' en SQL se mapea a 'byte[]' en Java
    private Integer reportsTo; // Puede ser null

    // Getters y setters aquí
}
