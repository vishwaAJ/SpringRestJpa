package com.cg.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.rest.Product;
import com.cg.rest.util.JPAUtil;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Override
	public Product findProduct(Integer prodId) {
		Product prod = null;
		try {
			EntityManager em = JPAUtil.getEntityManager();
			prod = em.find(Product.class, prodId);
			System.out.println("prod..is :" + prod);
		} catch (Exception c) {
			c.printStackTrace();
		}
		return prod;
	}

	@Override
	public List<Product> getAllProducts() {
		EntityManager em = JPAUtil.getEntityManager();
		String query = "select pd from Product pd";// jpql(java persistance query language)(pd is variable can be
													// anything like "monkey" etc..)
		TypedQuery<Product> tquery = em.createQuery(query, Product.class);
		List<Product> prodList = tquery.getResultList();
		return prodList;
	}

	@Override
	public Product addProduct(Product prod) {
		Product prod1 = null;
		try {
			EntityManager em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(prod);
			em.getTransaction().commit();
			prod1 = new Product(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prod1;
	}

	@Override
	public Product updateProduct(Product prod) {
		Product prod1 = null;
		try {
			EntityManager em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			prod1 = em.find(Product.class, prod.getProdId());
			prod1.copy(prod);
			em.merge(prod1);
			em.getTransaction().commit();
			prod1 = new Product(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prod1;
	}

	@Override
	public Product deleteProduct(Product prod) {
		Product prod1 = null;
		try{
		EntityManager em = JPAUtil.getEntityManager();
		prod1 = em.find(Product.class, prod.getProdId());
		em.getTransaction().begin();
		em.remove(prod1);
		em.getTransaction().commit();
		prod1 = new Product(prod);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return prod1;
	}

}
