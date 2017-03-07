package threeway.projeto.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.BoxLayout;


public class SistemaDeGerenciamentoDeBanco {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					SistemaDeGerenciamentoDeBanco window = new SistemaDeGerenciamentoDeBanco();
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
	public SistemaDeGerenciamentoDeBanco() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBanco = new JLabel("Banco:          Banco Java Brasil");
		lblBanco.setBounds(12, 12, 218, 15);
		frame.getContentPane().add(lblBanco);
		
		JLabel lblAgencia = new JLabel("Agência:      3way NetWorks!");
		lblAgencia.setBounds(12, 31, 218, 15);
		frame.getContentPane().add(lblAgencia);
		
		JButton btnManterClientes = new JButton("Manter Clientes");
		btnManterClientes.setFont(new Font("Dialog", Font.BOLD, 12));
		btnManterClientes.setBounds(12, 65, 200, 25);
		frame.getContentPane().add(btnManterClientes);
		
		JButton btnOperaesBancrias = new JButton("Operações Bancárias");
		btnOperaesBancrias.setEnabled(false);
		btnOperaesBancrias.setFont(new Font("Dialog", Font.BOLD, 12));
		btnOperaesBancrias.setBounds(236, 65, 200, 25);
		frame.getContentPane().add(btnOperaesBancrias);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 100, 676, 372);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	}
}
