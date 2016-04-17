/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q9;

/**
 *
 * @author arthurcvm
 */
public class Despesa {
    private double valor;
    private String tipoDeGasto;

    public Despesa(String tipoDeGasto, double valor){
        this.valor = valor;
        this.tipoDeGasto = tipoDeGasto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoDeGasto() {
        return tipoDeGasto;
    }

    public void setTipoDeGasto(String tipoDeGasto) {
        this.tipoDeGasto = tipoDeGasto;
    }
    
    
}
