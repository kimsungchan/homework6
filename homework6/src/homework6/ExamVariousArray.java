package homework6;
import java.util.*;
public class ExamVariousArray {
	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       
	       while(true){
	    	System.out.println("**************");
	   		System.out.println("배열사용하기");
	   		System.out.println("**************");
	   		System.out.println("1. 두번째로 큰 수 찾기");
	   		System.out.println("2. 심사 점수 계산");
	   		System.out.println("3. 학생 총점,평균값 구하기");
	   		System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
	   		System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
	   		System.out.println("6 종료하기");
	   		System.out.print("원하는 메뉴는 >>");
	   		int number = s.nextInt();
	   		
	   		if(number == 1){
	   		     new SecondMax().SecondMaxMethod();
	   		}
	   		if(number == 2){
	      		 new AvgScore().AvgScoreMethod();
	      		}
	   		if(number == 3){
	      		 new StudentScore().StudentScoreMethod();
	      		}
	   		if(number == 4){
	      		 new AptPersonCount ().AptPersonCountMethod();
	      		}
	   		if(number == 5){
	      		 new OnlyNumber().OnlyNumberMethod();
	      		}
	        else if(number == 6){
	           	System.exit(0);
	           }	
	       }
		} 
}
