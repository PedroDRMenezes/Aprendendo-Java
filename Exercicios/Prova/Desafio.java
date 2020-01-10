import java.util.Scanner;

public class Desafio {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		String RespUser;
		int acertos = 0;
		Questao teste[] = new Questao[4];

		teste[0] = new Questao("2", "1+1");
		teste[1] = new QuestaoComDica("Isidro", "Quem inventou o java?", "Professor com nome dificil");
		teste[2] = new QuestaoMutiplaEscolha("Grande", "Qual o tamanho da tera?", "Grande", "Pequena", "não sei né",
				"10", "Todas as anteriores");
		teste[3] = new QuestaoComDica("+ de 100", "Quantos anos o isidro tem?",
				"Ele toma vitaminas && tem o cabelo branco");

		for (int j = 0; j < teste.length; j++) {
			teste[j].aplicarQuestao(j);
			RespUser = teclado.nextLine();
			if (teste[j].corrigir(RespUser)) {
				acertos++;
			}
		}
		System.out.println("acertos = "+acertos);
		teclado.close();
	}
}
