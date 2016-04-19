package Q5;

public class Invoice {
    private int num;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public void Invoice(int num, String descricao, int quantidade,
                        double preco){
        this.num = num;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public double getInvoiceAmount(){
        if(quantidade < 0){
            quantidade = 0;
        }
        if(preco < 0){
            preco = 0.0;
        }
        return preco*quantidade;
    }
}
