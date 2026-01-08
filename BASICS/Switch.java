import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		switch(num%2) {
		case 0:
			System.out.println("this ia a even number");
			break;
		case 1:
		case -1:
			System.out.println("this odd number");
			break;
		default:
			System.out.println("invalid input!");
		
		}
		sc.close();
		
	}

}
