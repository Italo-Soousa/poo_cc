package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visao extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new Painel();
	
	// Metodo principal de extencao do programador 
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// metodo contrutor da classe 
	public Visao() {
		// Configuracao da janela
		setTitle("Minha Primeira Janela JAVA !!!");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configuracao do painel
		setContentPane(objPainel);
	}

}
