import java.util.Scanner;

public class Uri1160 {
	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int qtdC = teclado.nextInt();     //O usuario define a quantidade de condições.
		int res[] = new int[qtdC];        //Criando um vetor de resposta do tamanho das condições.

		for (int i = 0; i < qtdC; i++) {  //For para receber os dados das condições e calcular a quantidade de anos.

			float C[] = new float[4];         //Criando vetor das condições DENTRO DO FOR.

			for (int n = 0; n < 4; n++) {     //Definindo a posição do vetor.

				C[n] = teclado.nextFloat();   //Adicionando os dados das condições na posição atual.

			}
			
			int contador = 0; //Inicializando DENTRO DO FOR a variavel da resposta da condição ATUAL.

			while (C[0] <= C[1]) {                         //Enquanto a Cidade A for menor que a Cidade B, soma 1 ao contador. 
				C[0] = C[0] + (int) (C[0] * (C[2] / 100));   //Cidade A Recebe nova população.
				C[1] = C[1] + (int) (C[1] * (C[3] / 100));   //Cidade B Recebe nova população.
				contador++;                                  //Soma 1 ao contador.
			}

			res[i] = contador;  //Acrecentando a resposta ao vetor que exibira as repostas. 

		}
		
		for (int i = 0; i < qtdC; i++) { //For que apresenta as respostas apos a execução dos cauculos.
			if (res[i] > 100) {			                 //Se o resutado for maior que 100.
				System.out.print("Mais de 1 seculo.\n");     //Exibira esta resposta.
			} else {                                     //Se não.
				System.out.print(res[i] + " anos.\n");       //Exibira a resposta da condição atual.
			}
		}
		teclado.close();
	}
}
