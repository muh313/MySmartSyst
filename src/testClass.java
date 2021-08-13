import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import org.junit.Assert;
import org.junit.Test;

public class testClass {
	private JButton northButtonFixture;
	private JButton southButtonFixture;

	// tests checkbox
	@Test
	public void unmarkedCheckbox() throws Exception {

		JRadioButton rdbtnA = new JRadioButton("A");

		String expected = "A";
		String actual;

		if (!rdbtnA.isSelected()) {
			actual = "A";
		} else {
			actual = "Not selected";
		}
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tearDown() throws Exception {
		this.northButtonFixture = null;
		this.southButtonFixture = null;
	}

	// tests if answers are correct
	@Test
	public void test() throws IOException {
		User sut = new User();

		String expected = "James";
		String actual = "";

		sut.setName(expected);

		if (sut.getName() == expected) {
			actual = "James";
		} else if (sut.getName() != expected) {
			actual = null;
		}
		Assert.assertEquals(expected, actual);
	}
}
