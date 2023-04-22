// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
import java.text.DecimalFormat;
public class MudancaparaIrlanda {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Leitura do salário e dos benefícios
    double salarioBruto = input.nextDouble();
    double beneficios = input.nextDouble();
    DecimalFormat formatador = new DecimalFormat("0.00");
    double imposto = 0, salarioLiquido;
    //TODO: Implemente as regras para o cálculo do imposto.
    
    if (salarioBruto <=1100){
    imposto = salarioBruto *0.05;
    salarioLiquido = salarioBruto - imposto + beneficios;
      System.out.println(formatador.format(salarioLiquido));
    }
      else if (salarioBruto>1100 && salarioBruto<=2500){
        imposto = salarioBruto *0.1;
           salarioLiquido = salarioBruto - imposto + beneficios;
        System.out.println(formatador.format(salarioLiquido));
        }
        else{
          imposto = salarioBruto*0.15;
             salarioLiquido = salarioBruto - imposto + beneficios;
          System.out.println(formatador.format(salarioLiquido));
        }
    //TODO: Imprimir o salário líquido com 2 casas decimais.
    
  }
}