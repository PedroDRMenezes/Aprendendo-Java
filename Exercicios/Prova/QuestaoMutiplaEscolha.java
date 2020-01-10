
public class QuestaoMutiplaEscolha extends Questao {

	private String A1;
	private String A2;
	private String A3;
	private String A4;
	private String A5;

	public QuestaoMutiplaEscolha(String r, String e, String a1, String a2, String a3, String a4, String a5) {
		super(r, e);
		this.A1 = a1;
		this.A2 = a2;
		this.A3 = a3;
		this.A4 = a4;
		this.A5 = a5;

	}

	public String getA1() {
		return A1;
	}

	public void setA1(String a1) {
		A1 = a1;
	}

	public String getA2() {
		return A2;
	}

	public void setA2(String a2) {
		A2 = a2;
	}

	public String getA3() {
		return A3;
	}

	public void setA3(String a3) {
		A3 = a3;
	}

	public String getA4() {
		return A4;
	}

	public void setA4(String a4) {
		A4 = a4;
	}

	public String getA5() {
		return A5;
	}

	public void setA5(String a5) {
		A5 = a5;
	}

	public void aplicarQuestao(int i) {
		System.out.println("----------Questao " + i + "----------");
		System.out.println(e);
		System.out.println("A -" + A1);
		System.out.println("B -" + A2);
		System.out.println("C -" + A3);
		System.out.println("D -" + A4);
		System.out.println("E -" + A5);
		System.out.println("-------------------------------------");
	}

}
