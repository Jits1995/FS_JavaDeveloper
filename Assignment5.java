import java.util.*;

public class Assignment5{

	public static void main(String[] args){
	
		//Variable declaration
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5], sum = 0, avg = 0;
		
		//Getting User Input
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter any number = ");
			arr[i] = sc.nextInt();
		}
		
		//Calculating Sum
		for(int data : arr){
			sum += data;
		}
		
		//Calculation Average
		avg = sum/arr.length;
	
		//printing the output
		System.out.println("The sum of entered value is = " + sum);
		System.out.println("The average of the entered value is = " + avg);
	}

}