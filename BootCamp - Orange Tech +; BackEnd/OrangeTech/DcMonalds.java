// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a par tir de um caracter definido por você e coloca em um array. 

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String data[];
        data = ingredientes.split(";");
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println( data[2]);
        System.out.println(data[3]);
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

    }
}