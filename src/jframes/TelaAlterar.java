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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class TelaAlterar extends JInternalFrame {
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_6;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterar frame = new TelaAlterar();
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
	public TelaAlterar() {
		setTitle("Alterar Dados");
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 11, 764, 41);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		 JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 10, 41, 17);
        panel.add(lblNome);
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));

        textField = new JTextField();
        textField.setBounds(61, 10, 318, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblEspcie = new JLabel("Esp\u00E9cie:");
        lblEspcie.setBounds(389, 10, 56, 14);
        panel.add(lblEspcie);
        lblEspcie.setFont(new Font("Tahoma", Font.PLAIN, 12));

        textField_1 = new JTextField();
        textField_1.setBounds(450, 10, 304, 20);
        panel.add(textField_1);
        textField_1.setColumns(10);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_1.setBounds(10, 63, 764, 41);
        getContentPane().add(panel_1);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblQuantidade.setBounds(10, 10, 78, 17);
        panel_1.add(lblQuantidade);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(98, 10, 56, 20);
        panel_1.add(textField_2);

        JLabel lblRaridade = new JLabel("Raridade:");
        lblRaridade.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblRaridade.setBounds(175, 10, 65, 14);
        panel_1.add(lblRaridade);

        JRadioButton rdbtnA = new JRadioButton("A");
        rdbtnA.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnA.setBounds(246, 10, 33, 23);
        panel_1.add(rdbtnA);

        JRadioButton rdbtnB = new JRadioButton("B");
        rdbtnB.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnB.setBounds(281, 10, 33, 23);
        panel_1.add(rdbtnB);

        JRadioButton rdbtnC = new JRadioButton("C");
        rdbtnC.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnC.setBounds(316, 10, 33, 23);
        panel_1.add(rdbtnC);

        JRadioButton rdbtnD = new JRadioButton("D");
        rdbtnD.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnD.setBounds(351, 10, 33, 23);
        panel_1.add(rdbtnD);

        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(165, 4, 1, 33);
        panel_1.add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBounds(390, 4, 1, 33);
        panel_1.add(separator_1);

        JLabel lblDataDeColheita = new JLabel("Data de colheita:");
        lblDataDeColheita.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDataDeColheita.setBounds(401, 10, 108, 14);
        panel_1.add(lblDataDeColheita);

        JLabel lblDd = new JLabel("DD");
        lblDd.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDd.setBounds(519, 11, 20, 14);
        panel_1.add(lblDd);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(549, 10, 33, 20);
        panel_1.add(textField_3);

        JLabel lblMm = new JLabel("MM");
        lblMm.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblMm.setBounds(592, 11, 20, 14);
        panel_1.add(lblMm);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(622, 10, 33, 20);
        panel_1.add(textField_4);

        JLabel lblAaaa = new JLabel("AAAA");
        lblAaaa.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblAaaa.setBounds(665, 11, 46, 14);
        panel_1.add(lblAaaa);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(708, 10, 46, 20);
        panel_1.add(textField_5);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_2.setBounds(10, 115, 764, 41);
        getContentPane().add(panel_2);

        JLabel lblLocal = new JLabel("Pre\u00E7o de compra:");
        lblLocal.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblLocal.setBounds(10, 10, 110, 17);
        panel_2.add(lblLocal);

        JLabel lblValidade = new JLabel("Data de Validade:");
        lblValidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblValidade.setBounds(401, 12, 108, 15);
        panel_2.add(lblValidade);

        JSeparator separator_2 = new JSeparator();
        separator_2.setOrientation(SwingConstants.VERTICAL);
        separator_2.setBounds(390, 4, 1, 33);
        panel_2.add(separator_2);

        JLabel label = new JLabel("DD");
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        label.setBounds(519, 10, 20, 14);
        panel_2.add(label);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(549, 10, 33, 20);
        panel_2.add(textField_7);

        JLabel label_1 = new JLabel("MM");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        label_1.setBounds(592, 10, 20, 14);
        panel_2.add(label_1);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(622, 10, 33, 20);
        panel_2.add(textField_8);

        JLabel label_2 = new JLabel("AAAA");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        label_2.setBounds(665, 10, 33, 14);
        panel_2.add(label_2);

        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(708, 10, 46, 20);
        panel_2.add(textField_9);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(130, 10, 56, 20);
        panel_2.add(textField_6);

        JLabel lblPreoDeVenda = new JLabel("Pre\u00E7o de venda:");
        lblPreoDeVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPreoDeVenda.setBounds(196, 10, 110, 17);
        panel_2.add(lblPreoDeVenda);

        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(306, 10, 56, 20);
        panel_2.add(textField_12);

        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_3.setBounds(10, 167, 764, 41);
        getContentPane().add(panel_3);

        JLabel lblOrigem = new JLabel("Origem:");
        lblOrigem.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblOrigem.setBounds(10, 10, 53, 17);
        panel_3.add(lblOrigem);

        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(73, 11, 306, 20);
        panel_3.add(textField_10);

        JSeparator separator_3 = new JSeparator();
        separator_3.setOrientation(SwingConstants.VERTICAL);
        separator_3.setBounds(390, 4, 1, 33);
        panel_3.add(separator_3);

        JLabel lblPerodo = new JLabel("Fornecedor:");
        lblPerodo.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPerodo.setBounds(401, 10, 85, 17);
        panel_3.add(lblPerodo);

        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(496, 11, 258, 20);
        panel_3.add(textField_11);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_4.setBounds(10, 219, 764, 288);
        getContentPane().add(panel_4);
        panel_4.setLayout(null);

        JLabel lblCondiesDePlantio = new JLabel("Condi\u00E7\u00F5es de plantio:");
        lblCondiesDePlantio.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCondiesDePlantio.setBounds(10, 11, 136, 17);
        panel_4.add(lblCondiesDePlantio);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 44, 366, 233);
        panel_4.add(textArea);

        JSeparator separator_4 = new JSeparator();
        separator_4.setOrientation(SwingConstants.VERTICAL);
        separator_4.setBounds(390, 11, 2, 266);
        panel_4.add(separator_4);

        JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
        lblObservaes.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblObservaes.setBounds(402, 11, 136, 17);
        panel_4.add(lblObservaes);

		
		

	}

}
