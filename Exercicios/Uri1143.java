import java.util.Scanner;

public class Uri1143 {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int A;

		A = teclado.nextInt();

		for (int i = 1; i <= A;System.out.print(i+" "+i*i+" "+i*i*i+"\n"),i++)
			
		teclado.close();
		
	}

}
