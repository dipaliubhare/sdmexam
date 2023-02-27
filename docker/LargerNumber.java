import java.util.Scanner;

public class LargerNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a + "greater than "+b);
		}else {
			System.out.println(b + "greater than "+a);
		}
		sc.close();
	}


}