package app;

public class No {
	private String nome;
	private No esquerda;
	private No direita;
	private No anterior;
	private int vida;
	
	public No(String nome,int vida) {
		this.nome = nome;
		this.esquerda = null;
		this.direita = null;
		this.anterior = null;
		this.vida = vida;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public No getEsquerda() {
		return this.esquerda;
	}
	
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public No getDireita() {
		return this.direita;
	}
	
	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public No getAnterior() {
		return this.anterior;
	}
	
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	public boolean eFolha() {
		return this.esquerda == null && this.direita ==  null;
	}
	
	
}
