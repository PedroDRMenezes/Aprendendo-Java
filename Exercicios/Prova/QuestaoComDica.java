
public class QuestaoComDica extends Questao{
	
	public QuestaoComDica(String r, String e, String d) {
		super(r, e);
		this.dica = d;
	}

	private String dica;
	
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public void aplicarQuestao(int i){
		System.out.println("----------Questao "+i+"----------");
		System.out.println(e);
		System.out.println("Dica:"+	dica);
		System.out.println("---------------------------------");
	}

}
