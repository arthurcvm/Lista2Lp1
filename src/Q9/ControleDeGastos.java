/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q9;

/**
 *
 * @author arthu
 */
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
