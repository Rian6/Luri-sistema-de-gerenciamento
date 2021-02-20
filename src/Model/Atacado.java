
package Model;

public class Atacado {
    String nome;
    String sobrenome;
    String empresa;
    String cnpj;

    public Atacado() {
        
    }

    public Atacado(String nome, String cnpj, String empresa) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
