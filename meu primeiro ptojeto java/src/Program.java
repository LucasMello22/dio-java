import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int velocidadeAtual;

    System.out.println("Qual a Velocidade Registrada?");
    velocidadeAtual = leitor.nextInt();
    if (velocidadeAtual <= 60) {
      System.out.println("Nao foi multado");
    }
    if (velocidadeAtual > 60) {
      System.out.println("Foi multado");
    }
  }
}