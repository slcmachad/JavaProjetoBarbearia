/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import model.Agendamento;

/**
 *
 * @author smaxx
 */
public class Correio {
    
    public void notificarPorEmail(Agendamento agendamento){
        
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
        
    }

    private String formatarEmail(Agendamento agendamento) {
        
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgedamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + " Vai dar um tapa no visu?... Seu agendamento para " + servico + 
                ", está marcado para o dia: " + dataAgedamento + 
                "às: " + horaAgendamento + 
                ". O preço será de: " + valor + " forte abraço";
               
    }
}
