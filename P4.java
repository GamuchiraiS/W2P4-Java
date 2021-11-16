//importing utility classes
import java.util.*;

public class P4{
	public static void main(String args []){
		String str; 
		int letters, digits, stringLength, index;
		letters = digits = stringLength = index = 0;

		//Create Scanner object 
		Scanner sc = new Scanner(System.in);
		//Asking user to input string
		System.out.println("Enter a string: ");
		//Captures user input and assigns it to str
		str = sc.nextLine();
		//Checks length of str
		stringLength = str.length();
		//Makes str lowercase
		str = str.toLowerCase();

		//run when the index is less than stringLength
		while (index < stringLength){
			//if the letter is between a - z
			//then increment letters
			if ((str.charAt(index) >= 'a' && str.charAt(index) <= 'z')){
				letters++;
			}
			//and if digits are between 0 - 9
			//then increment digits
			else if (str.charAt(index) >= '0' && str.charAt(index) <= '9'){
				digits++;
			}
			index++;
		}
		System.out.println("Number of letters: " + letters);
		System.out.println("Number of digits: " + digits);
	}
}