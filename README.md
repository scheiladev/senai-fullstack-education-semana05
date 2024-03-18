# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 5

### M1S05 | Ex 1 - Crie a Classe Jogador

Vamos criar um jogo simples em Java!

Primeiramente crie a Classe Jogador.</br>
Cada vez que um jogo for instanciado devemos ter um novo objeto jogador.</br>
O Jogador deve ter os atributos: Nome, idade, pontuação, numeroTentivas.</br>
O Jogador deve ter os métodos: adicionaPontos, perdePontos, adicionaTentativa.

### M1S05 | EX 2 - Adicione encapsulamento ao Jogador

Todos os atributos devem estar como private.

Devemos ter um construtor que recebe todos os dados do jogador.</br>
E devemos ter getters e setters para esse jogador.

### M1S05 | EX 3 - Crie uma lista de melhores Jogadores

Devemos ter uma lista dos melhores jogadores.</br>
Essa lista terá os objetos de cada jogador, e a posição deles na lista reflete o ranking desse jogador.

### M1S05 | EX 4 - Ranking de Jogadores

A lista de jogadores é exibida ao final de cada jogo, se a lista tiver mais de 10 jogares devem aparecer apenas os top 10 jogadores.</br>
Ao exibir a lista o jogador deve ter um print ao final com o seu nome e a sua posição. </br>
A lista deve ser exibida da seguinte forma: nome do jogador - posição

### M1S05 | EX 5 - Valide se o jogador já existe

Sempre que um jogador for criado, adicione uma validação se o nome do jogador existe na lista de jogadores.</br>
Se ele já existir, peça para ele colocar outro nome, e isso deve rodar em loop.

### M1S05 | EX 6 - Crie o Jogo

Crie a Classe Jogo, essa classe vai ter o jogo em si, o jogo consiste em um pedra papel e tesoura, que o jogador deve inserir a sua jogada e o sistema irá retorna se ele ganhou ou não.</br>
O Jogo deve estar em um método jogar().</br>
O Jogo deve ter o atributo, melhor jogador(melhorJogador) e deve ter o número de vezes que o jogo foi jogado (numeroJogadas).</br>
Cada vez que um jogador ganha ele deve receber mais um ponto, cada tentativa adiciona ao numero de tentativas.

### M1S05 | EX 7 - Sobrecarga de Jogos

Crie uma sobrecarga do jogar() que será um novo jogo, esse deve receber um número, jogar(int num).

O jogo consiste em o jogador escolher um número de 0 até ‘num’(numero colocado no parâmetro).</br>
Se acertar ganha um ponto, se errar ele perde um ponto.

Tanto o número 'num', quanto o valor que o jogador escolher no jogo devem ser coletado por input no console.

### M1S05 | EX 8 - Main e loop principal

Crie na classe Main, no método main, a lógica de escolha dos jogos, ele deve rodar em um loop infinito.</br>
O jogador deve ou se identificar pelo nome, ou deve criar um novo jogador.</br>
O jogador deve poder escolher entre os jogos criados anteriormente, e ao final do jogo ele deve ter as opções: Ver ranking completo, ver os 10 maiores, jogar novamente ou sair do jogo.</br>
As escolhas podem ser por números ou por letras, seguindo o seguinte exemplo:

Qual das seguintes opções você deseja seguir:</br>
1 - Ver ranking completo</br>
2 - Ver top 10</br>
3 - Jogar novamente</br>
4 - Encerrar o Jogo</br>
Opção escolhida: <Numero escolhido pelo jogador>

