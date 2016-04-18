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
