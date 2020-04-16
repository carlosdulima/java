package br.uninove.calculadoraimc;

public class CalculoIMC {
    
    public String Calcular(float peso, float altura){
        return this.Calcular(String.valueOf(peso), String.valueOf(altura));
    }
    
    public String Calcular(String peso, String altura){
        float pesoConvertido = Float.parseFloat(peso);
        float alturaConvertido = Float.parseFloat(altura);
        
        return String.format("%.2f", pesoConvertido / (alturaConvertido * alturaConvertido));
    }
    
}
