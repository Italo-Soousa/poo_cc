package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class tipo {
	// Prioporiedades da classe 
	private String descricao = "";
	

	public tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	// Metodos construtures

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public static Collection<tipo> getTodos() throws Exception {
		ArrayList<tipo> colecao = new ArrayList<tipo>();
		
		colecao.add(new tipo("Livro"));
		colecao.add(new tipo("Eletronico"));
		colecao.add(new tipo("Alimentaçao"));
		colecao.add(new tipo("Brinquedo"));
		colecao.add(new tipo("Eletrodomestico"));
		
		return colecao;
	}
	
}
