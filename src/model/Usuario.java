package model;

import java.util.Date;

public class Usuario extends Pessoa{

    private String senha;
    private String nivelDeAcesso;

    public Usuario(int id, String nome, String senha, String nivelDeAcesso, char sexo, Date nascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    
}
