package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Categoria;
import model.Produto;

public class CategoriaDao {
	
	EntityManager em;
	
	public CategoriaDao () {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo");
		em = emf.createEntityManager();		
	}
	
	public Categoria insertCategoria(Categoria categoria) {
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		return categoria;
	}
	

}
