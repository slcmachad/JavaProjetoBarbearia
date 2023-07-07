package controler;

import barbershop.View.Login;
import model.Usuario;

public class LoginControler {

    private final Login view;

    public LoginControler(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
    }
    
    public void fizTarefa(){
        System.out.println("clique");
        
        this.view.exibeMensagem("fiz a tarefa");
    }
    
}
