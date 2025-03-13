package Negocio;

public class MoscowMule extends Drink implements Mixer {
	public void misturar() {
		super.adicionar(new ingrediente("Cachaça", 100, "ml"));
		super.adicionar(new ingrediente("Limao", 3, "unidades"));
		super.adicionar(new ingrediente("Açucar", 5, "g"));
		super.adicionar(new ingrediente("Gelo", 8, "pedras"));
		super.adicionar(new ingrediente("Gengibre", 20, "g"));
	}
}
