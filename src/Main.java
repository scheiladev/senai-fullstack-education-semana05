import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Jogador> melhoresJogadores = new ArrayList<>();
    iniciarJogo(entrada, melhoresJogadores);

    do {
      System.out.println("Pedra x Papel x Tesoura");
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
  }
}