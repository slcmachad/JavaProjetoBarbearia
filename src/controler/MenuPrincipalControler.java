package controler;

import barbershop.View.Agenda;
import barbershop.View.MenuPrincipal;

public class MenuPrincipalControler {
    
    private final MenuPrincipal view;

    public MenuPrincipalControler(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    
    
}
