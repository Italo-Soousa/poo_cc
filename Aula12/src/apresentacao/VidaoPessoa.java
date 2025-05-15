package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VidaoPessoa extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	

	private JLabel lblEndereco = new JLabel("Endereco");
	private JTextField txtEndereco = new JTextField();
	

	private JLabel lblTelefone = new JLabel("Telefone");
	private JTextField txtTelefone = new JTextField();

	private JButton bntGravar = new JButton("Gravar");
	
	
	
	public static void main(String[] args) {
		new VidaoPessoa().setVisible(true);

	}
	
	public VidaoPessoa() {
		// Configuracao da janela 
		setTitle("Cadastro de Pessoa");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuracao do nome 
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 265, 20);
		add(txtNome);
		
		// Configuracao do endereco 
		lblEndereco.setBounds(10, 60, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 80, 265, 20);
		add(txtEndereco);
		
		// Configuracao do telefone 
		lblTelefone.setBounds(10, 110, 200, 20);
		add(lblTelefone);
		txtTelefone.setBounds(10, 130, 265, 20);
		add(txtTelefone);
		
		// Configuracao do botao 
		bntGravar.setBounds(100, 160, 100, 30);
		add(bntGravar);
		bntGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco, txtTelefone));
		
		
		
		
		
	}
}
	
