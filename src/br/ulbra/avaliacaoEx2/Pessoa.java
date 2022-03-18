package br.ulbra.avaliacaoEx2;

/**
 *
 * @author Priscila Butzke
 */
public class Pessoa {
    private double altura;
    private double peso;
    
    
    public Pessoa (){
    }

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calculoImc(){
        double imc =0;
        
        imc = this.peso / (this.altura * this.altura);
        return imc;
        
    }
    
    public String tabelaImc(){
        
        if (calculoImc() < 18.5){
            return "\nVocê está abaixo do peso ideal!";
        }else  if(calculoImc() <= 24.99){
            return "\nParabéns, você está em seu peso normal!";
        }else if (calculoImc() <= 29.99){
            return"\nVocê está acima do seu peso(sobrepeso).";
        }else if(calculoImc() <=34.99){
            return "\nObeseidade grau I.";
        } else if(calculoImc()<= 39.99){
            return "\nObesidade grau II.";
        }else 
            return "\nObesidade grau III.";
            
    }
    
    public String toString(){
        
        return " Altura: " + this.altura
              + "\nPeso: " + this.peso
              + "\nCalculo de IMC: "
              + "\nIMC: " + String.format("%.2f", this.calculoImc())
              + this.tabelaImc();
    }
}
