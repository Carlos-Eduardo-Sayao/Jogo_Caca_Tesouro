package app;

public class Main {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.construirArvore();
		System.out.println("===Jogo caça ao tesouro===");
		arvore.cacarTesouro();

	}

}
