package Q6;

public class EmpregadoTest {
    public static void main(String[] args){
        
        Empregado emp1 = new Empregado("John","Connor",1500.50);
        Empregado emp2 = new Empregado("Luke","Sky",1300);
        
        System.out.println("Salário anual "+emp1.getNome()+" "
                        +emp1.getSobrenome()+": R$"
                        +(emp1.getSalario()*12));
        System.out.println("Salário anual "+emp2.getNome()+" "
                        +emp2.getSobrenome()+": R$"
                        +(emp2.getSalario()*12));
        
        double salario = emp1.getSalario();
        salario += (salario*0.1);
        emp1.setSalario(salario);
        
        salario = emp2.getSalario();
        salario += (salario*0.1);
        emp2.setSalario(salario);
        
        System.out.println("Salário anual "+emp1.getNome()+" "
                        +emp1.getSobrenome()+": R$"
                        +(emp1.getSalario()*12));
        System.out.println("Salário anual "+emp2.getNome()+" "
                        +emp2.getSobrenome()+": R$"
                        +(emp2.getSalario()*12));
        
    }
    
}
