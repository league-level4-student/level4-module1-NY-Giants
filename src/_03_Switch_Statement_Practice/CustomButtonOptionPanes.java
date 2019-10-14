package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(input) {
		case 0: 
			System.out.println(choice + " is the relax day");
			break;
		case 1: 
			System.out.println(choice + " is the ughhhh day");
			break;
		case 2: 
			System.out.println(choice + " is the mehhh day");
			break;
		case 3: 
			System.out.println(choice + " is the okay day");
			break;
		case 4: 
			System.out.println(choice + " is the almost there day");
			break;
		case 5: 
			System.out.println(choice + " is the finally day");
			break;
		case 6: 
			System.out.println(choice + " is the fun day");
			break;
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
		
	}
}
