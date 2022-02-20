import java.util.*;

public class Assignment6{

	public static void main(String[] args){
	
		//Variable Declaration
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5], max = 0;
		
		//Getting User Data Input
		for(int i=0; i<5; i++){
			System.out.print("Enter Any Number = ");
			arr[i] = sc.nextInt();
		}
		
		//Finding the Biggest Number
		for(int data : arr){
			if(max<data){
				max = data;
			}
		}
		
		//Printing the Biggest Value
		System.out.println("Maximum value out of entered value is " + max);
	}

}