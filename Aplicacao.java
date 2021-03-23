import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class Aplicacao{
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("Quantos funcionarios registrar?");
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            
            System.out.println("Funcionario #"+(i+1)+":");
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            
            Funcionario emp = new Funcionario (id,nome,salario);
            
            list.add(emp);
            
            
        }
        
        System.out.print("Informe o Id do funcionario que terá o aumento salarial: ");
        
        int idAumento = sc.nextInt();
        Integer posicao = temId (list, idAumento);
        
        if (posicao == null){
            
            System.out.println("Esse id não existe!");
        }
        
        else{
            System.out.print("Informe a % do aumento: ");
            double porcentagem = sc.nextDouble();
            
            list.get(posicao).aumentoSalarial(porcentagem);
        }
        
        System.out.println();
        System.out.println("Lista de Funcionarios:");
        
        for (Funcionario emp:list){
            System.out.println(emp);
        }
        sc.close();
    }
    
    public static Integer temId(List<Funcionario> list,int id){ // metodo para verificar se um id existe na lista
        for (int i=0;i<list.size();i++){
            
            if (list.get(i).getId() == id){ //list.get(i) pega o elemento da posição informada
                return i;
            }
        }
    
        return null;
    }
    
      
}