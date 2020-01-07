import java.util.Scanner;

public class Uri1160 {
	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int qtdC = teclado.nextInt();     //O usuario define a quantidade de condi��es.
		int res[] = new int[qtdC];        //Criando um vetor de resposta do tamanho das condi��es.

		for (int i = 0; i < qtdC; i++) {  //For para receber os dados das condi��es e calcular a quantidade de anos.

			float C[] = new float[4];         //Criando vetor das condi��es DENTRO DO FOR.

			for (int n = 0; n < 4; n++) {     //Definindo a posi��o do vetor.

				C[n] = teclado.nextFloat();   //Adicionando os dados das condi��es na posi��o atual.

			}
			
			int contador = 0; //Inicializando DENTRO DO FOR a variavel da resposta da condi��o ATUAL.

			while (C[0] <= C[1]) {                         //Enquanto a Cidade A for menor que a Cidade B, soma 1 ao contador. 
				C[0] = C[0] + (int) (C[0] * (C[2] / 100));   //Cidade A Recebe nova popula��o.
				C[1] = C[1] + (int) (C[1] * (C[3] / 100));   //Cidade B Recebe nova popula��o.
				contador++;                                  //Soma 1 ao contador.
			}

			res[i] = contador;  //Acrecentando a resposta ao vetor que exibira as repostas. 

		}
		
		for (int i = 0; i < qtdC; i++) { //For que apresenta as respostas apos a execu��o dos cauculos.
			if (res[i] > 100) {			                 //Se o resutado for maior que 100.
				System.out.print("Mais de 1 seculo.\n");     //Exibira esta resposta.
			} else {                                     //Se n�o.
				System.out.print(res[i] + " anos.\n");       //Exibira a resposta da condi��o atual.
			}
		}
		teclado.close();
	}
}
