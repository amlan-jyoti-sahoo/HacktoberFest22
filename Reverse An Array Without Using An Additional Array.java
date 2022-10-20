import java.util.Arrays;

public class ArrayReverseExample 
{  
	static void reverseArray(int inputArray[])
	{
		System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
		
		int temp;
		
		for (int i = 0; i < inputArray.length/2; i++) 
		{
			temp = inputArray[i];
			
			inputArray[i] = inputArray[inputArray.length-1-i];
			
			inputArray[inputArray.length-1-i] = temp;
		}
		
		System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
	}
	
	public static void main(String[] args) 
	{	
		reverseArray(new int[]{4, 5, 8, 9, 10});
		
		System.out.println("-------------------------");
		
		reverseArray(new int[]{12, 9, 21, 17, 33, 7});
		
		System.out.println("-------------------------");
		
		reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
	}	
}
