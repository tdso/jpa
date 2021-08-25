package main;

import java.math.BigDecimal;

import dao.CategoriaDao;
import dao.ProdutoDao;
import model.Categoria;
import model.Produto;

public class Principal {
	
	
	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		CategoriaDao daoCategoria = new CategoriaDao();
		
		Categoria categoria = new Categoria("Telefonia");
		Produto produto = new Produto("LG K11", "Bateria dura pouco", new BigDecimal(800), categoria);
		daoCategoria.insertCategoria(categoria);
		dao.insertProduto(produto);
		System.out.println("Produto incluido: " + produto);
	}

}
