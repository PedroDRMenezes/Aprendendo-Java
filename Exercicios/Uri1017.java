import java.util.Scanner;

public class Uri1017 {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double T, V, D, G;
		
		T = teclado.nextDouble();
		V = teclado.nextDouble();
		
		D = T*V;
		G = D/12f;
		
		System.out.printf("%.3f\n",G);
		
		teclado.close();
	}
		
}
