package exemploheranca;

import heranca.Pessoa;
import heranca.PessoaFisica;
import heranca.Funcionario;
import heranca.PessoaJuridica;
import java.util.Scanner;

public class Cadastrar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Cadastrar um Pessoa
        Pessoa p = new Pessoa();
        System.out.println("Digite o nome: ");
        p.setNome(teclado.nextLine());

        //Cadastrar uma PessoaFisica
        PessoaFisica pf = new PessoaFisica();
        System.out.println("Nome: ");
        pf.setNome(teclado.nextLine());
        System.out.println("CPF: ");
        pf.setCpf(teclado.nextLong());

        //Cadastrar uma PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica();
        System.out.println("CPF: ");
        pf.setCpf(teclado.nextLong());

        //Cadastrar um Funcionario
        Funcionario func = new Funcionario();
        System.out.println("Matricula: ");
        func.setMatricula(teclado.nextInt());

        System.out.println("Matricula: " + func.getMatricula());
        System.out.println("Nome: " + p.getNome());
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());

    }

}
