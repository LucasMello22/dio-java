
import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        int novaMultas;
        novaMultas = multas;
     //   multas = 0;
        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        if (velocidade > 80 && multas <2) {
          multas = multas + 1;
          System.out.printf(multas + " multas. Nao levou pontos na carteira");
        }
        
        else if (velocidade > 80 && multas >=2 ){
            multas = multas + 1;
              System.out.printf(multas + " multas. Levou pontos na carteira");
        }
        
        else {
            System.out.printf(novaMultas + "multas. Não levou pontos na carteira");
        }
      
        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
