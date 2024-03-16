import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    Jogador jogador = novoJogador(entrada);
    Jogadores.adicionarJogadores(jogador);
    exibirMenu(entrada, jogador, Jogadores.melhoresJogadores);
    System.out.println();
  }

  private static void exibirMenu(Scanner entrada, Jogador jogador, ArrayList<Jogador> jogadores) {
    do {
      System.out.println("/-- FLIPERAMA MENU --/");
      System.out.println("1 - Jogar Pedra x Papel x Tesoura");
      System.out.println("2 - Jogar Número Secreto");
      System.out.println("0 - Sair");
      System.out.println("/--------------------/");
      System.out.println();

      System.out.print("Digite a opção desejada: ");
      int opcao = entrada.nextInt();
      System.out.println();
      switch (opcao) {
        case 1:
          Jogo.jogar(entrada, jogador, jogadores);
          System.out.println();
          break;
        case 2:
          System.out.print("Digite um número qualquer: ");
          int limite = entrada.nextInt();
          Jogo.jogar(entrada, jogador, jogadores, limite);
          System.out.println();
          break;
        case 0:
          return;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);
  }

  private static Jogador novoJogador(Scanner entrada) {
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

    return jogador;
  }
}