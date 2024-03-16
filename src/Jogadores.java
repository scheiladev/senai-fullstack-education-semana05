import java.util.ArrayList;

public class Jogadores {

  static ArrayList<Jogador> melhoresJogadores = new ArrayList<>();

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

  public static Jogador buscarJogadorPorNome(String nome){
    for (Jogador jogador : melhoresJogadores){
      if (jogador.getNome().equalsIgnoreCase(nome)) {
        return jogador;
      }
    }
    return null;
  }

  public static void adicionarJogadores(Jogador jogador) {
    melhoresJogadores.add(jogador);
  }
}
