package Q8;

import java.util.Scanner;

public class MeuJogo2 {
    public static void main(String args[]){
        Scanner le = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.print("Quantidade de bonecos: ");
        int tam = le.nextInt();
        
        Boneco bonecos[] = new Boneco[tam];
        
        for(int i = 0;i < tam;i++){
            System.out.print("\nDigite o nome: ");
            nome = le.next();
            System.out.print("Digite a idade: ");
            idade = le.nextInt();
          
            bonecos[i] = new Boneco(nome,idade);
        }
        
        Boneco menor = new Boneco(null, 99);
        for(Boneco e: bonecos){
            if(e.getIdade() < menor.getIdade()){
                menor = e;
            }
        }
        System.out.println("O menor: "+menor.getNome()+", "
                +menor.getIdade());
    }
    
}
