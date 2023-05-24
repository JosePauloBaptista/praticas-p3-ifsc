package Controle;

import java.util.ArrayList;
import Modelo.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> lista;

	public ProdutoDAO() {
		lista = new ArrayList<>();
	}

	public Boolean inserir(Produto p1) {
		lista.add(p1);
		return true;
	}

	public Boolean alterar(Produto produtoDadosNovos) {
		for (Produto produto : lista) {
			if (produto.getCodBarras() == produtoDadosNovos.getCodBarras()) {
				produto.setNome(produtoDadosNovos.getNome());
				return true;
			}
		}
		return false;
	}


	public Boolean excluir(Produto p1Excluir) {
		for (Produto produto : lista) {
			if (produto.getCodBarras() == p1Excluir.getCodBarras()) {
				lista.remove(produto);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Produto> listar() {
		return this.lista;
	}

}
