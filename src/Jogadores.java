import java.util.ArrayList;
import java.util.Comparator;

public class Jogadores {

  static ArrayList<Jogador> listaJogadores = new ArrayList<>();

  public static void carregarJogadores() {
    listaJogadores.add(new Jogador("Maria", 15, 5, 3));
    listaJogadores.add(new Jogador("Pedro", 10, 1, 1));
    listaJogadores.add(new Jogador("Ana", 11, 15, 20));
    listaJogadores.add(new Jogador("Paulo", 9, 3, 3));
  }

  public static Jogador buscarJogadorPorNome(String nome){
    for (Jogador jogador : listaJogadores){
      if (jogador.getNome().equalsIgnoreCase(nome)) {
        return jogador;
      }
    }
    return null;
  }

  public static void adicionarJogadores(Jogador jogador) {
    listaJogadores.add(jogador);
  }

  public static void exibirJogadores(ArrayList<Jogador> jogadores, Jogador jogadorAtivo){
    int size = jogadores.size() - 1;

    System.out.println("---------------------------------------------------");
    System.out.println("                RANKING DE JOGADORES               ");
    System.out.println("---------------------------------------------------");
    for (int i = 0; i < jogadores.size(); i++) {
      Jogador jogador = jogadores.get(i);
      System.out.println((i + 1) + ". " + jogador.getNome() + " - " +  jogador.getPontuacao() +" Ponto(s) em " +  jogador.getNumeroTentativas() + " Tentativa(s)");
    }
    System.out.println("---------------------------------------------------");
    for (int i = 0; i < jogadores.size(); i++) {
      Jogador jogador = jogadores.get(i);
      if (jogadorAtivo.getNome() == jogador.getNome()) {
        System.out.println("Sua posição é: " + (i + 1) + ". " + jogadorAtivo.getNome());
      }
    }
  }

  public static void exibirTopJogadores(ArrayList<Jogador> jogadores){
    jogadores.sort(Comparator.comparingLong(Jogador::getPontuacao).reversed());

    System.out.println("---------------------------------------------------");
    System.out.println("                 TOP 10 JOGADORES                  ");
    System.out.println("---------------------------------------------------");
    for (int i = 0; i < jogadores.size() && i < 10 ; i++) {
      Jogador jogador = jogadores.get(i);
      System.out.println((i + 1) + "º " + jogador.getNome() + " - Pontuação: " + jogador.getPontuacao());
    }
  }
}
