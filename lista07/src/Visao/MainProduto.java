package Visao;

import java.util.ArrayList;

import Controle.ProdutoDAO;
import Modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.setNome("Barra de Chocolate");
		p1.setCodBarras(13645212l);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p1);
		
		ArrayList<Produto> listar = dao.listar();
		for(Produto produto : listar) {
			System.out.println(produto.getNome());
		}
		
		p1.setNome("Barra de Chocolate com Amendoíns");
		dao.alterar(p1);
		for(Produto produto : listar) {
			System.out.println(produto.getNome());
		}
		
		dao.excluir(p1);
		for(Produto produto : listar) {
			System.out.println(produto.getNome());
		}
		
		System.out.println(dao.listar());
		
		
	}

}
