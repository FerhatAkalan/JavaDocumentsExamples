import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtmGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtmGUI frame = new AtmGUI();
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
	public AtmGUI() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Bakiye Sorgulama");
		btnNewButton.setBounds(10, 157, 165, 62);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		
		JButton btnNewButton_1 = new JButton("Para \u00C7ekme");
		btnNewButton_1.setBounds(10, 280, 165, 62);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		
		JButton btnNewButton_2 = new JButton("Para Yat\u0131rma");
		btnNewButton_2.setBounds(675, 157, 165, 62);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		
		JButton btnNewButton_3 = new JButton("Sistemden \u00C7\u0131k\u0131\u015F");
		btnNewButton_3.setBounds(675, 280, 165, 62);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
	}
}
