package ex11;

import java.util.Scanner;

import ex9.Pessoa;

public class PessoaMainB {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 1; i < 4; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Digite o Nome da " + i + "ª Pessoa: ");
			p.nome = leitura.nextLine();
			System.out.println("Digite o Cpf da " + i + "ª Pessoa: ");
			p.cpf = Long.valueOf(leitura.nextLine());
			System.out.println("Digite a Data de Nascimento da " + i + "ª Pessoa: ");
			p.dnasc = leitura.nextLine();
			pessoas[i] = p;
		}
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Nome da " + i + "ª Pessoa: " + pessoas[i].nome);
			System.out.println("Cpf da " + i + "ª Pessoa: " + pessoas[i].cpf);
			System.out.println("Data de Nascimento da " + i + "ª Pessoa: " + pessoas[i].dnasc);
		}
		
	}
}
