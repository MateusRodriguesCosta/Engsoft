/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.controller;

import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author MATEUS
 */
public class ControllerInicializacao {
    private static final int PORT = 9999;
    private static ServerSocket socket;    

    public static void checkIfRunning() {
        try {
            //Conectar com adaptador com uma fila sem conexão
            socket = new ServerSocket(PORT,0,InetAddress.getByAddress(new byte[] {127,0,0,1}));
        }
        catch (BindException e) {
            JOptionPane.showMessageDialog(null, "Aplicação já aberta!");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("Unexpected error.");
            e.printStackTrace();
            System.exit(2);
        }
    }
}
