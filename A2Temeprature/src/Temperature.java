import javax.swing.JOptionPane;

public class Temperature {

	public enum Month {
		JANUARY, FEBUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month month = Month.JANUARY;
		JOptionPane.showMessageDialog(null,month.toString());
	}

}
