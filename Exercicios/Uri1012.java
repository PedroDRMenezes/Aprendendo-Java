import java.util.Scanner;

public class Uri1012 {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a, b, c, TRI, CIR, TRA, QUA, RET;

		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		TRI = (a*c)/2;
		CIR = (c*c)*3.14159f;
		TRA = ((a+b)*c)/2;
		QUA = b*b;
		RET = a*b;
		
		System.out.print("TRIANGULO: ");
		System.out.printf("%.3f\n",TRI);
		System.out.print("CIRCULO: ");
		System.out.printf("%.3f\n",CIR);
		System.out.print("TRAPEZIO: ");
		System.out.printf("%.3f\n",TRA);
		System.out.print("QUADRADO: ");
		System.out.printf("%.3f\n",QUA);
		System.out.print("RETANGULO: ");
		System.out.printf("%.3f\n",RET);
		
		teclado.close();
		
	}
	
}
