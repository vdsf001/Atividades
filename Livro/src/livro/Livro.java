package livro;

import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        autor livro=new autor();
        
        System.out.println("Autor: ");
        String nome=teclado.nextLine();
        livro.setAutor(nome);
        
        System.out.println("Editora: ");
        String nome2=teclado.nextLine();
        livro.setEditora(nome2);
        
        System.out.println("Preço: ");
        Float preco=teclado.nextFloat();
        livro.setPreco(preco);
        
        System.out.println("Autor: "+livro.getAutor()+"\nEditora: "+livro.getEditora()+"\nPreço: "+livro.getPreco());
    }
}
