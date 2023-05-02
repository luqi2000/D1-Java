import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		//perimetroRettangolo();
		pariDispari();
	}
	public static void perimetroRettangolo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert late number of rectang");
		int late1 = in.nextInt();
		System.out.println("Insert second late number of rectang");
		int late2 = in.nextInt();
		int result = (late1+late2)*2;

		System.out.println("Il perimetro del rettangolo e' " + result);
		in.close();
		
	}
	
	public static void pariDispari() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println(0);
        }else {
            System.out.println(1);
        }
        
        in.close();
    }
}
