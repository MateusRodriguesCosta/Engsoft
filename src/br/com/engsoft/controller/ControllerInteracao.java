/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controller;

import br.com.engsoft.view.*;
import java.awt.Rectangle;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author MATEUS
 */
public class ControllerInteracao {
    
    public void sairAplicacao(){
        System.exit(0);
    }
    
    public void alternarGuiaRegistro(JPanel panel, JTabbedPane guia){
        guia.setSelectedComponent(panel);
    }
    
    /**
     * atualizarJDesktopPane recebe o jdesktop e painel que serão utilizados na 
     * renderização (independente de quais forem). E a moldura que será utilizado
     * para estabelecer as bordas do programa.
     * @param jdesktop
     * @param painel
     * @param moldura 
     */
    public void atualizarJDesktopPane(JDesktopPane jdesktop, JPanel painel, Rectangle moldura){        
        try {
            painel.setBounds(moldura);
            painel.setVisible(true);                     
            jdesktop.removeAll();
            jdesktop.add(painel);
            jdesktop.validate();                   
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }           
    }
    
    public void registro(JDesktopPane jdesktop, Rectangle moldura){
        PainelRegistrar painel = new PainelRegistrar();        
        atualizarJDesktopPane(jdesktop, painel, moldura);        
    }
    
    public void solicitar(JDesktopPane jdesktop, Rectangle moldura){
        PainelSolicitar painel = new PainelSolicitar();        
        atualizarJDesktopPane(jdesktop, painel, moldura);        
    }        
    
    public void consulta(JDesktopPane jdesktop, Rectangle moldura, String tipo){
        JPanel painel = null;
        switch(tipo){
            case "Aeronave":
                painel = new PainelConsultarAeronave();
                //...              
            break;
            case "Equipamento":
                painel = new PainelConsultarEquipamento();
                //...
            break;
            case "Manutencao":
                painel = new PainelConsultarManutencao();
                //...
            break;
            case "ContratoSLA":
                painel = new PainelConsultarContratoSLA();
                //...
            break;
            case "Cliente":
                painel = new PainelConsultarCliente();
                //...
            break;
            case "FluxoAprovacaoOS":
                painel = new PainelFluxoAprovacao();
                //...
            break;
            case "OrdemServico":
                painel = new PainelOrdemServico();
                //...
            break;
            default:                
                System.out.println("Desculpe, opção de consulta inválida!");
            break;
        }
        atualizarJDesktopPane(jdesktop, painel, moldura);            
    }
}
