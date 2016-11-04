package homework6;
import java.util.*;
public class SecondMax {
	public void SecondMaxMethod(){
	   Scanner s = new Scanner(System.in);
	   
	   int arr[] = new int[10];
	   int max = 0;
	   int secondmax = 0;
	   int index = 0;
	   
	   for(int i = 0 ; i < arr.length ; i++){
		   System.out.print(i+1+"번째 수를 입력하시오.");
		   arr[i] = s.nextInt();     
		   
		   
		   if(arr[i] > max){
			   secondmax = max;
			   max = arr[i];
			   index = i;
		   }
		   else if(arr[i] > secondmax){
			   secondmax = arr[i];
			   index = i+1;
		   }
	   } 
	   System.out.println("두 번째로 큰 수는" +index+"번째수"+secondmax+"입니다");
	}
}
