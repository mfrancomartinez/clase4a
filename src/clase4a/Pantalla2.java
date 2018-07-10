/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Pantalla2 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton b1, b2, b3;
    JList  pantallax;
    JLabel salida;
    DefaultListModel dlm;
    double i = 0;
    double j = 0;
    double x = 0;
    double resultado;
    
    public Pantalla2(){
    marco = new JFrame();
    marco.setSize(1000, 700);
    marco.setVisible(true);
    marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    panel = (JPanel) marco.getContentPane();
    
    panel.setLayout(null);
    
    b1 = new JButton("bolígrafos");
    b2 = new JButton("lápices");
    b3 = new JButton("libretas");
    dlm = new DefaultListModel();
    pantallax = new JList(dlm);
    salida = new JLabel();
    
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(pantallax);
    panel.add(salida);
    
    b1.setBounds(10, 10, 200, 75);
    b2.setBounds(10, 10+75, 200, 75);
    b3.setBounds(10, 10+75+75, 200, 75);
    pantallax.setBounds(300, 10, 500, 300);
    salida.setBounds(300,350 , 200, 75);
    
    b1.setActionCommand("1");
    b2.setActionCommand("2");
    b3.setActionCommand("3");
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if ("1".equals(e.getActionCommand())){
        i++;
        dlm.addElement(Double.toString(i)+" x  boligrafos");        
    }
    if ("2".equals(e.getActionCommand())){
        j++;
        dlm.addElement(Double.toString(j)+" x lápices");
        
    }
    if ("3".equals(e.getActionCommand())){
        x++;
        dlm.addElement(Double.toString(x)+" x libretas");
    }
    resultado = (i*(1.12) + j + x*(2.1));
    salida.setText(Double.toString(resultado));
    }
}
