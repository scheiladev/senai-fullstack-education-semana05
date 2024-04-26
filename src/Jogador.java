import java.util.Scanner;

public class Jogador {

  private String nome;
  private int idade;
  private int pontuacao = 0;
  private int numeroTentativas = 0;

  public int adicionaPontos() {
    return ++this.pontuacao;
  }

  public int perdePontos() {
    if (this.getPontuacao() >= 1) {
      return --this.pontuacao;
    }
    return this.getPontuacao();
  }

  public int adicionaTentativa() {
    return ++this.numeroTentativas;
  }

  public static Jogador loginJogo(Scanner entrada) {

    System.out.print("Digite o nome do jogador: ");
    String nomeJogador = entrada.next();

    Jogador jogador = Jogadores.buscarJogadorPorNome(nomeJogador);

    if (jogador != null) {
      System.out.println("Jogador localizado. Bom jogo.\n");
      return jogador;
    }

    System.out.print("Digite a idade do jogador: ");
    int idadeJogador = entrada.nextInt();

    jogador = new Jogador(nomeJogador, idadeJogador);
    System.out.println();

    Jogadores.adicionarJogadores(jogador);
    return jogador;
  }

  public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
    this.nome = nome;
    this.idade = idade;
    this.pontuacao = pontuacao;
    this.numeroTentativas = numeroTentativas;
  }

  public Jogador(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  public Jogador() { }

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

  public int getNumeroTentativas() {
    return numeroTentativas;
  }

  public void setNumeroTentativas(int numeroTentativas) {
    this.numeroTentativas = numeroTentativas;
  }
}
