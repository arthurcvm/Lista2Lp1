package Q10;

public class Pagamento {
    private double valorPagamento;
    private String nomeDoFuncionario;
    
    public Pagamento(String nomeDoFuncionario, double valorPagamento){
        this.valorPagamento = valorPagamento;
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }
}
