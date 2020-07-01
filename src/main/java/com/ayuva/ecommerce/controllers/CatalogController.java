package com.ayuva.ecommerce.controllers;

import com.ayuva.ecommerce.personalCatalog.model.CatalogItem;
import com.ayuva.ecommerce.personalCatalog.services.CartCatalog;
import com.ayuva.ecommerce.requestModels.AddCartModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

  @Autowired
  private CartCatalog cartCatalog;


  @PostMapping("/cart/add")
  @ResponseStatus(HttpStatus.CREATED)
  public CatalogItem addItemToCart(@RequestBody AddCartModel cartItem) {
    CatalogItem item = new CatalogItem();
    item.id = cartItem.id;
    item.name = "Product - " + cartItem.id;
    item.sellerId = "cc seller";
    cartCatalog.addCatalogItem(item);
    return item;
  }


  @GetMapping("/cart")
  public CatalogItem[] allCartItems() {
    return cartCatalog.all();
  }
  
}