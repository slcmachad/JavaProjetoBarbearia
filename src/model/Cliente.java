package model;

import java.util.Date;

public class Cliente {
    
    private int id;
    private String nome;
    private char sexo;
    private Date nascimento;
    private String telefone;
    private String email;
    private String rg;
    private String cep;
    private String endereco;


    public Cliente(int id, String nome, char sexo, Date nascimento, String telefone, String email, String rg, String cep, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.cep = cep;
        this.endereco = endereco;
    }
    
    public Cliente(int id, String nome, char sexo, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
}
