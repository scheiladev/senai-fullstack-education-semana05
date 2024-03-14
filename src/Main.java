import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Jogador> melhoresJogadores = new ArrayList<>();

    System.out.println("/***** Bem vindos ao jogo *****/");
    System.out.println("/    Pedra x Papel x Tesoura   /");
    System.out.println("/******************************/");
    System.out.println();
    iniciarJogo(entrada, melhoresJogadores);
    jogarPedraPapelTesoura(melhoresJogadores);
    System.out.println();

    do {
      System.out.println("/-------- MENU --------/");
      System.out.println("1 - Novo Jogo");
      System.out.println("0 - Sair");
      System.out.println("/----------------------/");
      System.out.println();

      System.out.print("Digite a opção desejada: ");
      int opcao = entrada.nextInt();
      System.out.println();
      switch (opcao) {
        case 1:
          iniciarJogo(entrada, melhoresJogadores);
          jogarPedraPapelTesoura(melhoresJogadores);
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
    System.out.print("Digite o nome do jogador: ");
    String nomeJogador = entrada.next();
    System.out.print("Digite a idade do jogador: ");
    int idadeJogador = entrada.nextInt();

    Jogador jogador = new Jogador(nomeJogador, idadeJogador);

    jogadores.add(jogador);
    System.out.println();
  }

  public static void jogarPedraPapelTesoura(ArrayList<Jogador> jogadores) {
    System.out.println("Jogando...\n");
    exibirJogadores(jogadores);
  }

  public static void exibirJogadores(ArrayList<Jogador> jogadores){
    Jogador jogador;
    int size = jogadores.size() - 1;

    System.out.println("Ranking de Jogadores");
    for (int i = 0; i < jogadores.size() && i < 10 ; i++) {
      jogador = jogadores.get(i);
      System.out.println(jogador.getNome() + " - " + (i + 1));
    }
    System.out.println();
    System.out.println("Sua posição é: ");
    System.out.println(jogadores.get(size).getNome() + " - " + (size + 1));
  }
}