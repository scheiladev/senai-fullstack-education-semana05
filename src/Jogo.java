import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

  public static Random random = new Random();

  public static void jogar(Scanner entrada, Jogador jogador, ArrayList<Jogador> jogadores) {

    String melhorJogador;
    int numeroJogadas;

    String apostaSistema = apostaSistema();
    String apostaJogador = apostaJogador(entrada);

    System.out.println("Sistema: " + apostaSistema + " x Jogador: " + apostaJogador);
    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Pedra")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Papel")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Tesoura") ) {
      System.out.println("----------------------------------");
      System.out.println("Empate!");
      jogador.adicionaTentativa();
    }

    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Papel")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Tesoura")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Pedra") ) {
      System.out.println("----------------------------------");
      System.out.println("Você perdeu!");
      jogador.perdePontos();
      jogador.adicionaTentativa();
    }

    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Tesoura")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Pedra")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Papel") ) {
      System.out.println("----------------------------------");
      System.out.println("Você ganhou!");
      jogador.adicionaPontos();
      jogador.adicionaTentativa();
    }

    System.out.println("----------------------------------");
    System.out.println("Pontuação: " + jogador.getPontuacao());
    System.out.println("Tentativas: " + jogador.getNumeroTentativas());
    System.out.println("----------------------------------\n");

    Jogadores.exibirJogadores(jogadores);
  }

  public static String apostaSistema() {
    int sistema = random.nextInt(3) + 1;
    return escolha(sistema);
  }

  public static String apostaJogador(Scanner entrada) {
    int jogada;
    do {
      System.out.println("Digite sua aposta:");
      System.out.println("1 - Pedra");
      System.out.println("2 - Papel");
      System.out.println("3 - Tesoura");
      jogada = entrada.nextInt();
      System.out.println();
      if (jogada < 1 || jogada > 3) {
        System.out.println("Jogada inválida! Tente novamente.\n");
      } else {
        return escolha(jogada);
      }
    } while (true);

  }

  public static String escolha(int aposta) {
    switch (aposta) {
      case 1:
        return "Pedra";
      case 2:
        return "Papel";
      case 3:
        return "Tesoura";
      default:
        return null;
    }
  }
}
