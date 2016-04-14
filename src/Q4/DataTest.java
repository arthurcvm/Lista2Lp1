package Q4;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args){
        Scanner le = new Scanner (System.in);
        int dia, mes, ano,nDia;
        
        System.out.print("Digite o dia: ");
        dia = le.nextInt();
        
        System.out.print("Mês: ");
        mes = le.nextInt();
        
        System.out.print("Ano: ");
        ano = le.nextInt();
        
        Data data = new Data(dia,mes,ano);
        
        System.out.println(data.toString());
        
        data.avancarDia();
        System.out.println(data.toString());
        System.out.println(data.getDia());
        
        System.out.print("Digite um novo dia: ");
        nDia = le.nextInt();
        
        data.setDia(nDia);
    }
    
}
