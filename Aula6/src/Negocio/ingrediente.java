package Negocio;

public class ingrediente {
	//Propriedade da classe 
	private String nome = "";
	private int uantidade = 0;
	private String unidade = "";
	
	public ingrediente() {
		super();
	}
	
	public ingrediente(String nome, int uantidade, String unidade) {
		super();
		this.nome = nome;
		this.uantidade = uantidade;
		this.unidade = unidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUantidade() {
		return uantidade;
	}
	public void setUantidade(int uantidade) {
		this.uantidade = uantidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
