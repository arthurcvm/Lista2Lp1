package Q9;

public class ControleDeGastos {
    Despesa despesas[] = new Despesa[2];

    public void setDespesas(Despesa[] despesas) {
        this.despesas = despesas;
    }
    
    public double calculaTotalDeDespesas(){
        double total = 0;
        for(int i = 0;i < despesas.length;i++){
            total += despesas[i].getValor();
        }
        return total;
    }
    
    public boolean existeDespesaDoTipo(String tipoDeGasto){
        for(int i = 0;i < despesas.length;i++){
            if(tipoDeGasto.equals(despesas[i].getTipoDeGasto())){
                return true;
            }
        }return false;
    }
    
    
    
}
