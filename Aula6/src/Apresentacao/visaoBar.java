package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio.Drink;
import Negocio.DryMartine;
import Negocio.Mixer;
import Negocio.MoscowMule;
import Negocio.OldFashion;
import Negocio.caipirinha;

public class visaoBar {
	public static void main(String[] args) {
		// Declaracao de variaveis 
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Drink objDrink = null;
		int opcao = 0;
		
		try {
			System.out.println("+===============+");
			System.out.println("   Cardapio     +");
			System.out.println("+===============+");
			System.out.println("+ 1 - Caipirinha+");
			System.out.println(" 2 - Dry Martini ");
			System.out.println(" 3 - Old Fashion ");
			opcao = Integer.parseInt(leitor.readLine());
			
			switch (opcao) {
			case 1:
				objDrink = new caipirinha();
				break;
			case 2:
				objDrink = new OldFashion();
				break;
			case 3:
				objDrink = new MoscowMule();
				break;
			case 4:
				objDrink = new DryMartine();
			}
			((Mixer) objDrink).misturar();
			objDrink.beber();
		} catch (Exception erro) {
			System.out.println("Chega de beber ! Va para casa !");
		}
	}

}
