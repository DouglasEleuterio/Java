package threeway.projeto.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesBancarias {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacoesBancarias window = new OperacoesBancarias();
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
	public OperacoesBancarias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClienteCorrentista = new JLabel("Cliente:          correntista");
		lblClienteCorrentista.setBounds(12, 12, 548, 15);
		frame.getContentPane().add(lblClienteCorrentista);
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		btnAbrirConta.setBounds(123, 79, 115, 40);
		frame.getContentPane().add(btnAbrirConta);
		
		JButton btnDeposito = new JButton("Deposito");
		btnDeposito.setBounds(250, 79, 115, 40);
		frame.getContentPane().add(btnDeposito);
		
		JButton btnSaque = new JButton("Saque");
		btnSaque.setBounds(377, 79, 115, 40);
		frame.getContentPane().add(btnSaque);
		
		JButton btnTransferncia = new JButton("Transferência");
		btnTransferncia.setBounds(503, 79, 135, 40);
		frame.getContentPane().add(btnTransferncia);
		
		JLabel lblHistricoDeTransao = new JLabel("Histórico de Transação");
		lblHistricoDeTransao.setBounds(12, 157, 197, 15);
		frame.getContentPane().add(lblHistricoDeTransao);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 184, 626, 176);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tipo Transa\u00E7\u00E3o", "Titular/Conta Cr\u00E9dito", "Titular/Conta D\u00E9bito", "Data", "Valor"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(table);
	}
}
