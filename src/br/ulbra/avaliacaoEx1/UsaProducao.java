package br.ulbra.avaliacaoEx1;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class UsaProducao extends Producao{
    
    public UsaProducao(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }
   
    public static void main(String[] args) {
           
    Scanner ler = new Scanner(System.in); 
    Producao prod = new Producao(0, 0, 0);
    
    prod.calcularHMS();
    System.out.println(prod.toString());
 
    System.out.println("Digite o nome da peça: ");
    prod.setPeca(ler.nextLine());
    
    System.out.println("Digite os segundos totais de producão: ");
    prod.setSegundos(ler.nextInt());
   
    prod.calcularHMS();
    
    System.out.println(prod.toString());
    
    }

   
}
    
    
    
    

