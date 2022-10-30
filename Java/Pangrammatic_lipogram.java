// Java program to check if a string
// is Pangrammatic Lipogram
import java.util.*;

class GFG
{

// collection of letters
static String alphabets = "abcdefghijklmnopqrstuvwxyz";

/*
	Category			 No of letters unmatched
	Pangram					 0
	Lipogram				 >1
	Pangrammatic Lipogram	 1
*/

// function to check for a Pangrammatic Lipogram
static void panLipogramChecker(char []s)
{
	// convert string to lowercase
	for(int i = 0; i < s.length; i++)
	{
		s[i] = Character.toLowerCase(s[i]);
	}
	
	// variable to keep count of all the letters
	// not found in the string
	int counter = 0 ;
	
	// traverses the string for every
	// letter of the alphabet
	for(int i = 0 ; i < 26 ; i++)
	{
		int pos = find(s, alphabets.charAt(i));
		
		// if character not found in string
		// then increment count
		if(pos<0 || pos > s.length)
			counter += 1;
	}
	
	if(counter == 0)
		System.out.println("Pangram");
	else if(counter >= 2)
		System.out.println("Not a pangram but might a lipogram");
	else
		System.out.println("Pangrammatic Lipogram");
}

static int find(char[]arr, char c)
{
	for(int i = 0; i < arr.length; i++)
	{
		if(c == arr[i])
			return 1;
	}
	return -1;
}

// Driver program to test above function
public static void main(String []args)
{
	char []str = "The quick brown fox jumped over the lazy dog".toCharArray();
	panLipogramChecker(str);
	
	str = "The quick brown fox jumps over the lazy dog".toCharArray();
	panLipogramChecker(str);
	
	str = "The quick brown fox jump over the lazy dog".toCharArray();
	panLipogramChecker(str);
}
}

// This code is contributed by Rajput-Ji
