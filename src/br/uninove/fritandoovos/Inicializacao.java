package br.uninove.fritandoovos;

public class Inicializacao {

    public static void main(String args[]) {

        FritarOvo ovoFrito = new FritarOvo(TipoFrigideiraEnum.PEQUENA, IngredienteFrigideiraEnum.OLEO);
        ovoFrito.Preparar(2);
        ovoFrito.ObterOvos();
        ovoFrito.Processar();
        

    }
}
