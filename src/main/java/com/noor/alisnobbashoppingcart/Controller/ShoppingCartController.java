package com.noor.alisnobbashoppingcart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noor.alisnobbashoppingcart.Model.ShoppingCart;
import com.noor.alisnobbashoppingcart.Repository.IShoppingCartRepository;

@RequestMapping("/shopping")
@CrossOrigin("*")
@RestController


public class ShoppingCartController {

    @Autowired
    private IShoppingCartRepository repo;

    @PostMapping("/add")
    public void AddProduct(@RequestBody ShoppingCart s){
        repo.save(s);
    }

    @GetMapping("/{id}")
    public ShoppingCart getById(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        repo.deleteById(id);
     }

     @DeleteMapping("/all")
     public void deleteAll(){
        repo.deleteAll();
     }
    

    
}
