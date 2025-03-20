package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		// Ceu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1024, 500);
		
		// Grama
		g.setColor(Color.green);
		g.fillRect(0, 500, 1024, 268);
		
		// Sol
		g.setColor(Color.YELLOW);
		g.fillOval(870, 80, 80, 80);	
		
		// Rodela do sol
		g.setColor(Color.orange);
		g.fillOval(851, 50, 120, 120);
		
		// Frente da casa 
		g.setColor(Color.black);
		g.drawRect(100, 580, 50, 100);
		
		// Telhado
		g.drawLine(100, 580, 125, 540);
		g.drawLine(150, 580, 125, 540);
		
		
		// Lateral casa
		g.drawLine(150, 680, 300, 630);
		g.drawLine(300, 530, 300, 630);
		g.drawLine(150, 580, 300, 530);
		
		// Telhado da lateral da casa
		g.drawLine(300, 530, 270, 490);
		g.drawLine(125, 530, 270, 490);
		
		// Boneco cabeçudo
		g.setColor(Color.red);
		g.fillOval(650, 600, 20, 20);
		g.drawLine(660, 620, 660, 670); // tronco
		g.drawLine(630, 630, 690, 630); // braçp
		g.drawLine(660, 670, 630, 700);
		g.drawLine(660, 670, 690, 700);
		
		
		
		
	}
}
