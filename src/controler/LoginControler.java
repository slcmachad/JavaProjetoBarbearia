package controler;

import barbershop.View.Login;
import controler.Helper.LoginHelper;
import model.Usuario;

public class LoginControler {

    private final Login view;
    private LoginHelper helper;

    public LoginControler(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){

        Usuario usuario = helper.obterModelo();
    }
    
    public void fizTarefa(){
        System.out.println("clique");
        
        this.view.exibeMensagem("fiz a tarefa");
    }
    
}
