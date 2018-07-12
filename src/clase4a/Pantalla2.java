/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    JButton b;
    JList  pantallax;
    JLabel salida;
    DefaultListModel dlm;    
    ArrayList <Producto> listaproductos;
    
    public Pantalla2(){
    marco = new JFrame();
    marco.setSize(1000, 700);
    marco.setVisible(true);
    marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    panel = (JPanel) marco.getContentPane();
  
    Producto p = new Producto();
    p.nombre="Bolígrafo";
    p.precio=1.2;
    Producto p2 = new Producto();
    p2.nombre="Lápiz";
    p2.precio=1.0;
    Producto p3 = new Producto();
    p3.nombre="Libreta";
    p3.precio=2.1;
    
      listaproductos = new ArrayList();
    listaproductos.add(p);
    listaproductos.add(p2);
    listaproductos.add(p3);
    
    
   
    dlm = new DefaultListModel();
    pantallax = new JList();
    // para vincular variabledelalista.setmodel(nombredevariabledetipoDefaultListModel);
    pantallax.setModel(dlm);
    
    
    panel.setLayout(null);
    
    salida = new JLabel();
    
    panel.add(pantallax);
    panel.add(salida);
    
    pantallax.setBounds(300, 10, 500, 300);
    salida.setBounds(300,350 , 200, 75);
    salida.setText("Importe: 0.0");
    
    
    
    for (int i=0; i<listaproductos.size();i++){
        Producto pb = new Producto();
        pb = listaproductos.get(i);
        b = new JButton(pb.nombre);
        b.setBounds(20, 55*i, 100, 50);
        panel.add(b);
        b.setActionCommand(""+i);
        b.addActionListener(this);
        
        
    }
    
    
    
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String valor= e.getActionCommand();
        
        int posicion= Integer.parseInt(valor);
        
       
        
        this.addCantidad(posicion);
       
        this.mostrarlista();
        
        salida.setText("Importe: "+  this.getImporte());
        
        
    
    }
    public void addCantidad(int posicion){
            this.listaproductos.get(posicion).cantidad++;
        }
    
    public void mostrarlista(){
        
          this.dlm.clear();
         for(int i=0; i< this.listaproductos.size();i++)
        {
            Producto p= this.listaproductos.get(i);
            
            dlm.addElement(p.cantidad+" x "+p.nombre); 
            
            
        }
    }
    public double getImporte(){
           double importe=0;
        for(int i=0; i< this.listaproductos.size();i++)
        {
            Producto p= this.listaproductos.get(i);
            
          importe =importe + p.cantidad*p.precio;
            
            
        }
        return importe;
    }
}
