package com.sayatkasim.elilypatisserie.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="categorys")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private int id;
    @Column(name="category_name")
    private String name;
}
