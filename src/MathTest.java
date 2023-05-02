public class MathTest {

	public static void main(String[] args) {
		
		System.out.println("Java Esercise");
		int resultMoltiplication = moltiplication(5, 2);
		System.out.println(resultMoltiplication);
		
		String resultConcat = concatenament("Ciao ", 100);
		System.out.println(resultConcat);
		
	}
	
	public static int moltiplication(int a, int b) {
		return a * b;
	}
	
	public static String concatenament(String parola, int number) {
		return parola + number;
	}
}



