// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
import java.text.DecimalFormat;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble(), idadePlan;
    String planeta = scanner.next(); 
    DecimalFormat formatador = new DecimalFormat("0.00");
   
    
    switch (planeta){
      case "Jupiter":
        idadePlan = idadeTerrestre/11.86;
        System.out.println("Idade equivalente em Jupiter: " + formatador.format(idadePlan) + " anos");
        break;
      case "Marte":
         idadePlan = idadeTerrestre/1.88;
        System.out.println("Idade equivalente em Marte: " +  formatador.format(idadePlan) + " anos");
        break; 
      case "Venus":
        idadePlan = idadeTerrestre/0.62;  
        System.out.println("Idade equivalente em Venus: " + formatador.format(idadePlan) + " anos");
        break;
      default:
        System.out.println("Planeta invalido.");
    }
  }

}