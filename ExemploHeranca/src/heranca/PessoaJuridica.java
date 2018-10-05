package heranca;

public class PessoaJuridica extends Pessoa{
    
    private long cnpj;
    
    public void setCnpj(long cnpj){
        this.cnpj=cnpj;
    }
    
    public long getCnpj(){
        return cnpj;
    }
    
}
