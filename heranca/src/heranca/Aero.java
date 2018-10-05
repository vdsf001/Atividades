package heranca;

import heranca.Aeronave;
import heranca.AeronaveAsasRotativas;
import heranca.JatoDeCaca;
import java.util.Scanner;

public class Aero {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        //cadastrar aeronave
        Aeronave aero=new Aeronave();
        System.out.println("Número de ocupantes: ");
        aero.setNumero_ocup(teclado.nextInt());
        
        System.out.println("Capacidade de cargo: ");
        aero.setCapacidade_cargo(teclado.nextFloat());
        
        //Cadastrar Aeronave Asas Rotativas
        AeronaveAsasRotativas aAR=new AeronaveAsasRotativas();
        
        System.out.println("Ligado ou desligado: ");
        aAR.setRotorDeCalda(teclado.nextBoolean());
        teclado.nextLine();
        
        //Cadastrar Jato de caça
        JatoDeCaca armamento=new JatoDeCaca();
        
        System.out.println("Tipo de armamento: ");
        armamento.setArmamento(teclado.nextLine());
        
      
        
        
    }

}
