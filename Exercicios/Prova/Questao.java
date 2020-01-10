

public class Questao {
	protected String r;
	protected String e;
	
	public Questao(String r, String e) {
		this.r = r;
		this.e = e;
	}
	
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	
	public void aplicarQuestao(int i){
		System.out.println("----------Questao "+i+"----------");
		System.out.println(e);
		System.out.println("---------------------------------");
	}
	
	public boolean corrigir(String i) {
		if(i.contentEquals(this.r)) {
			return true;
		} else {
			return false;
		}
	}
}
