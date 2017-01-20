/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinall;

import static HistorialClinico.HistorialClinico.eliminarHistorial;
import static HistorialClinico.HistorialClinico.mostrarHistorial;
import static HistorialClinico.HistorialClinico.registrarHistorial;
import HistorialClinico.HistorialMedico;
import static HistorialClinico.HistorialMedico.eliminarMedico;
import static HistorialClinico.HistorialMedico.mostrarMedico;
import static HistorialClinico.HistorialMedico.registrarMedico;
import static HistorialClinico.HistorialPaciente.eliminar;
import static HistorialClinico.HistorialPaciente.lista;
import static HistorialClinico.HistorialPaciente.mostrar;
import static HistorialClinico.HistorialPaciente.registrar;
import HistorialClinico.Medicos;
import HistorialClinico.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE OROSCO
 */
public class EvauacionFinall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux=0;
        
        do{
            aux=Integer.parseInt(JOptionPane.showInputDialog(null," ***MINU PRINCIPAL*** \n"+
                    "1: Gestionar Pacientes \n"+
                    "2: Gstionar Medicos \n"+
                    "3: Gestionar Historial Clinico \n"+
                    "4: Salir"));
                    
            switch(aux){
                case 1:
                    lista.add(new Paciente(1,74149532,"jose luis","orosco Hhuamani",18,"hombre"));
                    int opt=0;
        
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog(null," ***SUBMENU***\n"+
                    "1: Registrar Pacientes \n"+
                    "2: Mostrar Pacientes \n"+
                    "3: Modificar Pacientes \n"+
                    "4: Eliminar Pacientes \n"+
                    "5: Atras"));
            switch(opt){
                case 1: registrar();break;
                case 2: mostrar();break;
                case 3: break;
                case 4: eliminar();break;
                case 5: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
                    
                    break;
                case 2:
                    //lista.add(new Medicos(1,"jose luis","orosco Hhuamani","enfermero"));
                    int opcion=0;
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null," ***SUBMENU***\n"+
                    "1: Registrar Medicos \n"+
                    "2: Mostrar Medicos \n"+
                    "3: Modificar Medicos \n"+
                    "4: Eliminar Medicos \n"+
                    "5: Atras"));
            switch(opcion){
                case 1: registrarMedico();break;
                case 2: mostrarMedico();break;
                case 3: break;
                case 4: eliminarMedico();break;
                case 5: opcion=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opcion!=0);
                    break;
                case 3: 
                    int mo=0;
        
        do{
            mo=Integer.parseInt(JOptionPane.showInputDialog(null," ***SUBMENU***\n"+
                    "1: Registrar Historial \n"+
                    "2: Mostrar Historial \n"+
                    "3: Modificar Historial \n"+
                    "4: Eliminar Historial \n"+
                    "5: Atras"));
            switch(mo){
                case 1: registrarHistorial();break;
                case 2: mostrarHistorial();break;
                case 3: break;
                case 4: eliminarHistorial();break;
                case 5: mo=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(mo!=0);
                    break;
                case 4: aux=0;break;                
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(aux!=0);
    }
    
}
