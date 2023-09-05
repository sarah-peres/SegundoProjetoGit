import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1, n2;
		double media;
		try {
		System.out.println("Digite o primeiro valor");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = leia.nextInt();
		media = n1/n2;
		System.out.println("A media e: "+media);
		}catch (InputMismatchException e) {
			System.out.println("Voce colocou um valor errado. Por exemplo, no lugar do numero colocou caractere");
			
		}catch (ArithmeticException e) {
			System.out.println("Voce tentou fazer uma divisao impossivel.");
		}
	}
	
}
