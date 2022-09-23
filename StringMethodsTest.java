
public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Change is inevitable";
		
		String mutation1, mutation2, mutation3;
		
		System.out.println("Printing the String phrase" +phrase);
		System.out.println("The string length is: " +phrase.length());
		
		String phrase2 = " except from vending machines";
		mutation1 = phrase.concat(phrase2);
		System.out.println(mutation1);
		
		mutation2 = mutation1.toUpperCase();
		System.out.println(mutation2);
		
		mutation3 = mutation1.substring(3);
		System.out.println(mutation3);
		
		System.out.println("Mutation 1 length is: " +mutation1.length());
		System.out.println("Mutation 2 length is: " +mutation2.length());
		System.out.println("Mutation 3 length is: " +mutation3.length());
		
		
	}

}
