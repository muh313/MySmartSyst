import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class User {
	private String Name;
	private String Email;
	private String Course;
	private String Year;
	private String Branch;
	private String Password;
	private String RollNo;
	private String Answer[] = new String[5];
	private int Marks = 0;

	public User() {
		for (int i = 0; i < 5; i++)
			Answer[i] = " ";
	}

	public void setName(String s) {
		Name = s;
	}

	public String getName() {
		return Name;
	}

	public void setEmail(String s) {
		Email = s;
	}

	public String getEmail() {
		return Email;
	}

	public void setRollNo(String s) {
		RollNo = s;
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setCourse(String s) {
		Course = s;
	}

	public String getCourse() {
		return Course;
	}

	public void setYear(String s) {
		Year = s;
	}

	public String getYear() {
		return Year;
	}

	public void setBranch(String s) {
		Branch = s;
	}

	public String getBranch() {
		return Branch;
	}

	public void setPassword(String s) {
		Password = s;
	}

	public String getPassword() {
		return Password;
	}

	public void setAnswer(int i, String s) {
		Answer[i] = s;
	}

	public String getAnswer(int i) {
		return Answer[i];
	}

	public void Check(String s[]) {
		for (int i = 0; i < 5; i++) {
			if (Answer[i].equals(s[i]))
				Marks++;
		}
	}

	// Ensure images are saved
	public static void imageAns(String loc) throws IOException {

		BufferedImage img = ImageIO.read(new File(loc));
		ImageIcon icon = new ImageIcon(img);
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 1000);
		JLabel lbl = new JLabel("VISUAL");
		lbl.setIcon(icon);
		frame.add(lbl);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Unique display for each
	public int getMarks() throws IOException {

		String safezone = "C:\\Users\\Mhasa\\eclipse-workspace\\MySmartSyst\\src\\images\\safezone.png";
		String midzone = "C:\\Users\\Mhasa\\eclipse-workspace\\MySmartSyst\\src\\images\\midzone.png";
		String dangerzone = "C:\\Users\\Mhasa\\eclipse-workspace\\MySmartSyst\\src\\images\\dangerzone.png";

		if (Marks == 0) {
			System.out.print("level 0: safe");
			imageAns(safezone);
		}
		if (Marks == 1) {
			System.out.print("level 1: still safe");
			imageAns(safezone);
		}
		if (Marks == 2) {
			System.out.print("level 2: somewhat safe");
			imageAns(safezone);
		}
		if (Marks == 3) {
			System.out.print("level 3: threat looming");
			imageAns(midzone);
		}
		if (Marks == 4) {
			System.out.print("level 4: threat may be coming..");
			imageAns(midzone);
		}
		if (Marks == 5) {
			System.out.print("level 5: climate change.");
			imageAns(dangerzone);
		}
		return Marks;
	}
}