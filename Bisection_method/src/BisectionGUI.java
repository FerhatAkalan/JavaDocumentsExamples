import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class BisectionGUI extends JFrame {
	public static Scanner input = new Scanner(System.in);
	private static double bagilHata = 100;
	private static double verilenBagilHata;
	private static double yeniLimit;
	private static double yeniLimit2;
	private static double iterasyonSayaci = 1;
	private JPanel contentPane;
	private JTextField altLimitt;
	private JTextField ustLimitt;
	private JTextField bagilHataa;
	private JTable table;
	
	public static double fonksiyon(double x) {
		return (Math.sqrt((9.81*x)/0.25))*(Math.tanh((Math.sqrt((9.81*0.25)/x))*4))-36;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BisectionGUI frame = new BisectionGUI();
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
	public BisectionGUI() {
		setResizable(false);
		setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		setTitle("BisectionGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 44, 913, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		altLimitt = new JTextField();
		altLimitt.setBounds(159, 33, 96, 19);
		panel.add(altLimitt);
		altLimitt.setColumns(10);
		
		ustLimitt = new JTextField();
		ustLimitt.setBounds(159, 71, 96, 19);
		panel.add(ustLimitt);
		ustLimitt.setColumns(10);
		
		bagilHataa = new JTextField();
		bagilHataa.setBounds(159, 115, 96, 19);
		panel.add(bagilHataa);
		bagilHataa.setColumns(10);
		
		JButton calistir = new JButton("Çalýþtýr");
		calistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double altLimit = Double.valueOf(altLimitt.getText());
				double üstLimit = Double.valueOf(ustLimitt.getText());
				verilenBagilHata = Double.valueOf(bagilHataa.getText());
				while(bagilHata > verilenBagilHata) {
					iterasyonSayaci += 1 ;
					if(fonksiyon(altLimit)*fonksiyon(üstLimit) < 0) {
						yeniLimit = (altLimit + üstLimit) / 2;
						if(fonksiyon(altLimit)*fonksiyon(yeniLimit) < 0) {
							üstLimit = yeniLimit;
							System.out.println("üstLimit: " + üstLimit);
							yeniLimit2 = (altLimit + üstLimit) / 2;
							if(iterasyonSayaci != 1 ) {
								bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);	
							}
						}
						else {
							altLimit = yeniLimit;
							System.out.println("altLimit: " + altLimit);
							yeniLimit2 = (altLimit + üstLimit) / 2;
							if(iterasyonSayaci != 1 ) {
								bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);
							}
						}
					}
					else {
						System.out.println("Program çalýþmaz");
						break;
					}
				}
			}
		});
		calistir.setBounds(170, 157, 85, 21);
		panel.add(calistir);
		
		JLabel altLimitLabel = new JLabel("Alt Limit:");
		altLimitLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		altLimitLabel.setBounds(75, 33, 60, 16);
		panel.add(altLimitLabel);
		
		JLabel üstLimitLabel = new JLabel("\u00DCst Limit:");
		üstLimitLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		üstLimitLabel.setBounds(75, 74, 60, 16);
		panel.add(üstLimitLabel);
		
		JLabel bagilHataLabel = new JLabel("Ba\u011F\u0131l Hata:");
		bagilHataLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		bagilHataLabel.setBounds(75, 118, 74, 16);
		panel.add(bagilHataLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\u0130terasyon", "X\u0131", "Xu", "Xr", "|Ea|(%)"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(78);
		table.setBounds(402, 30, 461, 252);
		//panel.add(table);		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(310, 30, 578, 375);
		panel.add(scrollPane);
		scrollPane.setViewportView(table);
		
	}
}
