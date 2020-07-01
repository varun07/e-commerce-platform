package com.ayuva.ecommerce.personalCatalog.interfaces;

import com.ayuva.ecommerce.personalCatalog.model.CatalogItem;

public interface IPersonalCatalog {
  public CatalogItem addCatalogItem(CatalogItem item);

  public CatalogItem removeCatalogItem(CatalogItem item);

  public CatalogItem[] all();
}