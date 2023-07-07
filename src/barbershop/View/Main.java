package barbershop.View;

import model.Cliente;
import model.Servico;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        String nome = "jão";
        
        System.out.println(nome);
        
        Servico servico = new Servico(1, "Barba", 30);
        
        Cliente cliente = new Cliente(1, "jão", 'M', "987456321", "rua rua");
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "barbaro", "senha");
        System.out.println(usuario);
        
    }
}
