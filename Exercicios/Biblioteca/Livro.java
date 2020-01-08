
public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int posicaoEstante;
	private int posicaoPrateleira;
	private boolean disponivel;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosicaoEstante() {
		return posicaoEstante;
	}
	public void setPosicaoEstante(int posicaoEstante) {
		this.posicaoEstante = posicaoEstante;
	}
	public int getPosicaoPrateleira() {
		return posicaoPrateleira;
	}
	public void setPosicaoPrateleira(int posicaoPrateleira) {
		this.posicaoPrateleira = posicaoPrateleira;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int posicaoEstante,
			int posicaoPrateleira) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.posicaoEstante = posicaoEstante;
		this.posicaoPrateleira = posicaoPrateleira;
		this.disponivel = true;
	}
	
	public void exibir() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(anoPublicacao);
		System.out.println(categoria);
		System.out.println(posicaoEstante);
		System.out.println(posicaoPrateleira);
		System.out.println(disponivel);
		System.out.println("\n");
	}

}
