
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
public class Paciente {
    private int id;
    private int dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;

    public Paciente(int id, int dni, String nombre, String apellidos, int edad, String genero) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }

      
    public void verPaciente(){
        JOptionPane.showMessageDialog(null,"ID: "+id+"\n DNI: "+dni+""
                    +" \n Nombre: "+nombre+"\n Apellidos: "+apellidos+"\n Edad: "+edad+"\n Genero: "+genero);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
