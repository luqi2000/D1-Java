import java.util.Scanner;

public class ConcatenamentString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert name");
		String name = in.nextLine();
		System.out.println("Insert Surname");
		String surname = in.nextLine();
		System.out.println("Insert nickname");
		String nickName = in.nextLine();

		System.out.println(name + surname + nickName);
		
		System.out.println(nickName + surname+ name);
	
		in.close();
 
	}

}
