package homework6;
import java.util.*;
import java.text.DecimalFormat;
public class AvgScore {
	public void AvgScoreMethod(){
		  Scanner s = new Scanner(System.in);
	
		  String pattern = "##.#";
	      DecimalFormat dformat = new DecimalFormat(pattern);
		  double[] arr = new double[10];
		  double max = 0;
		  double min = 0;
		  double sum = 0;
		  double avg = 0;
		  
		  for(int i = 0 ; i < arr.length ; i++ ){
			
			  System.out.print(i+1+"번 심사 점수 입력 : ");
			  arr[i] = s.nextDouble(); 
			 
		  }	
		  
		  for(int i = 0 ; i < arr.length ; i++){
			  if(arr[i] > max){
				  max = arr[i];
			  }
			  if(arr[i] < min){
				  min = arr[i];
			  }
		  } 
		  for(int i = 0 ; i < arr.length ; i++){
			  sum = sum+arr[i];
		  }
		  avg = (sum-max-min) / 8.0;
		  System.out.println("가장큰 점수와 가장작은 점수를 제외한 8개의 점수 평균은"+dformat.format(avg)+"입니다.");
	 }
}
