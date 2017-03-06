package lab14;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public final class Janela extends JFrame {
	
	private JLabel jlAgencia;
	private JTextField jtfAgencia;
	private JLabel jlConta;
	private JTextField jtfConta;
	private JSeparator jSeparator01;
	private JLabel jlNome;
	private JTextField jtfNome;
	private JLabel jlEndereco;
	private JTextField jtfEndereco;
	private JLabel jlTelefone;
	private JTextField jtfTelefone;
	private JLabel jlCpf;
	private JTextField jtfCpf;
	private JRadioButton jrbCorrente;
	private JRadioButton jrbPoupanca;
	private ButtonGroup bgContas;
	private JSeparator jSeparator02;
	private JButton jbConsultar;
	private JButton jbAtualizar;
	private JButton jbFechar;

	public Janela() {
		setSize(400, 255);
		setTitle("Linguagem de Programa��o II");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlAgencia = new JLabel("C�digo da Ag�ncia:");
		jlAgencia.setBounds(10, 10, 110, 18);
		add(jlAgencia);
		
		jlConta = new JLabel("N�mero da conta");
		jlConta.setBounds(205, 10, 105, 18);
		add(jlConta);
		
		jtfConta.setBounds(315, 10, 60, 20);
		add(jtfConta);
		
		jSeparator01 = new JSeparator();
		jSeparator01.setBounds(10, 40, 365, 10);
		add(jSeparator01);
		
		jlNome = new JLabel("Nome:");
		jlNome.setBounds(10, 50, 60, 18);
		jlNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlNome);
		
		jtfNome.setBounds(70, 50, 300, 20);
		add(jtfNome);
		
		jlEndereco = new JLabel ("Endere�o");
		jlEndereco.setBounds(10, 75, 60, 18);
		jlEndereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlEndereco);
		
		jtfEndereco.setBounds(75, 75, 300, 20);
		add(jtfEndereco);
		
		jlTelefone = new JLabel ("Telefone:");
		jlTelefone.setBounds(10, 100, 60, 18);
		jlTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlTelefone);
		
		jlTelefone.setBounds(75, 100, 300, 20);
		add(jlTelefone);
		
		jlCpf = new JLabel ("CPF:");
		jlCpf.setBounds(10, 125, 60, 18);
		jlCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlCpf);
		
		jlCpf.setBounds(75, 125, 300, 20);
		add(jlCpf);
		
		jrbCorrente.setBounds(100, 115, 111, 20);
		jrbCorrente.setMnemonic('C');
		jrbCorrente.setSelected(true);
		add(jrbCorrente);
		
		jrbPoupanca.setBounds(225, 150, 118, 20);
		jrbPoupanca.setMnemonic('P');
		jrbPoupanca.setSelected(true);
		add(jrbPoupanca);
		
		bgContas = new ButtonGroup();
		bgContas.add(jrbCorrente);
		bgContas.add(jrbPoupanca);
		
		jSeparator02.setBounds(10, 180, 365, 10);
		add(jSeparator02);

		jbConsultar = new JButton("Consultar");
		jbConsultar.setBounds(35, 190, 100, 23);
		jbConsultar.setMnemonic('S');
		add(jbConsultar);
		
		jbAtualizar = new JButton("Atualizar");
		jbConsultar.setBounds(145, 190, 100, 23);
		jbConsultar.setMnemonic('A');
		jbAtualizar.setEnabled(false);
		add(jbConsultar);
		
		jbFechar = new JButton("Fechar");
		jbFechar.setBounds(225, 190, 100, 23);
		jbFechar.setMnemonic('F');
		add(jbFechar);
	}
	
	public static void main(String args[]) {
		Janela janela = new Janela();
		janela.setVisible(true);
	}
	
	private void centralizar() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension janela = getSize();

		if (janela.height > screen.height) {
			setSize(janela.width, screen.height);
		}

		if (janela.width > screen.width) {
			setSize(screen.width, janela.height);
		}

		setLocation((screen.width - janela.width) / 2,
		(screen.height - janela.height) / 2);
	}
	
	//finalizar isso
}