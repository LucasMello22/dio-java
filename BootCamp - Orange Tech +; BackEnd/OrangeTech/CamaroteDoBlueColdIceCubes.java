import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = tamanhoDaFila / 2 + tamanhoDaFila % 2; // "%" é usado pra saber o resto da divisão"
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.

    }
}