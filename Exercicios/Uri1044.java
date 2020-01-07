import java.util.Scanner;

public class Uri1044 {
	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int A, B;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		if(A%B==0||B%A==0) {
			System.out.print("Sao Multiplos");
		}
		else {
			System.out.print("Nao sao Multiplos");
		}
		
		teclado.close();
	}

}
