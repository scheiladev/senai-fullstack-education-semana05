import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    iniciarJogo(entrada, Jogadores.melhoresJogadores);
    System.out.println();
    exibirMenu(entrada);
  }

  private static void exibirMenu(Scanner entrada) {
    do {
      System.out.println("/-- FLIPERAMA MENU --/");
      System.out.println("1 - Novo Jogo");
      System.out.println("0 - Sair");
      System.out.println("/--------------------/");
      System.out.println();

      System.out.print("Digite a opção desejada: ");
      int opcao = entrada.nextInt();
      System.out.println();
      switch (opcao) {
        case 1:
          iniciarJogo(entrada, Jogadores.melhoresJogadores);
          System.out.println();
          break;
        case 0:
          return;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);
  }

  private static void iniciarJogo(Scanner entrada, ArrayList<Jogador> jogadores) {
    Jogador jogador = new Jogador();
    String nomeJogador = "";

    while (jogador != null) {
      System.out.print("Digite o nome do jogador: ");
      nomeJogador = entrada.next();
      jogador = Jogadores.buscarJogadorPorNome(nomeJogador);
      if (jogador != null) {
        System.out.println("Este jogador já existe. Tente novamente.\n");
      }
    }

    System.out.print("Digite a idade do jogador: ");
    int idadeJogador = entrada.nextInt();
    jogador = new Jogador(nomeJogador, idadeJogador);
    jogadores.add(jogador);

    System.out.println();

    Jogo.jogar(entrada, jogador, jogadores);
  }
}