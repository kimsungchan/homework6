package homework6;
import java.util.*;
public class AptPersonCount {
	public void AptPersonCountMethod(){
		   Scanner s = new Scanner(System.in);
		   
		   int arr[] = new int[15];
		   int floor[] = new int[5];
		   int line[] = new int[3]; 
		   int m_total = 0;
		   int j = 0 ;
		   int h = 0 ;
		   for(int i = 0 ; i < 15 ; i++){
			 System.out.print(j+1+"0"+(h+1)+"호에 살고 있는 사람의 숫자 :");  
			 arr[i] = s.nextInt();
			 m_total += arr[i];
			 floor[j] += arr[i];
			 line[h] += arr[i];
			 h++;
			 if(i % 3 == 2){
				 h = 0;
				 j++;
			 }
			 
		   }
		   System.out.print("이 아파트에 거주자는 모두"+m_total+"명입니다.\n");
		  
		   for(int i = 0 ; i < 5 ; i++){
	    	   System.out.print(i+1+"층에 사는 거주자는 모두"+floor[i]+"명 입니다.\n");
	       }
		   for(int i = 0 ; i < 3 ; i++){
			   System.out.print(i+1+"호에 라인에 사는 거주자는 모두"+line[i]+"명입니다.\n");
		   }
	   }
}
