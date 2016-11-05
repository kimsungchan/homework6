package homework6;
import java.util.*;
public class OnlyNumber {
	public void OnlyNumberMethod(){
		   Scanner s = new Scanner(System.in);
		   
		   int arr[] = new int[10];
		   int check[] = new int[10];
		   System.out.println("1~100 사이의 숫자를 입력하세요.");
		   for(int i = 0 ; i < 10 ; i++){
			   System.out.print(i+1+"번째 숫자 :");
			   arr[i] = s.nextInt();
			   check[i] = arr[i];
			   
			   for(int j = 0 ; j < i ; j++){
				   if(check[i] == arr[j]){
					   i-=1;
					   System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				   }
			   } 
		   }
		   for(int i = 9 ; i >= 0 ; i--){
			   System.out.print(i+1+"번째 숫자는"+arr[i]+"입니다 \n");
		   }
	   }
}
