package com.noor.alisnobbashoppingcart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.alisnobbashoppingcart.Model.ShoppingCart;

public interface IShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

    
}