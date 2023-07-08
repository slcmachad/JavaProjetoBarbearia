package controler.Helper;

import barbershop.View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;

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
                  agendamento.getDataFormatada(),
                  agendamento.getHoraFormatada(),
                  agendamento.getObservacao()
              }
            );
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
            
        }
        
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxMode = (DefaultComboBoxModel) view.getJComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxMode.addElement(servico);
        }
        
    }

    public Servico obterServico() {
        
        return (Servico) view.getJComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor + "");
    }
    
    
    
}
