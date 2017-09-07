/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Color;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Carlos
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame=new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JTextArea area= new JTextArea(10,40);
        JScrollPane jScrollPane=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.add(jScrollPane);
        frame.setVisible(true);
        area.append("Server Iniciado\n");
        ServerSocket serverSocket;
        serverSocket = new ServerSocket(5002);
        Thread t=new Thread(new HandlePos(serverSocket,area));    
        t.start();
        

        
        
    }
}
