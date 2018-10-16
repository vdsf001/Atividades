package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        float n1,n2,res;
        Scanner leia=new Scanner(System.in);
        
        try{
        
        System.out.println("Insira o primeiro número: ");
        n1=leia.nextFloat();
        System.out.println("Insira o segundo número: ");
        n2=leia.nextFloat();
        
        res= n1 + n2;
        
        System.out.println("Resultado: "+res);
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Apenas Números!");
        
        }
          
        
        
        
        
    }
    
}
