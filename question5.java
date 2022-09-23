import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter a value");
		a = scan.nextInt(); 
		System.out.println("Enter b value");
		b = scan.nextInt();
		System.out.println("Enter c value");
		c = scan.nextInt();
		double root1 = -b+Math.sqrt(Math.pow(b, 2) -4*a*c/2*a);
		double root2 = b-Math.sqrt(Math.pow(b, 2) -4*a*c/2*a);
		System.out.println(root1);
		System.out.println(root2);


		
		
	}

}
