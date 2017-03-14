package threeway.projeto.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TransferenciaEntreContas {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCorrentista;
	private JLabel lblDadosParTransferencia;
	private JLabel lblNContaDestino;
	private JTextField textField_3;
	private JLabel lblValorDaTransferncia;
	private JTextField textField_4;
	private JLabel lblCamposObrigatrios;
	private JButton btnRealizarTransferncia;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransferenciaEntreContas window = new TransferenciaEntreContas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TransferenciaEntreContas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDadosDaConta = new JLabel("Dados da Conta");
		lblDadosDaConta.setBounds(12, 12, 137, 15);
		frame.getContentPane().add(lblDadosDaConta);
		
		JLabel lblN = new JLabel("Nº:");
		lblN.setBounds(12, 29, 70, 15);
		frame.getContentPane().add(lblN);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("10");
		textField.setBounds(44, 27, 63, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeAbertura = new JLabel("Data de Abertura");
		lblDataDeAbertura.setBounds(119, 27, 137, 15);
		frame.getContentPane().add(lblDataDeAbertura);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("04/10/2013   14:32");
		textField_1.setBounds(256, 25, 131, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(399, 27, 70, 15);
		frame.getContentPane().add(lblSaldo);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("568413.02");
		textField_2.setBounds(455, 25, 85, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTitularDaConta = new JLabel("Titular da Conta:");
		lblTitularDaConta.setBounds(12, 58, 137, 15);
		frame.getContentPane().add(lblTitularDaConta);
		
		txtCorrentista = new JTextField();
		txtCorrentista.setEditable(false);
		txtCorrentista.setText("correntista 2");
		txtCorrentista.setBounds(145, 56, 343, 19);
		frame.getContentPane().add(txtCorrentista);
		txtCorrentista.setColumns(10);
		
		lblDadosParTransferencia = new JLabel("Dados par Transferencia");
		lblDadosParTransferencia.setBounds(12, 97, 202, 15);
		frame.getContentPane().add(lblDadosParTransferencia);
		
		lblNContaDestino = new JLabel("Nº Conta Destino*:");
		lblNContaDestino.setBounds(12, 124, 154, 15);
		frame.getContentPane().add(lblNContaDestino);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 124, 98, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblValorDaTransferncia = new JLabel("Valor da Transferência*:");
		lblValorDaTransferncia.setBounds(12, 151, 172, 15);
		frame.getContentPane().add(lblValorDaTransferncia);
		
		textField_4 = new JTextField();
		textField_4.setBounds(199, 147, 98, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblCamposObrigatrios = new JLabel("(*) Campos Obrigatórios");
		lblCamposObrigatrios.setBounds(359, 151, 179, 15);
		frame.getContentPane().add(lblCamposObrigatrios);
		
		btnRealizarTransferncia = new JButton("Realizar Transferência");
		btnRealizarTransferncia.setBounds(132, 178, 200, 40);
		frame.getContentPane().add(btnRealizarTransferncia);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(340, 178, 200, 40);
		frame.getContentPane().add(btnNewButton);
	}

}
