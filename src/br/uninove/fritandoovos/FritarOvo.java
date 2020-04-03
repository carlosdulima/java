package br.uninove.fritandoovos;

public class FritarOvo {
    private TipoFrigideiraEnum tipoFrigideiraEnum;
    private IngredienteFrigideiraEnum ingredienteFrigideiraEnum;
    private Fogao fogao;
    private int quantidadeOvos;
    
    public FritarOvo(TipoFrigideiraEnum tipoFrigideiraEnum,
            IngredienteFrigideiraEnum ingredienteFrigideiraEnum){
        this.tipoFrigideiraEnum = tipoFrigideiraEnum;
        this.ingredienteFrigideiraEnum = ingredienteFrigideiraEnum;
    }
    
    public void Preparar(int quantidadeOvos){
        System.out.println("Preparação foi iniciado");
        
        this.quantidadeOvos = quantidadeOvos;
        
        Frigideira objetoFrigideira = 
                new Frigideira(this.tipoFrigideiraEnum, this.ingredienteFrigideiraEnum);
        
        objetoFrigideira.IndicarQuantidadeDoIngrediente(quantidadeOvos);
        
        fogao = new Fogao(objetoFrigideira);
        fogao.Ascender(FogoEnum.MEDIO);
        
    }
    
    public int ObterOvos(){
        System.out.println("Obtendo " + quantidadeOvos + " ovos");
        return quantidadeOvos;
    }
    
    public void Processar(){
        System.out.println("Cozinhando " + this.quantidadeOvos);
        
        fogao.AjustarFogo(FogoEnum.BAIXO);
        
        //Verifico se cozinhou
        
        fogao.Desligar();
        
        System.out.println("Ovo pronto");
    }
}
