package com.ayuva.ecommerce.personalCatalog.services;

import java.util.ArrayList;

import com.ayuva.ecommerce.personalCatalog.interfaces.IPersonalCatalog;
import com.ayuva.ecommerce.personalCatalog.model.CatalogItem;

import org.springframework.stereotype.Component;


@Component
public class CartCatalog implements IPersonalCatalog{
  
  public ArrayList<CatalogItem> items = new ArrayList<>();

  public CatalogItem addCatalogItem(CatalogItem item) {
    items.add(item);
    return item;
  }

  public CatalogItem removeCatalogItem(CatalogItem item) {
    items.remove(item);
    return item;
  }

  public CatalogItem[] all() {
    CatalogItem[] allItems = new CatalogItem[items.size()];
    return items.toArray(allItems);
  }
}