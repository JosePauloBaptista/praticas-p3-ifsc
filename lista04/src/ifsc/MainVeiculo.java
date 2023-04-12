package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		v1.setNome("Nissan Datsun 240Z");
		v1.setAno(1970);
		v1.setFabricante("Nissan");
		v1.setNrodas(4);
		v1.setCor("Preto");
		veiculos.add(v1);
		
		v2.setNome("Chevrolet Camaro SS");
		v2.setAno(1968);
		v2.setFabricante("Chevrolet");
		v2.setNrodas(4);
		v2.setCor("Azul");
		veiculos.add(v2);
		
		v3.setNome("Dodge Challenger SRT Demon");
		v3.setAno(2018);
		v3.setFabricante("Dodge");
		v3.setNrodas(4);
		v3.setCor("Vermelho");
		veiculos.add(v3);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println("---------------------------------");
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNrodas());
			System.out.println(veiculo.getCor());
		}
		
	}

}
