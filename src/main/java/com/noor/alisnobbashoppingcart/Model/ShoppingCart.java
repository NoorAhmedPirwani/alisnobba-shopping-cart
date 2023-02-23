package com.noor.alisnobbashoppingcart.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="alisnobba-shopping-cart")

public class ShoppingCart {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;

    @Setter
    private long productId;
    
    @Setter
    private long quantity;

    @Setter
    private long totalPrice;

       public ShoppingCart() {

    }

        public ShoppingCart(long productId, long quantity, long totalPrice) 
    {
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;

    } 
}