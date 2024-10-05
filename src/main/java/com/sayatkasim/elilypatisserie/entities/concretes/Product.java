package com.sayatkasim.elilypatisserie.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name="floor_id")
    private Floor floor;
    @ManyToOne
    @JoinColumn(name="cover_id")
    private Cover cover;
}
