package threeway.projeto.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AberturaDeConta {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AberturaDeConta window = new AberturaDeConta();
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
	public AberturaDeConta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAbertura = new JLabel("Abertura:");
		lblAbertura.setBounds(12, 12, 70, 15);
		frame.getContentPane().add(lblAbertura);
		
		textField = new JTextField();
		textField.setEnabled(true);
		textField.setEditable(false);
		textField.setText("04/10/2016   14:31");
		textField.setBounds(138, 10, 150, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumero = new JLabel("Número*:");
		lblNumero.setBounds(12, 39, 70, 15);
		frame.getContentPane().add(lblNumero);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 41, 100, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSaldoInicial = new JLabel("Saldo Inicial:");
		lblSaldoInicial.setBounds(12, 66, 100, 15);
		frame.getContentPane().add(lblSaldoInicial);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(138, 66, 100, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCamposObrigatrios = new JLabel("(*) Campos Obrigatórios");
		lblCamposObrigatrios.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCamposObrigatrios.setBounds(12, 136, 170, 15);
		frame.getContentPane().add(lblCamposObrigatrios);
		
		JLabel lblTipoDeConta = new JLabel("Tipo de Conta");
		lblTipoDeConta.setBounds(12, 109, 132, 15);
		frame.getContentPane().add(lblTipoDeConta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(148, 104, 140, 24);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(12, 163, 125, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(163, 163, 125, 50);
		frame.getContentPane().add(btnNewButton_1);
	}
}
