package Q10;

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
