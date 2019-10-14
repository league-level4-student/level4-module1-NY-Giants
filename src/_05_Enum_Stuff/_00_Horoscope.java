package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope{
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		zodiac(Zodiac.TAURUS);
	}
	public static void zodiac(Zodiac horoscope) {
		switch(horoscope) {
		case ARIES: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case TAURUS: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case GEMINI: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		case CANCER: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case LEO: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		case VIRGO: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case LIBRA: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		case SCORPIO: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case SAGITTARIUS: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		case CAPRICORN: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		case AQUARIUS: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		case PISCES: 
			JOptionPane.showMessageDialog(null, "Ur agreeable");
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Ur headstrong");
			break;
		}
		}
}
