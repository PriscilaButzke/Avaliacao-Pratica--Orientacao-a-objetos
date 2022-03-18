package br.ulbra.avaliacaoEx1;

/**
 *
 * @author Priscila Butzke
 */
public class Producao {
    
    private String peca;
    private int segundos;
    private int hora;
    private int minuto;
    private int segundo;

    public Producao(int hora, int minuto, int segundo) {
        this.peca = "Teclado";
        this.segundos = 100;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public void setSegundos(int segundos) {
        
        if (segundos < 0){
             this.segundos = 100;
              System.out.println("Número negativo não é aceito. Valor considerado para cálculo é 100 segundos.");
        }else { 
            this.segundos = segundos;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    

    public void calcularHMS(){ //hora,minuto,segundo
        int r1,r2;
        
        this.hora = this.segundos / 3600;
        r1 = this.segundos%3600;
        this.minuto = r1 /60;
        this.segundo = r1 %60;
        
    }

    public String toString() {
        return "A peca: " + this.getPeca()+ " que levou um total de " + this.segundos + " levou "
                + this.getHora() + ":" + this.minuto + ":" + this.getSegundo()+ " para ficar pronta!!" ;
    } 
    
}  
    

   