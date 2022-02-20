import java.util.*;

public class Assignment4{

	public static void main(String[] args){
	
		//Variable Declaration
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter any number = ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);		
		}
		
		for(int data : arr){
			System.out.println(data);
		}
	
	}

}