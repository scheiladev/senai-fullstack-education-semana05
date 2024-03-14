public class Jogador {

  String nome;
  int idade;
  int pontuacao = 0;
  int numeroTentivas = 0;

  public int adicionaPontos() {
    return pontuacao++;
  }

  public int perdePontos() {
    return pontuacao--;
  }

  public int adicionaTentativa() {
    return numeroTentivas++;
  }
}
