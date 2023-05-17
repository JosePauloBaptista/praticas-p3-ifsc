package ex10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal nP = new Animal();
		nP.nomeCentifico = "Canis lupus familiaris";
		nP.familia = "Canidae";
		nP.reino = "Animalia";
		System.out.println(nP.nomeCentifico);
		System.out.println(nP.familia);
		System.out.println(nP.reino);
		
		String[] vetor = new String[5];
		
		vetor[0] = "Cachorro";
		vetor[1] = "Cão";
		vetor[2] = "Vira-lata";
		vetor[3] = "Cachorro de Rua";
		vetor[4] = "Guapeca";
		
		nP.nomesPopulares = vetor;
		
		System.out.println("-------------------");
		for (int i = 0; i <nP.nomesPopulares.length; i++) {
			System.out.println(nP.nomesPopulares[i]);
		}

	}

}
