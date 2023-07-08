package controler.Helper;

import barbershop.View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;

public class AgendaHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(
              new Object[]{
                  agendamento.getId(),
                  agendamento.getCliente().getNome(),
                  agendamento.getServico().getDescricao(),
                  agendamento.getValor(),
                  agendamento.getData(),
                  agendamento.getData(),
                  agendamento.getObservacao()
              }
            );
        }
    }
    
}
