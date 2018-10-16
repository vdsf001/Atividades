package usafuncionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaFuncionario {

    public static void main(String[] args) {
        Funcionario f1=new Funcionario();
        Funcionario f2=new Funcionario();
        Scanner teclado = new Scanner(System.in);
       try{
        System.out.println("Digite o nome do funcionario: ");
        String nome1 = teclado.nextLine();
        f1.setNome(nome1);
        
        System.out.println("Cargo: ");
        String cargo1 = teclado.nextLine();
        f1.setCargo(cargo1);
        
        System.out.println("Registro: ");
        int registro1 = teclado.nextInt();
        f1.setRegistro(registro1);
        
        //funcionario 2
        
        System.out.println("Funcionario: ");
        String nome2= teclado.nextLine();
        f2.setNome(nome2);
        
        System.out.println("Cargo: ");
        String cargo2 = teclado.nextLine();
        f2.setCargo(cargo2);
        
        System.out.println("Registro: ");
        int registro2 = teclado.nextInt();
        f2.setRegistro(registro2);
       } catch (InputMismatchException e){
           System.out.println("Invalido!");
       }
       
        //lista
        
        System.out.println("Funcionario: "+f1.getNome()+"\nCargo: "+f1.getCargo()+"\nRegistro: "+f1.getRegistro());
        
        System.out.println("Funcionario: "+f2.getNome()+"\nCargo: "+f2.getCargo()+"\nRegistro: "+f2.getRegistro());
        
     
        
        
    }
    
}
