package Q9;

public class Gasto {
    public static void main(String args[]){
        Despesa despesas[] = new Despesa[2];
        despesas[0] = new Despesa("aquario", 50.25);
        despesas[1] = new Despesa("lanches", 30.50);
        
        ControleDeGastos total = new ControleDeGastos();
        total.setDespesas(despesas);
        
        System.out.println("Despesas totais: " + total.calculaTotalDeDespesas());
        System.out.println("Tipo de despesas: " + despesas[0].getTipoDeGasto()+", "+despesas[1].getTipoDeGasto());
        System.out.println("Valor de cada despesa: "+despesas[0].getTipoDeGasto()+" - R$"+despesas[0].getValor()
                            +"\n"+despesas[1].getTipoDeGasto()+" - R$"+despesas[1].getValor());
        System.out.println("Despesa com pizza? "+total.existeDespesaDoTipo("pizza"));
        System.out.println("E aquario? "+total.existeDespesaDoTipo("aquario"));
    }    
}
