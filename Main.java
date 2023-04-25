
import java.io.*;
import java.util.*;  

public class Main {


	public static boolean palindromCheck(String subS)
	{
		int size = subS.length();

		for (int i = 0; i < size / 2; i++) {

			if (subS.charAt(i)	
				!= subS.charAt(size - i - 1)) {

				return false;
			}
		}

		// Palindromic behavior
		return true;
	}

	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();              
        String largestStr = "";

		for (int i = 0; i < str.length(); i++) {


			for (int j = i; j < str.length(); j++) {

				String subString = str.substring(i, j + 1);

				// Checking whether the substring is
				// palindrome
				if (palindromCheck(subString)) {

					if(largestStr.length() < subString.length()){
						largestStr = subString;
					}
				}
			}
		}

		System.out.println(
			"Largest palindromic substrings in the given string are "
			+ largestStr);
	}
}
