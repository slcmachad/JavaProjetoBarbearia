package controler.Helper;

import barbershop.View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;

public class AgendaHelper implements IHelper{
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

    public Cliente obterCliente() {
        
        return (Cliente) view.getJComboBoxCliente().getSelectedItem();
        
    }
    
    public Servico obterServico() {
        
        return (Servico) view.getJComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {
        Integer id = Integer.parseInt(view.getTextId().getText());
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTextObservacao().getText();
        
        return new Agendamento(id, cliente, servico, valor, dataHora, observacao);
    }

    @Override
    public void limparTela() {
        view.getTextId().setText("");
        view.getTextFormatedData().setText("");
        view.getTextFormatedHora().setText("");
        view.getTextObservacao().setText("");
    }
}
