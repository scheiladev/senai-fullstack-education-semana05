public class Jogador {

  private String nome;
  private int idade;
  private int pontuacao;
  private int numeroTentivas;

  public int adicionaPontos() {
    return pontuacao++;
  }

  public int perdePontos() {
    return pontuacao--;
  }

  public int adicionaTentativa() {
    return numeroTentivas++;
  }

  public Jogador(String nome, int idade, int pontuacao, int numeroTentivas) {
    this.nome = nome;
    this.idade = idade;
    this.pontuacao = pontuacao;
    this.numeroTentivas = numeroTentivas;
  }

  public Jogador(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    this.pontuacao = 0;
    this.numeroTentivas = 5;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(int pontuacao) {
    this.pontuacao = pontuacao;
  }

  public int getNumeroTentivas() {
    return numeroTentivas;
  }

  public void setNumeroTentivas(int numeroTentivas) {
    this.numeroTentivas = numeroTentivas;
  }
}
