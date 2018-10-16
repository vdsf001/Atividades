package javaapplication1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIdades {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ArrayList Lista = new ArrayList<>();
        float total = 0;
        try{
        for(int i = 0;i<=20;i++){
            System.out.println("Digite o n°"+i+": ");
            float a=teclado.nextFloat();
            total = total + a;
            Lista.add(a);
        }
  
            float media = total / 20;
            System.out.println("Média: "+media);
        } catch(InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Apenas números!");
        }   
       
    }
}
