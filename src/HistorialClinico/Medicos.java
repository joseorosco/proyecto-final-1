/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistorialClinico;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE OROSCO
 */
public class Medicos {
    private int id;
    private String nombres;
    private String apellidos;
    private String especialidad;

    public Medicos(int id, String nombre, String apellidos, String especialidad) {
        this.id = id;
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }
    
    public void verMedicos(){
        JOptionPane.showMessageDialog(null,"ID: "+id+" \n Nombre: "+nombres+"\n Apellidos: "+apellidos
                +"\n Especialidad: "+especialidad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
     
   
    
}
