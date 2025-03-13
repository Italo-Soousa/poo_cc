package Negocio;

public class OldFashion extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new ingrediente("Whiskey", 200, "ml"));
		super.adicionar(new ingrediente("Gelo", 1, "esfera"));
		super.adicionar(new ingrediente("Açucar", 5, "g"));
		super.adicionar(new ingrediente("Laranja", 1, "casca"));
		super.adicionar(new ingrediente("Bitter", 2, "gotas"));
	}

}
