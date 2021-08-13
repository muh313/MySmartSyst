import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Description extends JFrame {

	private JPanel contentPane;

	public Description(User temp, int X, int Y) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Background");
		setResizable(false);
		User S = temp;
		setBounds(X, Y, 1108, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/images/computer.png")).getImage();
		setIconImage(img);
		
		JLabel lblNewLabel = new JLabel("BACKGROUND");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 60));
		lblNewLabel.setBounds(348, 15, 543, 148);
		getContentPane().add(lblNewLabel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(69, 13, 159, 161);
		contentPane.add(lblLogo);
		
		Image logo = new ImageIcon(this.getClass().getResource("/images/instructions.png")).getImage();
		
		lblLogo.setIcon(new ImageIcon(logo));
		JTextArea txtrYouHave = new JTextArea();
		txtrYouHave.setOpaque(false);
		txtrYouHave.setForeground(Color.DARK_GRAY);
		txtrYouHave.setLineWrap(true);
		txtrYouHave.setText("> Users are given 5 minutes to complete\r\n\r\n> The following questions will determine the environment level.\r\n\r\n> Levels : 0-5 "
				+ "(0 being the safest level / 5 being the most dangerous level)\r\n\r\n> "
				+ "You may use online resources, which may be provided..");
		txtrYouHave.setFont(new Font("Lucida Console", Font.PLAIN, 40));
		txtrYouHave.setEditable(false);
		txtrYouHave.setBounds(12, 201, 1066, 527);
		getContentPane().add(txtrYouHave);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 176, 1066, 12);
		getContentPane().add(separator);
		
		JButton button = new JButton("PROCEED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Questions frame2 = new Questions(S,(int)getLocationOnScreen().getX(), (int)getLocationOnScreen().getY());
				
				frame2.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBorder(null);
		button.setBounds(440, 757, 159, 59);
		contentPane.add(button);
	
	}

}
