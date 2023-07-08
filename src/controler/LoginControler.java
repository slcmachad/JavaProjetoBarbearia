package controler;

import barbershop.View.Login;
import barbershop.View.MenuPrincipal;
import controler.Helper.LoginHelper;
import model.DAO.UsuarioDAO;
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
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDao.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else {
            view.exibeMensagem("Usuário ou senha inválidos!");
        }
    }
    
    public void fizTarefa(){
        System.out.println("clique");
        
        this.view.exibeMensagem("fiz a tarefa");
    }
    
}
