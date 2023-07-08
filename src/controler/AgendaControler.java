package controler;

import barbershop.View.Agenda;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;

public class AgendaControler {
    private final Agenda view;

    public AgendaControler(Agenda view) {
        this.view = view;
    }
    
    public void atualizaTabela(){
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
    }

}
