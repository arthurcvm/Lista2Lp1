package Q10;

public class Pagamentos {
    public static void main(String args[]){
        Pagamento pagamentos[] = new Pagamento[2];
        pagamentos[0] = new Pagamento("José",840.50);
        pagamentos[1] = new Pagamento("João",1500.35);
        
        ControleDePagamentos total = new ControleDePagamentos();
        total.setPagamentos(pagamentos);
        
        System.out.println("Total dos pagamentos: R$"
                            +total.calculaTotalDePagamentos());
        System.out.println("Há pagamentos para João? "
                            +total.existePagamentoParaFuncionario("João"));
        
        System.out.println("Pagamento de José: R$"
                            +pagamentos[0].getValorPagamento());
        pagamentos[0].setValorPagamento(900.00);
        System.out.println("Pagamento de José: R$"
                            +pagamentos[0].getValorPagamento());
        
    }
    
}
