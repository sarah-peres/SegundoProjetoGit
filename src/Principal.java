
public class Principal {

	public static void main(String[] args) {
		int a=5, b=0;
		try {
			double resultado;
			resultado = a/b;
			System.out.println("O resultado da divisao e:"+resultado);
		}catch (ArithmeticException e) {
			System.out.println("Voce nao pode dividir por zero");
		}finally {
		System.out.println("A = "+ a);
		System.out.println("B = "+ b);
		System.out.println("Fim do programa");
		}
		
	}

}
