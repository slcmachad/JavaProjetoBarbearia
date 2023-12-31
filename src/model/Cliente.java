package model;

import java.util.Date;

public class Cliente extends Pessoa{
    
    private String cep;
    private String endereco;

    public Cliente(int id, String nome, char sexo, String nascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.cep = cep;
        this.endereco = endereco;
    }

    public Cliente(int id, String nome, String cep, String endereco) {
        super(id, nome);
        this.cep = cep;
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
}
