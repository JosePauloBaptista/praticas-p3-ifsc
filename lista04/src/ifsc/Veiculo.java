package ifsc;

public class Veiculo {

	private String nome;
	private Integer ano;
	private Integer nrodas;
	private String Fabricante;
	private String cor;
	
	public Integer getNrodas() {
		return nrodas;
	}
	public void setNrodas(Integer nrodas) {
		this.nrodas = nrodas;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
