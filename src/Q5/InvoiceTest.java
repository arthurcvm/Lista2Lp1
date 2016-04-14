/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;

import java.util.Scanner;

/**
 *
 * @author arthurcvm
 */
public class InvoiceTest {
    public static void main(String[] args){
        Scanner le = new Scanner(System.in);
        double total = 0;
        
        System.out.print("Quantos produtos serão faturados? ");
        int qtProd = le.nextInt();
        
        Invoice produto[] = new Invoice[qtProd];
        
        for(int i = 0; i< qtProd; i++){
            produto[i] = new Invoice();
            produto[i].setNum(i+1);
            System.out.println("Produto: "+(i+1));
            System.out.println("Insira uma descrição:");
            String descricao = le.next();
            produto[i].setDescricao(descricao);
            
            System.out.print("Insira um preço: ");
            double preco = le.nextDouble();
            produto[i].setPreco(preco);
            
            System.out.print("Insira a quantidade: ");
            int quant = le.nextInt();
            produto[i].setQuantidade(quant);
            
            total += produto[i].getInvoiceAmount();
        }
        
        for(Invoice e: produto){
            System.out.println("Número do produto: "+e.getNum());
            System.out.println("Descrição: "+e.getDescricao());
            System.out.println("Quantidade: "+e.getQuantidade());
            System.out.println("Preço: R$"+e.getPreco()+"\n");
        }
        System.out.println("O total é: R$"+total);
    }
    
}
