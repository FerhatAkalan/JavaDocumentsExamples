import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class YoneticiGUI extends JFrame {
	static Yonetici yonetici = new Yonetici();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiGUI frame = new YoneticiGUI(yonetici);
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
	public YoneticiGUI(Yonetici yonetici) {
		
		setTitle("Y\u00F6netici Bilgi Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoþgeldiniz, Sayýn: " + yonetici.getSys_kul() + " Ýþlem Seçiniz.");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setBounds(170, 10, 356, 79);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u00C7\u0131k\u0131\u015F Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnNewButton.setBounds(170, 343, 356, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00D6\u011Frenci Bilgisi Getir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OgrenciGUI ogGUI = new OgrenciGUI(yonetici);
				ogGUI.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnNewButton_1.setBounds(170, 99, 356, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00D6\u011Frenci Not Bilgisi Hesaplama");
		btnNewButton_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(170, 180, 356, 55);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Devams\u0131zl\u0131k Bilgisi D\u00FCzenleme");
		btnNewButton_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(170, 260, 356, 55);
		contentPane.add(btnNewButton_1_2);
	}
}
