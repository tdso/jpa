package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produto;

public class ProdutoDao {
	
	EntityManager em;
	
	public ProdutoDao () {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo");
		em = emf.createEntityManager();		
	}
	
	public Produto insertProduto(Produto produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		return produto;
	}
	

}
