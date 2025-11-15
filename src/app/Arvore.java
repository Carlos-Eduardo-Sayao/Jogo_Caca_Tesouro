package app;
import java.util.Scanner;
public class Arvore {
	private int vitalidade = 25;
	private No raiz ;
	
	public void construirArvore() {
		No florestaDensa = new No("Floresta Densa",-2);
		raiz = florestaDensa;
		No bosqueChoroso = new No("Bosque Choroso",-4);
		No fontesSalgadas = new No("Fontes Salgadas",+3);
		No cavernaAbandonada = new No("Caverna Abandonada",-3);
		No tesouro1 = new No("Tesouro",0);
		No gruta = new No("A Gruta",-4);
		No viaDoVarejo = new No("Via do Varejo",-2);
		No aldeiaAlegre = new No("Aldeia Alegre",+2);
		No campoMusgoso = new No("Campo Musgoso",-1);
		No aldeiaAbandonada = new No("Aldeia Abandonada",-5);
		No lagoDaPreguica = new No("Lago da Preguiça",-2);
		No minasMatreiras = new No("Minas Matreiras",-4);
		No semTesouro1 = new No("Sem Tesouro",-1);
		No semTesouro2 = new No("Sem Tesouro",-1);
		No cachoeiraSonolenta = new No("Cachoeira Sonolenta",+1);
		No baiaQuebraMar = new No("Báia Quebra-Mar",-4);
		No tocaDasRaposas = new No("Toca das Raposas",-6);
		No tesouro2 = new No("Tesouro",0);
		No montesRochosos = new No("Montes Rochosos",-5);
		No semTesouro3 = new No("Sem Tesouro",-1);
		No bosqueGorduroso = new No("Bosque Gorduroso",-1);
		No fontesTermais = new No("Fontes Termais",+5);
		No santuario = new No("Santuário",+4);
		No tesouro3 = new No("Tesouro",0);
		No tesouro4 = new No("Tesouro",0);
		
		florestaDensa.setEsquerda(bosqueChoroso);
		florestaDensa.setDireita(viaDoVarejo);
		bosqueChoroso.setEsquerda(fontesSalgadas);
		bosqueChoroso.setDireita(cavernaAbandonada);
		cavernaAbandonada.setEsquerda(tesouro1);
		cavernaAbandonada.setDireita(gruta);
		viaDoVarejo.setEsquerda(aldeiaAlegre);
		viaDoVarejo.setDireita(lagoDaPreguica);
		aldeiaAlegre.setEsquerda(campoMusgoso);
		aldeiaAlegre.setDireita(aldeiaAbandonada);
		lagoDaPreguica.setEsquerda(minasMatreiras);
		lagoDaPreguica.setDireita(cachoeiraSonolenta);
		minasMatreiras.setEsquerda(semTesouro1);
		minasMatreiras.setDireita(semTesouro2);
		cachoeiraSonolenta.setEsquerda(baiaQuebraMar);
		cachoeiraSonolenta.setDireita(tocaDasRaposas);
		baiaQuebraMar.setEsquerda(tesouro2);
		baiaQuebraMar.setDireita(montesRochosos);
		montesRochosos.setEsquerda(semTesouro3);
		montesRochosos.setDireita(bosqueGorduroso);
		bosqueGorduroso.setEsquerda(fontesTermais);
		bosqueGorduroso.setDireita(santuario);
		santuario.setEsquerda(tesouro3);
		santuario.setDireita(tesouro4);
		bosqueChoroso.setAnterior(florestaDensa);
		fontesSalgadas.setAnterior(bosqueChoroso);
		cavernaAbandonada.setAnterior(bosqueChoroso);
		gruta.setAnterior(cavernaAbandonada);
		viaDoVarejo.setAnterior(florestaDensa);
		aldeiaAlegre.setAnterior(viaDoVarejo);
		campoMusgoso.setAnterior(aldeiaAlegre);
		aldeiaAbandonada.setAnterior(aldeiaAlegre);
		lagoDaPreguica.setAnterior(viaDoVarejo);
		minasMatreiras.setAnterior(lagoDaPreguica);
		cachoeiraSonolenta.setAnterior(lagoDaPreguica);
		baiaQuebraMar.setAnterior(cachoeiraSonolenta);
		tocaDasRaposas.setAnterior(cachoeiraSonolenta);
		montesRochosos.setAnterior(baiaQuebraMar);
		bosqueGorduroso.setAnterior(montesRochosos);
		fontesTermais.setAnterior(bosqueGorduroso);
		santuario.setAnterior(bosqueGorduroso);
		semTesouro1.setAnterior(minasMatreiras);
		semTesouro2.setAnterior(minasMatreiras);
		semTesouro3.setAnterior(montesRochosos);
	}
	
	public void cacarTesouro() {
		Scanner sc = new Scanner(System.in);
		No atual = raiz;
		while(true) {
			if(atual.eFolha() == true && atual.getNome().equalsIgnoreCase("Tesouro")) {
				System.out.println("Tesouro Encontrado");
				System.out.println("Parábens você venceu o jogo");
				break;
			}
			else if(atual.eFolha() == true && atual.getNome().equalsIgnoreCase("Sem Tesouro")) {
				System.out.println("Sem tesouros por aqui !");
			}
			else {
				System.out.println("Você está no(a):"+atual.getNome());
			}
			
			
			if(atual.getVida() > 0) {
				System.out.println("+"+atual.getVida()+" de vitalidade");
			}
			else {
				System.out.println(atual.getVida()+" de vitalidade");
			}
			vitalidade += atual.getVida();
			System.out.println("Vitalidade:"+vitalidade);
			if(vitalidade <=0) {
				System.out.println("Vitalidade menor ou igual a zero\nGAME OVER");
				break;
			}
			if(atual.eFolha() == true) {
				System.out.println("<<<opções>>\n1-Indisponível\n2-Indisponível\n3-Voltar para o local anterior\n4-Encerrar");
				int opcao = sc.nextInt();
				if(opcao == 3) {
					atual = atual.getAnterior();
				}
				else {
					System.out.println("Encerrando...");
					break;
				}
			}
			else {
				System.out.println("<<opções:>>\n1-Seguir pela trilha da esquerda\n2-Seguir pela trilha da direita\n3-Voltar para o local anterior\n4-Encerrar");
				int opcao = sc.nextInt();
				
				if(opcao == 1) {
					atual = atual.getEsquerda();
				}
				else if(opcao == 2) {
					atual = atual.getDireita();
				}
				else if(opcao == 3) {
					atual = atual.getAnterior();
				}
				else {
					System.out.println("Encerrando...");
					break;
				}
			}
		}
	}
}
