package barbershop.View;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        String nome = "jão";
        
        System.out.println(nome);
        
        Servico servico1 = new Servico(1, "Barba", 30);
        
        Cliente clienteJao = new Cliente(1, "jão", "rua teste", "999999999");
        System.out.println(clienteJao.getNome());
        
        Usuario usuario = new Usuario(1, "barbaro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, clienteJao, servico1,30, "07/07/2023 15:00");
        System.out.println(agendamento.getCliente().getNome());
    }
}
