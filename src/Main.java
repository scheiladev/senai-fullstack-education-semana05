import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  private static ArrayList<Jogador> melhoresJogadores = new ArrayList<>();
  private static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    iniciarJogo(entrada, melhoresJogadores);
    System.out.println();

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
          iniciarJogo(entrada, melhoresJogadores);
          System.out.println();
          break;
        case 0:
          return;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    } while (true);
  }

  public static void iniciarJogo(Scanner entrada, ArrayList<Jogador> jogadores) {
    Jogador jogador = new Jogador();
    String nomeJogador = "";

    while (jogador != null) {
      System.out.print("Digite o nome do jogador: ");
      nomeJogador = entrada.next();
      jogador = buscarJogadorPorNome(nomeJogador);
      if (jogador != null) {
        System.out.println("Este jogador já existe. Tente novamente");
      }
    }

    System.out.print("Digite a idade do jogador: ");
    int idadeJogador = entrada.nextInt();
    jogador = new Jogador(nomeJogador, idadeJogador);
    jogadores.add(jogador);

    jogarPedraPapelTesoura(jogadores);
  }

  public static Jogador buscarJogadorPorNome(String nome){
    for (Jogador jogador : melhoresJogadores){
      if (jogador.getNome().equalsIgnoreCase(nome)) {
        return jogador;
      }
    }
    return null;
  }

  public static void jogarPedraPapelTesoura(ArrayList<Jogador> jogadores) {
    System.out.println("Jogando...\n");
    exibirJogadores(jogadores);
  }

  public static void exibirJogadores(ArrayList<Jogador> jogadores){
    int size = jogadores.size() - 1;

    System.out.println("Ranking de Jogadores");
    for (int i = 0; i < jogadores.size() && i < 10 ; i++) {
      Jogador jogador = jogadores.get(i);
      System.out.println(jogador.getNome() + " - " + (i + 1));
    }
    System.out.println();
    System.out.println("Sua posição é: ");
    System.out.println(jogadores.get(size).getNome() + " - " + (size + 1));
  }
}