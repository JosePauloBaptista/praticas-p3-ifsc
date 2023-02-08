package ifsc;

import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
			
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Insira o Nome da Pessoa: ");
		String N = leitura.nextLine();
		System.out.println("Insira a Idade da Pessoa: ");
		String I = leitura.nextLine();
		int Idade = Integer.valueOf(I);
		System.out.println(N + " tem " + Idade + " anos.");
	}

}
