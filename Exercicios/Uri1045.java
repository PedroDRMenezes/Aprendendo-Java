import java.util.Scanner;

public class Uri1045 {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		double tri[] = new double[3], sb, a, b, c;

		tri[0] = teclado.nextDouble();
		tri[1] = teclado.nextDouble();
		tri[2] = teclado.nextDouble();

		for (int t = 0; t < 3; t++) {
			for (int j = 0; j < 2; j++) {
				if (tri[j] < tri[j + 1]) {
					sb = tri[j + 1];
					tri[j + 1] = tri[j];
					tri[j] = sb;
				}
			}
		}

		a = tri[0];
		b = tri[1];
		c = tri[2];

		if (a >= b + c) {
			System.out.print("NAO FORMA TRIANGULO");
		} else {
			if (a * a == b * b + c * c) {
				System.out.print("TRIANGULO RETANGULO\n");
			} else {
				if (a * a > b * b + c * c) {
					System.out.print("TRIANGULO OBTUSANGULO\n");
				} else {
					if (a * a < b * b + c * c) {
						System.out.print("TRIANGULO ACUTANGULO\n");
					}
				}
			}
			if (a == b && a == c) {
				System.out.print("TRIANGULO EQUILATERO");
			} else {
				if (a == b || a == c || b == c) {
					System.out.print("TRIANGULO ISOSCELES");
				}
			}
		}
		teclado.close();
	}
}
