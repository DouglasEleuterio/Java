package threeway.projeto.visual;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import threeway.projeto.gui.DialogAbrirConta;
import threeway.projeto.gui.DialogTransferencia;
import threeway.projeto.service.ContaService;

public class OperacoesBanco extends JInternalFrame {
	private static Cliente clienteSelecionado;
	private static ContaService contaService;
	private static Conta contaCliente;
	private static JPanel panelDadosConta;
	private static JTextField tfNumeroConta;
	private static JTextField tfDtAbertura;
	private static JTextField tfSaldo;
	private static JButton btnAbrirConta;
	private static JButton btnSaque;
	private static JButton btnDeposito;
	private static JButton btnTransferencia;
	private static Boolean contaCriada = Boolean.FALSE;
	private DialogAbrirConta dialogAbrirConta;
	private DialogTransferencia dialogTransferencia;
	private static JTable tableTransacoes;
	private JPanel panelTransacoes;

	/**
	* Método responsável por inicializar componentes da tela
	*
	*/
	private void initialize() {
		
	setClosable(true);
	setBounds(100, 100, 750, 375);

	setTitle("Operações Bancarias");
	getContentPane().setLayout(null);

	JLabel lblCliente = new JLabel("Cliente:");
	lblCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblCliente.setBounds(13, 25, 46, 23);
	getContentPane().add(lblCliente);

	JLabel lblNomeCliente = new JLabel(clienteSelecionado.getNome());
	lblNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNomeCliente.setBounds(69, 25, 155, 23);
	getContentPane().add(lblNomeCliente);

	panelDadosConta = new JPanel();
	panelDadosConta.setBorder(new TitledBorder(null, "Dados da Conta",TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panelDadosConta.setBounds(234, 11, 490, 53);
	getContentPane().add(panelDadosConta);
	panelDadosConta.setLayout(null);

	JLabel lblNumero = new JLabel("No :");
	lblNumero.setBounds(10, 20, 25, 14);
	panelDadosConta.add(lblNumero);

	tfNumeroConta = new JTextField();
	tfNumeroConta.setEditable(false);
	tfNumeroConta.setBounds(45, 17, 42, 20);
	panelDadosConta.add(tfNumeroConta);
	tfNumeroConta.setColumns(10);

	JLabel lblSaldo = new JLabel("Saldo:");
	lblSaldo.setBounds(361, 20, 36, 14);
	panelDadosConta.add(lblSaldo);

	JLabel lblDataDeAbertura = new JLabel("Data de Abertura:");
	lblDataDeAbertura.setBounds(110, 20, 101, 14);
	panelDadosConta.add(lblDataDeAbertura);

	tfDtAbertura = new JTextField();
	tfDtAbertura.setEditable(false);
	tfDtAbertura.setBounds(221, 17, 125, 20);
	panelDadosConta.add(tfDtAbertura);
	tfDtAbertura.setColumns(10);

	tfSaldo = new JTextField();
	tfSaldo.setEditable(false);
	tfSaldo.setBounds(394, 17, 86, 20);
	panelDadosConta.add(tfSaldo);
	tfSaldo.setColumns(10);

	btnAbrirConta = new JButton("Abrir Conta");
	btnAbrirConta.setBounds(293, 80, 101, 37);
	getContentPane().add(btnAbrirConta);
	
	btnSaque = new JButton("Saque");
	btnSaque.setBounds(504, 80, 90, 37);
	getContentPane().add(btnSaque);

	btnDeposito = new JButton("Deposito");
	btnDeposito.setBounds(404, 80, 90, 37);
	getContentPane().add(btnDeposito);

	btnTransferencia = new JButton("Transferência");
	btnTransferencia.setBounds(604, 81, 120, 36);
	getContentPane().add(btnTransferencia);

	JSeparator separator = new JSeparator();
	separator.setBounds(13, 70, 711, 10);
	getContentPane().add(separator);
	
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(13, 128, 711, 10);
	getContentPane().add(separator_1);

	panelTransacoes = new JPanel();
	panelTransacoes.setBorder(new TitledBorder(null, "Historico de Transa\u00E7\u00F5es",TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panelTransacoes.setBounds(13, 149, 711, 186);
	getContentPane().add(panelTransacoes);

	}
}
