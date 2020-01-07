import java.util.Scanner;

public class Uri1101 {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int Menor, Maior, sub, res, som;

		Menor = teclado.nextInt();
		Maior = teclado.nextInt();
		
		if (Menor != 0 && Maior != 0) {
			if (Maior < Menor) {
				sub = Maior;
				Maior = Menor;
				Menor = sub;
			}

			res = Menor;
			som = res;

			for (int I = 0; I < (Maior - Menor); I++) {
				System.out.print(res);
				res++;
				som = som + res;
			}

			System.out.print(res + "\n");
			System.out.print(som);
			teclado.close();
		} 
	}
}
