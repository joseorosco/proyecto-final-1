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
public class HistorialMedico {
    public static List<Medicos> lista=new LinkedList<Medicos>();

    /**
     * @param args the command line arguments
     */
    
    private static void imprimirLista(List<Medicos>lista){
        for (int i=0;i<lista.size();i++){
            lista.get(i).verMedicos();
        }
        System.out.println("--------------------------");
    }
    public static void mostrarMedico(){
        for(int i=0;i<lista.size();i++){
            lista.get(i).verMedicos();
    }
        System.out.println("------------------------");
    }
    public static void registrarMedico(){
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingre ID"));        
        String nombres=JOptionPane.showInputDialog("Ingrese Nombre");
        String apellidos=JOptionPane.showInputDialog("Ingrese Apellidos");        
        String especialidad=JOptionPane.showInputDialog("Ingrese Especialidad");        
        lista.add(new Medicos(id, nombres, apellidos, especialidad));
    }
    public static void eliminarMedico(){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminando"));
        lista.remove(elemento);
        mostrarMedico();
    }

    private static void modificarMedico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

