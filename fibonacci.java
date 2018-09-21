/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

/**
 *
 * @author internet
 */
public class fibonacci {
    public static void main(String[] args) {
        int valor = 1;
        int antigo = 0;
     
        for(int c= 0;c <20;c++ ){
       
            valor  = valor + antigo;
            antigo = valor - antigo;
           
            System.out.println(valor);
        }
    }
    
}
