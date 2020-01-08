
public class TV {

	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;

	public void setMarca(String M) {
		this.marca = M;
	}

	public String getMarca() {
		return marca;
	}

	public void setVoltagem(int V) {
		this.voltagem = V;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setTamanho(int T) {
		this.voltagem = T;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setLigada(boolean L) {
		this.ligada = L;
	}

	public boolean getLigada() {
		return ligada;
	}

	public void setVolume(int Vo) {
		this.volume = Vo;
	}

	public int getVolume() {
		return volume;
	}

	public void setCanal(int C) {
		this.canal = C;
	}

	public int getCanal() {
		return canal;
	}

	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " esta " + ((ligada) ? "ligada!" : "desligando!"));
	}

	void almentarVolume() {
		System.out.println(((volume >= 20) ? "Volume maximo"
				: "A TV " + marca + " "
						+ ((ligada == true) ? "esta no volume " + (++volume) : "tem que ser ligada antes")));
	}

	void abaiaxarVolume() {
		System.out.println(((volume <= 0) ? "A Tv esta muda"
				: "A TV " + marca + " "
						+ ((ligada == true) ? "esta no volume " + (--volume) : "tem que ser ligada antes")));
	}

	void almentarCanal() {
		if (canal >= 10) {
			canal = 1;
			System.out.println("A TV " + marca + " esta no canal 1");
		} else {
			System.out.println("A TV " + marca + " "
					+ ((ligada == true) ? "esta no canal " + (++canal) : "tem que ser ligada antes"));
		}
	}

	void abaiaxarCanal() {
		if (canal <= 1) {
			canal = 10;
			System.out.println("A TV " + marca + " esta no canal 10");
		} else {
			System.out.println("A TV " + marca + " "
					+ ((ligada == true) ? "esta no canal " + (--canal) : "tem que ser ligada antes"));
		}
	}
}
