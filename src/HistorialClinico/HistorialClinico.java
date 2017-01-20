/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistorialClinico;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE OROSCO
 */
public class HistorialClinico {
     public static List<Clinico> lista=new LinkedList<Clinico>();

    /**
     * @param args the command line arguments
     */
    
    private static void imprimirLista(List<Clinico>lista){
        for (int i=0;i<lista.size();i++){
            lista.get(i).verClinico();
        }
        System.out.println("--------------------------");
    }
    public static void mostrarHistorial(){
        for(int i=0;i<lista.size();i++){
            lista.get(i).verClinico();
    }
        System.out.println("------------------------");
    }
    public static void registrarHistorial(){
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingre codigo"));
        int fecha=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha"));
        int idpaciente=Integer.parseInt(JOptionPane.showInputDialog("Ingrese IDpaciente"));
        int idmedico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese IDmedico"));
        String observaciones=JOptionPane.showInputDialog("Ingrese Observaciones");               
        lista.add(new Clinico(codigo, fecha, idpaciente, idmedico, observaciones));
    }
    public static void eliminarHistorial(){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminando"));
        lista.remove(elemento);
        mostrarHistorial();
    }

    private static void modificarHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void mostrarMedico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
