/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q10;

/**
 *
 * @author arthu
 */
public class ControleDePagamentos {
    Pagamento pagamentos[] = new Pagamento[2];
    
    public void setPagamentos(Pagamento pagamentos[]){
        this.pagamentos = pagamentos;
    }
    public double calculaTotalDePagamentos(){
        double total = 0;
        for(int i = 0;i < pagamentos.length;i++){
            total += pagamentos[i].getValorPagamento();
        }
        
        return total;
    }
    
    public boolean existePagamentoParaFuncionario(String nomeFuncionario){
        for(int i = 0;i < pagamentos.length;i++){
            if(nomeFuncionario.equals(pagamentos[i].getNomeDoFuncionario())){
                return true;
            }
        }return false;
    }
    
}
