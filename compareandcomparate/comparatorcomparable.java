package compareandcomparate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class comparatorcomparable {
	public static void main(String[] args) {
		
//		  Integer[] arr = { 3, 4, 5, 63, 67, 2, 1, 677 }; System.err.println(arr[2]);
//		  Arrays.sort(arr); for (int i = 0; i < arr.length; i++) {
//		  System.out.println(arr[i]); } // System.out.println(Arrays.toString(arr));
//		  System.err.println(arr[2]); List<Integer> li = new
//		  ArrayList<>(Arrays.asList(arr)); System.out.println(li);
//		 
		students[] stu = {
				new students("reddy", 1, 45),
				new students("ravy", 3, 45),
				new students("racky", 2, 45), 
				new students("refy", 5, 45),
				new students("rste", 4, 45) 
				};
		System.out.println(Arrays.toString(stu));
		Arrays.sort(stu);
		System.out.println(stu);
		System.out.println(Arrays.toString(stu));
		List<students>li=new ArrayList<>(Arrays.asList(stu));
		System.out.println(li);
		

	}
}