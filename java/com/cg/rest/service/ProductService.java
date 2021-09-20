package com.cg.rest.service;

import java.util.List;

import com.cg.rest.Product;

public interface ProductService {

	Product findProduct(Integer prodId);

	List<Product> getAllProducts();

	Product addProduct(Product prod);

	Product updateProduct(Product prod);

	Product deleteProduct(Product prod);


}
