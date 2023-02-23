package com.noor.alisnobbashoppingcart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.noor.alisnobbashoppingcart.Model.ShoppingCart;

//@SpringBootTest
class AlisnobbaShoppingCartApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void getAndSetID(){
		ShoppingCart cut = new ShoppingCart();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void getAndSetProductID(){
		ShoppingCart cut = new ShoppingCart();
		Long myProductId = 1L;
		cut.setProductId(myProductId);
		assertEquals(myProductId, cut.getProductId());
	}

	@Test
	void getAndSetTotalPrice(){
		ShoppingCart cut = new ShoppingCart();
		Long myTotalPrice = 1L;
		cut.setTotalPrice(myTotalPrice);
		assertEquals(myTotalPrice, cut.getTotalPrice());
	}



}
