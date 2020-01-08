import java.util.Scanner;
public class AppQueTestaTV {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		TV t1;
		t1 = new TV();
		
		t1.setMarca("LG");
		t1.setVoltagem(110);
		t1.setTamanho(49);
		t1.setLigada(false);
		t1.setCanal(5);
		t1.setVolume(5);
		
		do {
			System.out.println("''''''''''''''''''''''''''''''''''''''");
			System.out.println("         Controle remoto da tv        ");
			System.out.println("--------------------------------------");
			System.out.println(" 1 - Ligar/Desligar                   ");
			System.out.println(" 2 - Aumentar volume                  ");
			System.out.println(" 3 - Diminuir volume                  ");
			System.out.println(" 4 - Avançar canal                    ");
			System.out.println(" 5 - Voltar canal                     ");
			System.out.println(" 0 - Encerrar Sistema                 ");
			System.out.println("''''''''''''''''''''''''''''''''''''''");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.almentarVolume();
				break;
			case 3:
				t1.abaiaxarVolume();
				break;
			case 4:
				t1.almentarCanal();
				break;
			case 5:
				t1.abaiaxarCanal();
				break;
			}
			System.out.println("\n");
			
		}while(opcao != 0);
		
		teclado.close();
		
	}
}
