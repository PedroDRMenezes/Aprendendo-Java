import java.util.Scanner;

public class Uri1060 {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		float N[] = new float[6];
		int Positivos=0;
		
		for (int i = 0; i < 6; i++) {
			N[i] = teclado.nextFloat();
			if(N[i]>0) {
				Positivos++;
			}
		}
		System.out.print(Positivos+" valores positivos");
		teclado.close();
		
	}

}
