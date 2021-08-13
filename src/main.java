import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frmMySmartSyst;
	private String Names = "<html><ul><li>Muhammad Hasan</li></ul></html>";
	private String RollNo = "<html><ul><li>3532162</li></ul></html>";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					main window = new main();
					window.frmMySmartSyst.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public main() {
		initialize();
	}

	private void initialize() {
		frmMySmartSyst = new JFrame();
		frmMySmartSyst.setResizable(false);
		frmMySmartSyst.setTitle("Smart System");
		frmMySmartSyst.setBounds(500, 100, 1108, 896);
		frmMySmartSyst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMySmartSyst.getContentPane().setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(12, 13, 192, 187);
		frmMySmartSyst.getContentPane().add(lblLogo);

		Image logo = new ImageIcon(this.getClass().getResource("/images/leedsbeck.png")).getImage();

		lblLogo.setIcon(new ImageIcon(logo));

		JLabel uniName = new JLabel("Leeds Beckett University");
		uniName.setForeground(Color.RED);
		uniName.setBackground(Color.WHITE);
		uniName.setFont(new Font("Consolas", Font.BOLD, 35));
		uniName.setHorizontalAlignment(SwingConstants.CENTER);
		uniName.setBounds(204, 13, 862, 88);
		frmMySmartSyst.getContentPane().add(uniName);

		JLabel label = new JLabel("Muhammad Hasan");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Consolas", Font.BOLD, 25));
		label.setBounds(429, 90, 474, 39);
		frmMySmartSyst.getContentPane().add(label);

		JSeparator separator = new JSeparator();
		separator.setBounds(326, 142, 635, 13);
		frmMySmartSyst.getContentPane().add(separator);

		JLabel lblSmartSys = new JLabel("Smart System");
		lblSmartSys.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmartSys.setForeground(Color.BLUE);
		lblSmartSys.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblSmartSys.setBounds(281, 168, 640, 124);
		frmMySmartSyst.getContentPane().add(lblSmartSys);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(174, 305, 831, 13);
		frmMySmartSyst.getContentPane().add(separator_1);

		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				form frame0 = new form((int) frmMySmartSyst.getLocationOnScreen().getX(),
						(int) frmMySmartSyst.getLocationOnScreen().getY());
				frame0.setVisible(true);
				frmMySmartSyst.setVisible(false);
			}
		});
		btnStart.setFont(new Font("Times New Roman", Font.BOLD, 50));
		btnStart.setBounds(812, 744, 254, 88);
		frmMySmartSyst.getContentPane().add(btnStart);

		JLabel lblNewLabel = new JLabel("Project Created by : -");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 331, 331, 57);
		frmMySmartSyst.getContentPane().add(lblNewLabel);

		JLabel lblName_title = new JLabel("Name");
		lblName_title.setFont(new Font("Serif", Font.PLAIN, 30));
		lblName_title.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_title.setBounds(22, 423, 111, 28);
		frmMySmartSyst.getContentPane().add(lblName_title);

		JLabel lblRollNo_title = new JLabel("Roll No.");
		lblRollNo_title.setFont(new Font("Serif", Font.PLAIN, 30));
		lblRollNo_title.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo_title.setBounds(478, 411, 145, 28);
		frmMySmartSyst.getContentPane().add(lblRollNo_title);

		JLabel lblName = new JLabel(Names);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblName.setBounds(22, 478, 447, 331);
		frmMySmartSyst.getContentPane().add(lblName);

		JLabel lblRollNo = new JLabel(RollNo);
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblRollNo.setBounds(448, 454, 325, 331);
		frmMySmartSyst.getContentPane().add(lblRollNo);

		Image img = new ImageIcon(this.getClass().getResource("/images/computer.png")).getImage();
		frmMySmartSyst.setIconImage(img);

	}
}
