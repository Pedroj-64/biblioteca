package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante  extends Persona{

    private int idEstudiante;
    private Collection<Prestamo> prestamos;

    public Estudiante(String nombre,String cedula,String telefono, String correo,int idEstudiante){
        super(nombre, cedula, telefono, correo);
        this.idEstudiante=idEstudiante;
        prestamos=new LinkedList<>();
        
    }

    public int getIdEstudiante(){
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante){
        this.idEstudiante=idEstudiante;
    }



}
