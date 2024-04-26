import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

  public static Random random = new Random();

  public static void jogar(Scanner entrada, Jogador jogador, ArrayList<Jogador> jogadores) {
    int idJogo = 1;

    String apostaSistema = apostaSistema();
    System.out.println(apostaSistema);
    String apostaJogador = apostaJogador(entrada);

    System.out.println("SISTEMA: " + apostaSistema + " x " + jogador.getNome().toUpperCase() + ": " + apostaJogador);
    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Pedra")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Papel")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Tesoura") ) {
      System.out.println("---------------------------------------------------");
      System.out.println("HOUVE UM EMPATE!");
      jogador.adicionaTentativa();
    }

    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Papel")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Tesoura")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Pedra") ) {
      System.out.println("---------------------------------------------------");
      System.out.println("VOCÊ PERDEU!");
      jogador.perdePontos();
      jogador.adicionaTentativa();
    }

    if ( apostaJogador.equals("Pedra") && apostaSistema.equals("Tesoura")
         || apostaJogador.equals("Papel") && apostaSistema.equals("Pedra")
         || apostaJogador.equals("Tesoura") && apostaSistema.equals("Papel") ) {
      System.out.println("---------------------------------------------------");
      System.out.println("VOCÊ GANHOU!");
      jogador.adicionaPontos();
      jogador.adicionaTentativa();
    }

    System.out.println("---------------------------------------------------");
    System.out.println("Pontuação: " + jogador.getPontuacao());
    System.out.println("Tentativas: " + jogador.getNumeroTentativas());
    System.out.println("---------------------------------------------------");

    menuJogo(entrada, jogador, jogadores, idJogo);
  }

  public static void jogar(Scanner entrada, Jogador jogador, ArrayList<Jogador> jogadores, int num) {
    int idJogo = 2;
    int limite = random.nextInt(num + 1);
    System.out.println(limite);
    do {
      System.out.print("Escolha um número entre 0 e " + num + ": ");
      int apostaJogador = entrada.nextInt();

      if (apostaJogador != limite) {
        jogador.perdePontos();
        jogador.adicionaTentativa();
        System.out.println("VOCÊ ERROU! TENTE NOVAMENTE.");
        System.out.println("---------------------------------------------------");
        System.out.println("Pontuação: " + jogador.getPontuacao());
        System.out.println("Tentativas: " + jogador.getNumeroTentativas());
        System.out.println("---------------------------------------------------");
      } else {
        jogador.adicionaPontos();
        jogador.adicionaTentativa();
        System.out.println("VOCÊ ACERTOU E VENCEU A PARTIDA!");
        System.out.println("---------------------------------------------------");
        System.out.println("Pontuação: " + jogador.getPontuacao());
        System.out.println("Tentativas: " + jogador.getNumeroTentativas());
        System.out.println("---------------------------------------------------");
        menuJogo(entrada, jogador, jogadores, idJogo);
      }
    } while (true);
  }

  public static void menuJogo(Scanner entrada, Jogador jogador, ArrayList<Jogador> jogadores, int idJogo) {
    do {
      System.out.println("\n---------------------------------------------------");
      System.out.println("Qual das seguintes opções você deseja seguir:      ");
      System.out.println("---------------------------------------------------");
      System.out.println("1 - Ver ranking completo");
      System.out.println("2 - Ver top 10");
      System.out.println("3 - Jogar novamente");
      System.out.println("0 - Encerrar o Jogo");
      System.out.println("---------------------------------------------------");
      System.out.print("Opção escolhida: ");
      int opcao = entrada.nextInt();
      System.out.println();
      switch (opcao) {
        case 1:
          Jogadores.exibirJogadores(jogadores, Main.jogadorAtivo);
          break;
        case 2:
          Jogadores.exibirTopJogadores(jogadores);
          break;
      case 3:
        if ( idJogo == 1 ) {
          Jogo.jogar(entrada, jogador, jogadores);
        } else {
          System.out.print("Digite um número qualquer: ");
          int limite = entrada.nextInt();
          Jogo.jogar(entrada, jogador, jogadores, limite);
        }
        break;
      case 0:
        Main.exibirMenu(entrada, jogador, jogadores);
        break;
      default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);
  }

  public static String apostaSistema() {
    int sistema = random.nextInt(3) + 1;
    return pedraPapelTesoura(sistema);
  }

  public static String apostaJogador(Scanner entrada) {
    int jogada;
    do {
      System.out.println("Digite sua aposta:");
      System.out.println("1 - Pedra");
      System.out.println("2 - Papel");
      System.out.println("3 - Tesoura");
      System.out.print("Opção escolhida: ");
      jogada = entrada.nextInt();
      System.out.println();
      if (jogada < 1 || jogada > 3) {
        System.out.println("Jogada inválida! Tente novamente.\n");
      } else {
        return pedraPapelTesoura(jogada);
      }
    } while (true);

  }

  public static String pedraPapelTesoura(int aposta) {
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
