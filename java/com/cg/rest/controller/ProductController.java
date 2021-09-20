package com.cg.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.Product;
import com.cg.rest.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController {
	@Autowired
	private ProductService pService;

	@GetMapping("/find/{prodid}")
	public ResponseEntity<Product> findProduct(@PathVariable("prodid") Integer prodId){
		System.out.println("finding product id :" +prodId);
		Product prod = pService.findProduct(prodId);
//				new Product(1234,"MAC os", 1, 60000, LocalDate.of(2021, 9, 15) );
		return new ResponseEntity<Product>(prod, HttpStatus.OK);
	}
	@GetMapping("/findall")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> pd = pService.getAllProducts(); 
		return new ResponseEntity<List<Product>>(pd,HttpStatus.OK);
		
	}
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product prod){
		Product prod1 = pService.addProduct(prod);
		return new ResponseEntity<Product>(prod1, HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Product>updateProduct(@RequestBody Product prod){
		Product prod1 = pService.updateProduct(prod);
		return new ResponseEntity<Product>(prod1, HttpStatus.OK);
		
	}
	@PostMapping("/delete")
	public ResponseEntity<Product> deleteProduct(@RequestBody Product prod){
		Product prod1 = pService.deleteProduct(prod);
		return new ResponseEntity<Product>(prod1, HttpStatus.OK);
	}
	}


