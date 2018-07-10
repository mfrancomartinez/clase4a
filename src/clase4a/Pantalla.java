/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4a;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Pantalla implements ActionListener{
    
    JFrame marco ;
    JPanel panel;

   public Pantalla()
   {
       marco = new JFrame();
       marco.setSize(500, 300);
       marco.setVisible(true);
       marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       panel = (JPanel) marco.getContentPane();
       
       JButton boton1 = new JButton("boton 1");
       JButton boton2 = new JButton("boton 2");
       JButton boton3 = new JButton ("boton 3");
       
       panel.add(boton1, BorderLayout.NORTH);
       panel.add(boton2, BorderLayout.SOUTH);
       panel.add(boton3, BorderLayout.CENTER);
       
       boton1.setActionCommand("1");
       boton2.setActionCommand("2");
       boton3.setActionCommand("3");
              
       boton1.addActionListener(this);
       boton2.addActionListener(this);
       boton3.addActionListener(this);
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("1".equals(e.getActionCommand())){
            System.out.println("boton1 apretado");
        }else if("2".equals(e.getActionCommand())){
            System.out.println("boton2 apretado");
        }else if("3".equals(e.getActionCommand())){
            System.out.println("boton3 apretado");
        }
    }

    
   
}
