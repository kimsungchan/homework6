package homework6;
import java.util.*;
import java.text.DecimalFormat;
public class StudentScore {
	 public void StudentScoreMethod(){
		 Scanner s = new Scanner(System.in);
		 
		 String pattern = "##.#";
	     DecimalFormat dformat = new DecimalFormat(pattern);
	      
		 int[][] student_arr = new int[5][4];
	     int[] student_sum = {};
		 
		 for(int i = 0 ; i < 5 ; i++){
			 System.out.println(i+1+"번 학생 국어 영어 수학 :");
			 for(int j = 0 ; j < 3 ; j++){
				 student_arr[i][j] = s.nextInt();
				 student_arr[i][3] = student_arr[i][3] + student_arr[i][j];
			 }
		 }
		 
		 for(int i = 0 ; i < 3 ; i++){
			 for(int j = 0 ; j < 5 ; j++){
				 student_sum[i] = student_sum[i] + student_arr[j][i];
			 }
		 }
		 System.out.print("국어 총점은" +student_sum[0]+"이고 평균은"+dformat.format(student_sum[0]/5.0) +"입니다.\n");
		 System.out.print("영어 총점은" +student_sum[1]+"이고 평균은"+dformat.format(student_sum[1]/5.0) +"입니다.\n");
		 System.out.print("수학 총점은" +student_sum[2]+"이고 평균은"+dformat.format(student_sum[2]/5.0) +"입니다.\n");
         for(int i = 0 ; i < 5 ; i++){
		 System.out.print(i+1+"번 학생의 총점은" +student_arr[i][3]+"이고 평균은"+dformat.format(student_arr[i][3]/3.0)+"입니다.\n");
         }
	 }
}
