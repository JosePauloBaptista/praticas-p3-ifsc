package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		ArrayList<Produto> ListaP = new ArrayList<>();
		
		p1.setNome("Livro");
		p1.setCodBarras(111l);
		p1.setPreco(50.00);
		p1.setFornecedor("BraLivros");
		ListaP.add(p1);
		
		p2.setNome("Bicicleta");
		p2.setCodBarras(132l);
		p2.setPreco(839.99);
		p2.setFornecedor("Bracicletas");
		ListaP.add(p2);
		
		p3.setNome("Barrinha de Cereal");
		p3.setCodBarras(332l);
		p3.setPreco(3.50);
		p3.setFornecedor("Brarrinhas");
		ListaP.add(p3);
		
		for (Produto produto : ListaP) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			System.out.println("------------------------------");
		}
		
	}

}
