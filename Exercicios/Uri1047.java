import java.util.Scanner;

public class Uri1047 {

	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int HI, MI, HF, MF, H = 0, M = 0;

		HI = teclado.nextInt();
		MI = teclado.nextInt();
		HF = teclado.nextInt();
		MF = teclado.nextInt();
		
		if (HF == HI && MF == MI) {
			H = 24;
			M = 0;
		} else {
			if (MF < MI) {
				MF = MF + 60;
				HF = HF - 1;

			} else {
				if (HF < HI) {
					H = (24 - HI) + HF;
				} else {
					H = HF - HI;
				}
			}
			M = MF - MI;
		}

		System.out.print("O JOGO DUROU " + H + " HORA(S) E " + M + " MINUTO(S)");
		teclado.close();
	}

}
