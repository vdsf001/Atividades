package heranca;

public class Funcionario extends PessoaFisica{
    private int matricula;
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
}
