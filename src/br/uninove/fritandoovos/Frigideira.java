package br.uninove.fritandoovos;

public class Frigideira {
    
    public TipoFrigideiraEnum TipoFrigideira;
    public IngredienteFrigideiraEnum IngredienteFrigideira;
    public byte QuantidadeColherIngrediente;
    
    public Frigideira(
            TipoFrigideiraEnum tipoFrigideiraEnum,
            IngredienteFrigideiraEnum ingredienteFrigideiraEnum){
        
        this.TipoFrigideira = tipoFrigideiraEnum;
        this.IngredienteFrigideira = ingredienteFrigideiraEnum;        
    }
    
    public void IndicarQuantidadeDoIngrediente(int quantidadeIngrediente){
        this.QuantidadeColherIngrediente = (byte)quantidadeIngrediente;
    }
    
}
