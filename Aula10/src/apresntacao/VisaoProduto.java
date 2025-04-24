package apresntacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.tipo;

public class VisaoProduto extends JFrame {

	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblPreco = new JLabel("Preço");
	private JTextField txtPreco = new JTextField();
	
	private JLabel lblTipo = new JLabel("Tipo");
	private JComboBox<String> cboTipo = new JComboBox<String>();
	
	private JCheckBox chkPerecivel = new JCheckBox("Precicel");

	private JLabel lblDetalhamento = new JLabel("Detalhamento");
	private JTextArea txtDetalhamento = new JTextArea();
	private JScrollPane jspDetalhamento = new JScrollPane(txtDetalhamento);
	
	private JButton bntGravar = new JButton("Gravar");
	private JButton bntLimpar = new JButton("Limpar");
	private JButton bntSair = new JButton("Sair");
	
	// Metodo principal de contrucao da classe 
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	
	// Metodo contrutor da classe
	public VisaoProduto() {
		// Configuracao da janela
		setTitle("Cadastro de produtps");
		setSize(400, 460);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuracao da caixa do nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30 ,365, 20);
		add(txtNome);
		
		// Configuracao da caixa do nome
		lblPreco.setBounds(10, 60, 200, 20);
		add(lblPreco);
		txtPreco.setBounds(10, 80 , 100, 20);
		add(txtPreco);
		
		// Configuracao da combo do tipo
		lblTipo.setBounds(10, 110, 200, 20);
		add(lblTipo);
		cboTipo.setBounds(10, 130 , 150, 20);
		add(cboTipo);
		cboTipo.addItem("--- Selecione o tipo ---");
		
		try {
			for (tipo objtipo : tipo.getTodos()) {
				cboTipo.addItem(objtipo.getDescricao());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		chkPerecivel.setBounds(7, 160, 200, 20);
		add(chkPerecivel);
		
		// Configuracao da descricao do detalhamento
		lblDetalhamento.setBounds(10, 190, 200, 20);
		add(lblDetalhamento);
		jspDetalhamento.setBounds(10, 210 ,360, 150);
		add(jspDetalhamento);
		txtDetalhamento.setLineWrap(true);;
		
		// Botoes 
		bntGravar.setBounds(30, 380, 100, 30);
		add(bntGravar);
		bntGravar.addActionListener(new ControladorGravar(
				txtNome, txtPreco, cboTipo, chkPerecivel, txtDetalhamento));
		
		bntLimpar.setBounds(140, 380, 100, 30);
		add(bntLimpar);
		bntLimpar.addActionListener(new ControladorLimpar(
				txtNome, txtPreco, cboTipo, chkPerecivel, txtDetalhamento));
		
		bntSair.setBounds(250, 380, 100, 30);
		add(bntSair);
		bntSair.addActionListener(new ControladorSair());
		
		
		
	}
}
