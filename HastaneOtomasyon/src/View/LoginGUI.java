package View;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import Helper.*;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fld_hastaTc;
	private JTextField doc_tc;
	private JPasswordField doc_sif;
	private JPasswordField fld_hastaPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hastane Otomasyon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_logo = new JLabel(new ImageIcon(getClass().getResource("1.png")));
		label_logo.setBounds(226, 10, 184, 155);
		contentPane.add(label_logo);
		
		JLabel lblNewLabel = new JLabel("Hastane Y\u00F6netim Sistemine Ho\u015Fgeldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(115, 170, 406, 57);
		contentPane.add(lblNewLabel);
		
		JTabbedPane w_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		w_tabbedPane.setBounds(10, 217, 616, 286);
		contentPane.add(w_tabbedPane);
		
		JPanel w_hastaLogin = new JPanel();
		w_hastaLogin.setBackground(Color.WHITE);
		w_tabbedPane.addTab("Hasta Giriþi", null, w_hastaLogin, null);
		w_hastaLogin.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("T.C. Numaran\u0131z: ");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(36, 39, 126, 55);
		w_hastaLogin.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u015Eifre: ");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(36, 92, 126, 55);
		w_hastaLogin.add(lblNewLabel_1_1);
		
		fld_hastaTc = new JTextField();
		fld_hastaTc.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		fld_hastaTc.setBounds(204, 54, 203, 25);
		w_hastaLogin.add(fld_hastaTc);
		fld_hastaTc.setColumns(10);
		
		JButton btnNewButton = new JButton("Kayýt Ol");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(204, 154, 101, 39);
		w_hastaLogin.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Giriþ");
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnNewButton_1.setBounds(306, 154, 101, 39);
		w_hastaLogin.add(btnNewButton_1);
		
		fld_hastaPass = new JPasswordField();
		fld_hastaPass.setBounds(204, 107, 203, 25);
		w_hastaLogin.add(fld_hastaPass);
		
		JPanel w_doctorLogin = new JPanel();
		w_doctorLogin.setBackground(Color.WHITE);
		w_tabbedPane.addTab("Doktor Giriþi", null, w_doctorLogin, null);
		w_doctorLogin.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("T.C. Numaran\u0131z: ");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(36, 39, 126, 55);
		w_doctorLogin.add(lblNewLabel_1_2);
		
		doc_tc = new JTextField();
		doc_tc.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		doc_tc.setColumns(10);
		doc_tc.setBounds(204, 54, 203, 25);
		w_doctorLogin.add(doc_tc);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u015Eifre: ");
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(36, 92, 126, 55);
		w_doctorLogin.add(lblNewLabel_1_1_1);
		
		JButton btn_registerdoc = new JButton("Kay\u0131t Ol");
		btn_registerdoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_registerdoc.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btn_registerdoc.setBounds(204, 155, 101, 39);
		w_doctorLogin.add(btn_registerdoc);
		
		JButton btn_doctorlogin = new JButton("Giri\u015F");
		btn_doctorlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(doc_tc.getText().length() == 0 || doc_sif.getText().length() == 0) {
					Helper.showMsg("fill");
				}
				else {
					
				}
			}
		});
		btn_doctorlogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btn_doctorlogin.setBounds(306, 155, 101, 39);
		w_doctorLogin.add(btn_doctorlogin);
		
		doc_sif = new JPasswordField();
		doc_sif.setBounds(204, 110, 203, 25);
		w_doctorLogin.add(doc_sif);
	}
}
