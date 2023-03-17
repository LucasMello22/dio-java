
package com.mycompany.orangetech;

import java.util.Scanner; 
    
public class ImovelDisponivel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String entrada;
        entrada = sc.nextLine();
        String[] data;
        data = entrada.split("/");//quebra as strings, nesse caso, em "/"!
        System.out.println("Imovel: " + data[0] + " R$" + data[1] + " " + data[2]);
  }
}