package ex9;

public class PessoaMainA {

public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.nome = "João";
		p1.cpf = 13664985162l;
		p1.dnasc = "15/05/1984";
		
		p2.nome = "Cleiton";
		p2.cpf = 16455897854l;
		p2.dnasc = "22/08/1975";
		
		p3.nome = "Márcia";
		p3.cpf = 33659874512l;
		p3.dnasc = "02/02/1995";
		
		System.out.println("A pessoa " + p1.nome + " tem o cpf nº " + p1.cpf + " e nasceu em " + p1.dnasc);
		System.out.println("A pessoa " + p2.nome + " tem o cpf nº " + p2.cpf + " e nasceu em " + p2.dnasc);
		System.out.println("A pessoa " + p3.nome + " tem o cpf nº " + p3.cpf + " e nasceu em " + p3.dnasc);

	}
	
}
