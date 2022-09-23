import java.util.Random;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
		
		int num1=generator.nextInt(8) + 3;
		System.out.println("The integer from 3 to 10 is:" +num1);
		
		int num2=generator.nextInt(25) +20;
		System.out.println("The integer from 20 to 44 is:" +num2);
		
		int num3=generator.nextInt(51) -20;
		System.out.println("The integer from -20 to 30 is:" +num3);
	}

}
