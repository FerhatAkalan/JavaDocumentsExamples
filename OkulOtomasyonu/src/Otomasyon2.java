import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Otomasyon2 extends JFrame {

	private JPanel w_pane;
	private JTextField tc;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otomasyon2 frame = new Otomasyon2();
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
	public Otomasyon2() {
		setResizable(false);
		Yonetici yonetici1 = new Yonetici("Ahmet", "6542");
		OgrenciKayit ogrenci1 = new OgrenciKayit("Ali", "Veli", "1234", "12.10.2021", 0);
		OgrenciKayit ogrenci2 = new OgrenciKayit("Ayþe", "Su", "5678", "12.10.2021", 0);
		yonetici1.setOgrenci1(ogrenci1);
		yonetici1.setOgrenci(ogrenci1);
		yonetici1.setOgrenci1(ogrenci2);
		yonetici1.setOgrenci(ogrenci2);
		//Otomasyon otomasyon1 =  new Otomasyon(yonetici1);
		//otomasyon1.otomasyon();
		setTitle("Okul Bilgi Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 506);
		w_pane = new JPanel();
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Okul Bilgi Sistemi");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(267, 98, 177, 62);
		w_pane.add(lblNewLabel);
		
		JLabel label_logo = new JLabel(new ImageIcon(getClass().getResource("2.png")));
		label_logo.setBounds(281, 10, 150, 94);
		w_pane.add(label_logo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 176, 692, 264);
		w_pane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131: ");
		lblNewLabel_1.setBounds(92, 61, 133, 42);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u015Eifre: ");
		lblNewLabel_1_1.setBounds(92, 110, 133, 42);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		panel.add(lblNewLabel_1_1);
		
		tc = new JTextField();
		tc.setBounds(307, 66, 185, 31);
		panel.add(tc);
		tc.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(307, 119, 185, 31);
		panel.add(password);
		
		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.setBounds(307, 170, 185, 31);
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tc.getText().length() == 0 || password.getText().length() == 0) {
					JOptionPane.showMessageDialog(null,"Lütfen tüm alanlarý doldurunuz!");
				}
				else {
					if(tc.getText().equals(yonetici1.getSys_kul()) && password.getText().equals(yonetici1.getSys_sif())) {
						
						YoneticiGUI yGUI = new YoneticiGUI(yonetici1);
						yGUI.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Kullanýcý adý veya þifre yanlýþ!");
					}
				}
			}
		});
		panel.add(btnGiri);
		
		JLabel lblNewLabel_2 = new JLabel("Ferhat   Akalan");
		lblNewLabel_2.setBounds(549, 230, 133, 24);
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		panel.add(lblNewLabel_2);
	}
}
