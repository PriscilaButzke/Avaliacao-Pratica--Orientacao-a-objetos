package br.ulbra.avaliacaoEx2;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Principal {
    public static void main(String[] args) {
        
        Pessoa pessoa =new Pessoa(0, 0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Olá, vamos calcular seu IMC"
                          + "(Índice de Massa Corpórea)");
        
        System.out.println("Digite seu peso: ");
        pessoa.setPeso(ler.nextDouble());
        
        System.out.println("Digite sua altura: ");
        pessoa.setAltura(ler.nextDouble());
        
        System.out.println( pessoa.toString()); 
    }
    
}