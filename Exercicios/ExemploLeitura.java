
import java.util.Scanner;

public class ExemploLeitura {
	
	public static void main(String args[]){
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String Texto;
		
		System.out.print("Digite um nome:");
		Texto = teclado.nextLine();
		System.out.print("Digite um valor inteiro: ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real: ");
		b = teclado.nextFloat();
		
		System.out.println("Voce digitou o Nome: "+ Texto);
		System.out.println("Voce digitou os valores "+a+" e "+b);
		
		teclado.close();
	}
	
}
