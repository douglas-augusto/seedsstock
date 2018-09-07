package jframes;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class AlterarSemente extends JInternalFrame {
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarSemente frame = new AlterarSemente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setPosition(){
		this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
	}

	/**
	 * Create the frame.
	 */
	public AlterarSemente() {
		setTitle("Alterar Semente");
		setBounds(100, 100, 800, 600);
		
		getContentPane().setLayout(null);
		
		JButton botaoFecharAdd = new JButton("Sair");
		botaoFecharAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		botaoFecharAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botaoFecharAdd.setIcon(new ImageIcon(AddSemente.class.getResource("/icons/Delete.png")));
		botaoFecharAdd.setBounds(654, 518, 120, 41);
		getContentPane().add(botaoFecharAdd);
		
		JButton btnSalvar = new JButton("Alterar");
		btnSalvar.setIcon(new ImageIcon(AlterarSemente.class.getResource("/icons/Modify.png")));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalvar.setBounds(10, 518, 120, 41);
		getContentPane().add(btnSalvar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 764, 41);
		getContentPane().add(panel);
		
		JLabel lblBuscar = new JLabel("Pesquisar:");
		lblBuscar.setIcon(new ImageIcon(AlterarSemente.class.getResource("/icons/Search.png")));
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuscar.setBounds(10, 0, 104, 38);
		panel.add(lblBuscar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 11, 630, 20);
		panel.add(textField);
		
		table = new JTable();
		table.setBounds(10, 63, 764, 444);
		getContentPane().add(table);

	}
}
