package Q7;

public class CadastroDePessoas {
    public static void main(String args[]){
        Pessoa pes1 = new Pessoa("Geraldo");
        Pessoa pes2 = new Pessoa("Alceu", 75, "123456789");
        
        System.out.println(pes1.getNome()+" Idade: "+pes1.getIdade()
                            +" Telefone: "+pes1.getTelefone());
        System.out.println(pes2.getNome()+" Idade: "+pes2.getIdade()
                            +" Telefone: "+pes2.getTelefone());
        
        pes1.setIdade(70);
        pes1.setTelefone("987654321");
        
        System.out.println(pes1.getNome()+" Idade: "+pes1.getIdade()
                            +" Telefone: "+pes1.getTelefone());
        
    }
    
}
