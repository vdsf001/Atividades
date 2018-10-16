/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usafuncionario;

/**
 *
 * @author internet
 */
public class Funcionario {
    private String nome;
    private int registro;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void cadastrar(String nome, String endereco){
        System.out.println("Nome: "+nome+"\nEndereço: "+endereco);
    }
    
    public void multar(float valor){
        System.out.println("Valor da multa: "+valor);
    }
}
