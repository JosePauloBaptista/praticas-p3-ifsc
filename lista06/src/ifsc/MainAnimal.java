package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		
		c1.setNome("Roger");
		c1.setRaca("Bulldog");
		c1.setComprimento(1.15f);
		c1.setNpatas(4);
		c1.setCor("Marrom Escuro Quase Preto");
		c1.setEcossistema("Casa");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getRaca());
		System.out.println(c1.getComprimento());
		System.out.println(c1.getNpatas());
		System.out.println(c1.getCor());
		System.out.println(c1.getEcossistema());
		c1.late();
		
		System.out.println("============================");
		
		g1.setNome("Carlos");
		g1.setRaca("Russian Blue");
		g1.setComprimento(0.55f);
		g1.setNpatas(4);
		g1.setCor("Cinza");
		g1.setEcossistema("Apartamento");
		
		System.out.println(g1.getNome());
		System.out.println(g1.getRaca());
		System.out.println(g1.getComprimento());
		System.out.println(g1.getNpatas());
		System.out.println(g1.getCor());
		System.out.println(g1.getEcossistema());
		g1.mia();
		
	}

}
