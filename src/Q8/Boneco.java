package Q8;

public class Boneco {
    private String nome;
    private int idade;
    private int posicaoX;
    private int posicaoY;
    private String cor;

    public Boneco(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getPosicaoX(){
        return this.posicaoX;
    }
    public int getPosicaoY(){
        return this.posicaoY;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPosicao(int novoX, int novoY){
        this.posicaoX = novoX;
        this.posicaoY = novoY;
    }
    
    
}
