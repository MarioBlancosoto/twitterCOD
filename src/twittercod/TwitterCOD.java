
package twittercod;

import javax.swing.JOptionPane;

public class TwitterCOD {

   
    public static void main(String[] args) {
         
       int select;
             
       do {
  select = Integer.parseInt(JOptionPane.showInputDialog("1. Nuevo estado \n 2.TimeLine \n 3.BuscarTwit \n 4.Mensaje \n 5.Seleccionar twits"));
    switch(select){
        
        case 1:Autorizacion.twitearN(JOptionPane.showInputDialog(null,"Introducir nuevo Estado"));
            break;
        case 2:Autorizacion.lineaTiempo();
            break;
        case 3:Autorizacion.buscarTwit(JOptionPane.showInputDialog("Introduce el hastag"));   
            break;
        case 4:Autorizacion.enviarMensaje(JOptionPane.showInputDialog("Introduce destinatario"),JOptionPane.showInputDialog("Introduce el mensaje"));
            break;
        case 5:Autorizacion.seleccion();
            break;
    }
  
          }while(select!=0);
    }
        
        
    }
    

