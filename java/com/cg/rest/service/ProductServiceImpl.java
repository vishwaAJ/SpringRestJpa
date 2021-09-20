package com.cg.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.Product;
import com.cg.rest.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pDao;

	@Override
	public Product findProduct(Integer prodId) {
		// TODO Auto-generated method stub
		return pDao.findProduct(prodId);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pDao.getAllProducts();
	}

	
	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return pDao.addProduct(prod);
	}

	@Override
	public Product updateProduct(Product prod) {
		// TODO Auto-generated method stub
		return pDao.updateProduct(prod);
	}

	@Override
	public Product deleteProduct(Product prod) {
		// TODO Auto-generated method stub
		return pDao.deleteProduct(prod);
	}

}
