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
public class HistorialPaciente {
    public static List<Paciente> lista=new LinkedList<Paciente>();

    /**
     * @param args the command line arguments
     */
    
    private static void imprimirLista(List<Paciente>lista){
        for (int i=0;i<lista.size();i++){
            lista.get(i).verPaciente();
        }
        System.out.println("--------------------------");
    }
    public static void mostrar(){
        for(int i=0;i<lista.size();i++){
            lista.get(i).verPaciente();
    }
        System.out.println("------------------------");
    }
    public static void registrar(){
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingre ID"));
        int dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI"));
        String nombre=JOptionPane.showInputDialog("Ingrese Nombre");
        String apellidos=JOptionPane.showInputDialog("Ingrese Apellidos");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
        String genero=JOptionPane.showInputDialog("Ingrese el Genero");
        lista.add(new Paciente(id,dni,nombre,apellidos,edad,genero));
    }
    public static void eliminar(){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminando"));
        lista.remove(elemento);
        mostrar();
    }

    private static void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
