package homework6;
import java.util.*;
import java.text.DecimalFormat;
public class StudentScore {
	 public void StudentScoreMethod(){
		 Scanner s = new Scanner(System.in);
		
	     double student_arr[][] = new double[5][3];
	     
	     for(int i = 0 ; i < 5 ; i++){
	    	 System.out.print(i+1+"번 학생 국어, 영어, 수학 :");
	    	 for(int j = 0 ; j < 3 ; j++){
	    		 student_arr[i][j] = s.nextInt();
	    	 }
	     }   
	     subject_sum(student_arr);
	     student_sum(student_arr);
	 }
	 public void subject_sum(double student_arr[][]){
		 String pattern = "##.##";
		 DecimalFormat dformat = new DecimalFormat(pattern);
	      
		 String sub_name[] = {"국어", "영어", "수학"};
		 double s_sum[] = new double[3];
	     double s_avg[] = new double[3];
	     
	     for(int i = 0 ; i < 3 ; i++){
	    	 for(int j = 0 ; j < 5 ; j++){
	    		 s_sum[i] += student_arr[j][i];
	    	 }
	    	 s_avg[i] = s_sum[i] / 5.0;
	     }
	     for(int h = 0 ; h < 3 ; h++){
			System.out.print(sub_name[h]+"총점은"+s_sum[h]+"이고 평균은"+dformat.format(s_avg[h])+"입니다.\n");
	     }
	 } 
	 
	 public void student_sum(double student_arr[][]){
		 String pattern = "##.##";
		 DecimalFormat dformat = new DecimalFormat(pattern);
	      
		 double s_sum[] = new double[5];
	     double s_avg[] = new double[5];
	     
	     for(int i = 0 ; i < 5 ; i++){
	    	 for(int j = 0 ; j < 3 ; j++){
	    		 s_sum[i] += student_arr[i][j];
	    	 }
	    	 s_avg[i] = s_sum[i] / 3.0;
	     }
	     for(int h = 0 ; h < 5 ; h++){
	    	 System.out.print(h+1+"번 학생의 총점은" +s_sum[h]+"평균은"+dformat.format(s_avg[h])+"이다.\n");
	     }
	 }
}

