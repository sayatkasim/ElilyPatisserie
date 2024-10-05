package com.sayatkasim.elilypatisserie.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="covers")
public class Cover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cover_id")
    private int id;
    @Column(name="cover_name")
    private String name;
}
