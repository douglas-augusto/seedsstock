package jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;

public class HomeScreen extends JFrame {
	
	AddSemente frame = new AddSemente();
	AlterarSemente frame2 = new AlterarSemente();
	ApagarSemente frame3 = new ApagarSemente();
	Balanco frame4 = new Balanco();
	BuscarSemente frame5 = new BuscarSemente();
	GerirVendas frame6 = new GerirVendas();
	Guia frame7 = new Guia();
	Venda frame9 = new Venda();
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void fecharJanelas() {
	
		frame.setVisible(false);
		frame2.setVisible(false);
		frame3.setVisible(false);
		frame4.setVisible(false);
		frame5.setVisible(false);
		frame6.setVisible(false);
		frame7.setVisible(false);
		frame9.setVisible(false);
		
	}
	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		//setResizable(false);
		setExtendedState(MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomeScreen.class.getResource("/icons/background.png")));
		setTitle("Gestor do Armazem de Sementes 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 307);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar BarraDeMenu = new JMenuBar();
		
		BarraDeMenu.setBounds(0, 0, 1366, 21);
		
		/*if(d.width == 1366) {
			BarraDeMenu.setBounds(0, 0, 1366, 21);
		}else if(d.width == 1360) {
			BarraDeMenu.setBounds(0, 0, 1360, 21);
		}else if(d.width == 1280) {
			BarraDeMenu.setBounds(0, 0, 1280, 21);
		}else if(d.width == 1024) {
			BarraDeMenu.setBounds(0, 0, 1024, 21);
		}*/
		
		contentPane.add(BarraDeMenu);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		BarraDeMenu.add(mnArquivo);
		
		JMenu mnNovo = new JMenu("Novo");
		mnArquivo.add(mnNovo);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro");
		mnNovo.add(mntmRegistro);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		mnNovo.add(mntmVenda);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		BarraDeMenu.add(mnEditar);
		
		JMenu mnAlterarDados = new JMenu("Alterar dados");
		mnEditar.add(mnAlterarDados);
		
		JMenuItem mntmRegistro_2 = new JMenuItem("Registro");
		mnAlterarDados.add(mntmRegistro_2);
		
		JMenu mnApagar = new JMenu("Apagar");
		mnEditar.add(mnApagar);
		
		JMenuItem mntmRegistro_1 = new JMenuItem("Registro");
		mnApagar.add(mntmRegistro_1);
		
		JMenuItem mntmVenda_1 = new JMenuItem("Venda");
		mnApagar.add(mntmVenda_1);
		
		JMenu mnBalanos = new JMenu("Balan\u00E7os");
		BarraDeMenu.add(mnBalanos);
		
		JMenuItem mntmVerBalanos = new JMenuItem("Ver balan\u00E7os");
		mnBalanos.add(mntmVerBalanos);
		
		JMenuItem mntmOpesDoCaixa = new JMenuItem("Op\u00E7\u00F5es do caixa");
		mnBalanos.add(mntmOpesDoCaixa);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		BarraDeMenu.add(mnAjuda);
		
		JMenuItem mntmComoUsarO = new JMenuItem("Guia");
		mnAjuda.add(mntmComoUsarO);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		
		JPanel BarraDeAtalhos = new JPanel();
		
		BarraDeAtalhos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		BarraDeAtalhos.setBounds(0, 21, 1366, 40);
		
		/*if(d.width == 1366) {
			BarraDeAtalhos.setBounds(0, 21, 1366, 40);
		}else if(d.width == 1360) {
			BarraDeAtalhos.setBounds(0, 21, 1360, 40);
		}else if(d.width == 1280) {
			BarraDeAtalhos.setBounds(0, 21, 1280, 40);
		}else if(d.width == 1024) {
			BarraDeAtalhos.setBounds(0, 21, 1024, 40);
		}*/
		
		contentPane.add(BarraDeAtalhos);
		BarraDeAtalhos.setLayout(null);
		
		JLabel label = new JLabel("");
		
		label.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) {
				fecharJanelas();
				//AddSemente frame = new AddSemente();
				contentPane.add(frame);
				frame.setVisible(true);
				frame.setPosition();
			} 
		});
		label.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Add.png")));
		label.setBounds(10, 0, 32, 40);
		BarraDeAtalhos.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(94, 5, 2, 30);
		BarraDeAtalhos.add(separator);
		
		JLabel iconVenda = new JLabel("");
		iconVenda.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) {
				fecharJanelas();
				//Venda frame = new Venda();
				contentPane.add(frame9);
				frame9.setVisible(true);
				frame9.setPosition();
				
			} 
		});
		iconVenda.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Loading.png")));
		iconVenda.setBounds(52, 0, 32, 40);
		BarraDeAtalhos.add(iconVenda);
		
		JLabel iconAlterar = new JLabel("");
		iconAlterar.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) { 
				fecharJanelas();
				//AlterarSemente frame = new AlterarSemente();
				contentPane.add(frame2);
				frame2.setVisible(true);
				frame2.setPosition();
				
			} 
		});
		iconAlterar.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Modify.png")));
		iconAlterar.setBounds(102, 0, 32, 40);
		BarraDeAtalhos.add(iconAlterar);
		
		JLabel iconExcluir = new JLabel("");
		iconExcluir.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) { 
				fecharJanelas();
				//ApagarSemente frame = new ApagarSemente();
				contentPane.add(frame3);
				frame3.setVisible(true);
				frame3.setPosition();
				
			} 
		});
		iconExcluir.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Delete.png")));
		iconExcluir.setBounds(138, 0, 32, 40);
		BarraDeAtalhos.add(iconExcluir);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(222, 5, 2, 30);
		BarraDeAtalhos.add(separator_1);
		
		JLabel iconBuscar = new JLabel("");
		iconBuscar.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) { 
				fecharJanelas();
				//BuscarSemente frame = new BuscarSemente();
				contentPane.add(frame5);
				frame5.setVisible(true);
				frame5.setPosition();
				
			} 
		});
		iconBuscar.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Search.png")));
		iconBuscar.setBounds(180, 0, 32, 40);
		BarraDeAtalhos.add(iconBuscar);
		
		JLabel iconBalanco = new JLabel("");
		iconBalanco.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) {
				fecharJanelas();
				//Balanco frame = new Balanco();
				contentPane.add(frame4);
				frame4.setVisible(true);
				frame4.setPosition();
				
			} 
		});
		iconBalanco.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Pie Chart.png")));
		iconBalanco.setBounds(234, 0, 32, 40);
		BarraDeAtalhos.add(iconBalanco);
		
		JLabel iconGerenciaVendas = new JLabel("");
		iconGerenciaVendas.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) {
				fecharJanelas();
				//GerirVendas frame = new GerirVendas();
				contentPane.add(frame6);
				frame6.setVisible(true);
				frame6.setPosition();
				
			} 
		});
		iconGerenciaVendas.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Bar Chart.png")));
		iconGerenciaVendas.setBounds(276, 0, 32, 40);
		BarraDeAtalhos.add(iconGerenciaVendas);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(318, 5, 2, 30);
		BarraDeAtalhos.add(separator_2);
		
		JLabel iconInfo = new JLabel("");
		iconInfo.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) { 
				fecharJanelas();
				//Guia frame = new Guia();
				contentPane.add(frame7);
				frame7.setVisible(true);
				frame7.setPosition();
				
			} 
		});
		iconInfo.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Info.png")));
		iconInfo.setBounds(330, 0, 32, 40);
		BarraDeAtalhos.add(iconInfo);
		
		JLabel iconSair = new JLabel("");
		iconSair.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e) {
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
				if(dialogResult == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			} 
		});
		iconSair.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/Exit.png")));
		iconSair.setBounds(372, 0, 32, 40);
		BarraDeAtalhos.add(iconSair);
	}
}
