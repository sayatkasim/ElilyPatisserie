package com.sayatkasim.elilypatisserie.core.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private String id;
    @Column(name="user_first_name")
    private String firstName;
    @Column(name="user_last_name")
    private String lastName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_password")
    private String password;
}
