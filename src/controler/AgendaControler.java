package controler;

import barbershop.View.Agenda;
import controler.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;

public class AgendaControler {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaControler(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        helper.preencherTabela(agendamentos);
    }

}