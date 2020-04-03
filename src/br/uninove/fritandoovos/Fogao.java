package br.uninove.fritandoovos;

public class Fogao {
    private Frigideira frigideira;
    private FogoEnum fogoEnum;
    
    public Fogao(Frigideira frigideira){
        this.frigideira = frigideira;
    }
    
    public void Ascender(FogoEnum fogoEnum){
        this.fogoEnum = fogoEnum;
        
        System.out.println("Fogão ligado com fogo: " 
                + fogoEnum + " usando a frigideira: "
                + this.frigideira.TipoFrigideira + " com: "
                + this.frigideira.QuantidadeColherIngrediente + ""
                        + "colheres de " + this.frigideira.IngredienteFrigideira);
    }
    
    public void AjustarFogo(FogoEnum fogo){
        System.out.println("Fogo alterado de: " + this.fogoEnum + " para: " + fogo);
        this.fogoEnum = fogo;
    }
    
    public void Desligar(){
        this.fogoEnum = null;
        System.out.println("Fogão desligado");
    }
    
}
