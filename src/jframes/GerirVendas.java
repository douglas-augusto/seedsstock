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

public class GerirVendas extends JInternalFrame {
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerirVendas frame = new GerirVendas();
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
	public GerirVendas() {
		setTitle("Gerenciar Vendas");
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
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(AddSemente.class.getResource("/icons/Save.png")));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalvar.setBounds(10, 518, 120, 41);
		getContentPane().add(btnSalvar);

	}

}
