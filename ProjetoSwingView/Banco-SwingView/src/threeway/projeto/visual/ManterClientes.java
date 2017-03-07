package threeway.projeto.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class ManterClientes {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEndereo;
	private JTextField txtRegistroGeral;
	private JTextField txtCpf;
	private JButton btnLimpar;
	private JButton btnSalvar;
	private JButton btnAtualizar;
	private JButton btnExcluir;
	private JLabel lblClientesCadastrados;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					ManterClientes window = new ManterClientes();
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
	public ManterClientes() {

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
		
		JLabel lblCadastrarCliente = new JLabel("Cadastrar Cliente");
		lblCadastrarCliente.setBounds(12, 12, 132, 15);
		frame.getContentPane().add(lblCadastrarCliente);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(255, 255, 204));
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBounds(12, 36, 383, 19);
		frame.getContentPane().add(txtNome);
		txtNome.setText("Nome");
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(416, 36, 222, 19);
		frame.getContentPane().add(txtTelefone);
		txtTelefone.setText("Telefone");
		txtTelefone.setColumns(10);
		
		txtEndereo = new JTextField();
		txtEndereo.setBackground(new Color(255, 255, 255));
		txtEndereo.setForeground(new Color(0, 0, 0));
		txtEndereo.setText("Endereço");
		txtEndereo.setBounds(12, 60, 626, 19);
		frame.getContentPane().add(txtEndereo);
		txtEndereo.setColumns(10);
		
		txtRegistroGeral = new JTextField();
		txtRegistroGeral.setText("Registro Geral");
		txtRegistroGeral.setBounds(12, 83, 245, 19);
		frame.getContentPane().add(txtRegistroGeral);
		txtRegistroGeral.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBackground(new Color(255, 255, 204));
		txtCpf.setText("Cpf");
		txtCpf.setBounds(281, 83, 357, 19);
		frame.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(202, 114, 100, 25);
		frame.getContentPane().add(btnLimpar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(314, 114, 100, 25);
		frame.getContentPane().add(btnSalvar);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setEnabled(false);
		btnAtualizar.setBounds(426, 114, 100, 25);
		frame.getContentPane().add(btnAtualizar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(538, 114, 100, 25);
		frame.getContentPane().add(btnExcluir);
		
		lblClientesCadastrados = new JLabel("Clientes Cadastrados:");
		lblClientesCadastrados.setBounds(12, 169, 197, 15);
		frame.getContentPane().add(lblClientesCadastrados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 194, 626, 166);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Endere\u00E7o", "Telefone", "RG", "CPF"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
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
