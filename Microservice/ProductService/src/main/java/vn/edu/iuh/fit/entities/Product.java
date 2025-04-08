package vn.edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Product {
    @Id
    private Long id;
}
