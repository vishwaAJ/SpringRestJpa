package com.cg.rest.dao;

import java.util.List;

import com.cg.rest.Product;

public interface ProductDao {


	Product updateProduct(Product prod);

	Product findProduct(Integer prodId);

	List<Product> getAllProducts();

	Product addProduct(Product prod);

	Product deleteProduct(Product prod);

}
