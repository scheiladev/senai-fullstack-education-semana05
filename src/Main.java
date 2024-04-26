import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static Scanner entrada = new Scanner(System.in);
  public static Jogador jogadorAtivo;

  public static void main(String[] args) {

    Jogadores.carregarJogadores();

    iniciarJogo();
  }

  public static void iniciarJogo(){
    do {
      jogadorAtivo = Jogador.loginJogo(entrada);
      exibirMenu(entrada, jogadorAtivo, Jogadores.listaJogadores);
      System.out.println();
    } while (true);
  }

  public static void exibirMenu(Scanner entrada, Jogador jogadorAtivo, ArrayList<Jogador> jogadores) {
    do {
      System.out.println("--- FLIPERAMA MENU --------------------------------");
      System.out.println("1 - Jogar Pedra x Papel x Tesoura");
      System.out.println("2 - Jogar Número Secreto");
      System.out.println("0 - Sair");
      System.out.println("---------------------------------------------------");
      System.out.print("Opção escolhida: ");
      int opcao = entrada.nextInt();
      System.out.println();
      switch (opcao) {
        case 1:
          Jogo.jogar(entrada, jogadorAtivo, jogadores);
          break;
        case 2:
          System.out.print("Digite um número qualquer: ");
          int limite = entrada.nextInt();
          Jogo.jogar(entrada, jogadorAtivo, jogadores, limite);
          break;
        case 0:
          iniciarJogo();
        default:
          System.out.println("Opção inválida! Tente novamente.\n");
      }
    } while (true);
  }

}