package windowsBuilding;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField jTxtNome;
	private JTextField jTxtEmail;
	private JTextField jTxtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
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
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 12, 70, 15);
		frame.getContentPane().add(lblNome);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(80, 10, 293, 19);
		frame.getContentPane().add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(12, 49, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		jTxtEmail = new JTextField();
		jTxtEmail.setBounds(80, 47, 293, 19);
		frame.getContentPane().add(jTxtEmail);
		jTxtEmail.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(12, 87, 70, 15);
		frame.getContentPane().add(lblIdade);
		
		jTxtIdade = new JTextField();
		jTxtIdade.setBounds(80, 85, 293, 19);
		frame.getContentPane().add(jTxtIdade);
		jTxtIdade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtNome.getText());
				cliente.setEmail(jTxtEmail.getText());
				cliente.setIdade(Integer.parseInt(jTxtIdade.getText()));
				try {
					JOptionPane.showMessageDialog(null, cliente.salvar());
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBounds(256, 167, 117, 25);
		frame.getContentPane().add(btnCadastrar);
	}
}
