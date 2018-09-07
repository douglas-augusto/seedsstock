package jframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaVender extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVender frame = new TelaVender();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVender() {
		setBounds(100, 100, 450, 300);

	}

}
