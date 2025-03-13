package Negocio;

public abstract class Drink {
	// Propriedades da classe
	private ingrediente[] colecao = new ingrediente[10];
	private int qtdIngredientes = 0;
	
	// Metodos da classe 
	public void adicionar(ingrediente objIngrediente) {
		colecao[qtdIngredientes] = objIngrediente;
		qtdIngredientes++;
	}
	
	public void beber() {
		for (int i = 0 ; i < qtdIngredientes ; i++) { 
			System.out.println(colecao[i].getUantidade() + " " + colecao[i].getUantidade() + " de " + colecao[i].getNome());
		}
	}
}