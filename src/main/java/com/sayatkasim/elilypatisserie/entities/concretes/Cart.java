package com.sayatkasim.elilypatisserie.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private int id;
    private int userId;
    private int productId;
    private int quantity;
}
