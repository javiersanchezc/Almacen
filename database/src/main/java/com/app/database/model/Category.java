package com.app.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "Category")
public class Category {
    @Id
    private int categoryID;
    private String categoryName;
    private String description;

    // Getters y setters aquí
}
