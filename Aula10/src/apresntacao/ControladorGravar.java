package apresntacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.tipo;

public class ControladorGravar implements ActionListener {
	
	// Propriedades da classe 
		private JTextField txtNome = null;
		private JTextField txtPreco = null;
		private JComboBox<String> cboTipo = null;
		private JCheckBox chkPerecivel = null;
		private JTextArea txtDetalhamento = null;
		
	// Metodo Constutor cheio	
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo,
				JCheckBox chkPerecivel, JTextArea txtDetalhamento) {
			super();
			this.txtNome = txtNome;
			this.txtPreco = txtPreco;
			this.cboTipo = cboTipo;
			this.chkPerecivel = chkPerecivel;
			this.txtDetalhamento = txtDetalhamento;
		}


	// Metodo implementador da interface
	public void actionPerformed(ActionEvent e) {
		// Criticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatorio");
		}
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo preço obrigatorio");
		}
		try {
			Double.parseDouble(txtPreco.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Cmapo preço deve ser numerioco!");
			return;
		}
		if (cboTipo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo tipo obrigatorio !");
			return;
		}
		
		// Composiçao do objeto
		Produto objProduto = new Produto();
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjtipo(new tipo(cboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(chkPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		JOptionPane.showConfirmDialog(null, "Gravaçao realizada com sucesso");
	}
	

}
