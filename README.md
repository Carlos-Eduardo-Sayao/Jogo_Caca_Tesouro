# Jogo Caça ao Tesouro

## Descrição:
O Jogo Caça ao Tesouro é um jogo de exploração em árvore binária feito em Java, onde o jogador percorre diferentes caminhos em busca de um tesouro escondido. Cada local visitado possui um valor de vitalidade, que pode aumentar ou diminuir sua energia. O objetivo é encontrar o tesouro antes que sua vitalidade chegue a zero , ou seja , o jogador vence quando encontrar o tesouro e perde se sua vitalidade chegar a zero.
## Estrutura do jogo:
O mapa é construído como uma árvore binária, onde cada nó representa um local da aventura. Cada local possui: nome, valor de vitalidade (+ ou −), caminhos para a esquerda e direita, e caminho de retorno. Tipos de nós: Locais comuns, Sem Tesouro, Tesouro.
## Objetivo:
Encontrar um dos nós com “Tesouro” e evitar que a vitalidade chegue a zero.
## Como jogar:
Durante a aventura, o jogador recebe opções dependendo do tipo de local visitado. Nó comum:  
1 - Seguir pela trilha da esquerda  
2 - Seguir pela trilha da direita  
3 - Voltar para o local anterior  
4 - Encerrar o jogo  
Folhas (Tesouro ou Sem Tesouro):  
1 - Indisponível  
2 - Indisponível  
3 - Voltar para o local anterior  
4 - Encerrar o jogo
## Estrutura do projeto:
app/  
├── Main.java → Executa o jogo  
├── Arvore.java → Monta todo o mapa e controla a lógica do jogo  
└── No.java → Representa cada local (nó) da árvore

