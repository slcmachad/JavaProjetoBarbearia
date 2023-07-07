package barbershop.View;

import model.Cliente;
import model.Servico;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        String nome = "jão";
        
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30);
        
        Cliente cliente = new Cliente(1, "jão", "rua teste", "999999999");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbaro", "senha");
        System.out.println(usuario.getNome());
        
    }
}
