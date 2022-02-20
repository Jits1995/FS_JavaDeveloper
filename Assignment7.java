import java.util.*;

public class Assignment7{

	public static void main(String[] args){
	
		//Variable Declaration
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5], temp = 0, index_i, index_j;
		
		//Getting User Data Input
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter any number =");
			arr[i] = sc.nextInt();
		}
		
		//Sorting the array value using Bubble Sort Algorithm
		for(int i=0; i<arr.length; i++){
			index_i = 0;
			index_j=1;	
			for(int j=1; j<(arr.length-i); j++){
				if(arr[index_i]>arr[index_j]){
					temp=arr[index_i];
					arr[index_i]=arr[index_j];
					arr[index_j]=temp;
				}
				index_i++;
				index_j++;
			}
		}
		
		//Printing sorted values
		System.out.println("Values are sorted using bubble as below......");
		for(int data : arr){
			System.out.println(data);
		}
	
	}

}