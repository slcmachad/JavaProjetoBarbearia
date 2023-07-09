package controler;

import barbershop.View.Agenda;
import controler.Helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.DAO.AgendamentoDAO;
import model.DAO.ClienteDAO;
import model.DAO.ServicoDAO;
import model.Servico;

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
    
    public void atualizaCliente(){
        
        ClienteDAO clienteDao = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDao = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDao.selectAll();
        helper.preencherServicos(servicos);
    }

    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        
    }
}
