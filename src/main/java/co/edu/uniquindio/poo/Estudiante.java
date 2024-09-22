package co.edu.uniquindio.poo;

public class Estudiante  extends Persona{

    private int idEstudiante;

    public Estudiante(String nombre,String cedula,String telefono, String correo,int idEstudiante){
        super(nombre, cedula, telefono, correo);
        this.idEstudiante=idEstudiante;
        
    }

    public int getIdEstudiante(){
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante){
        this.idEstudiante=idEstudiante;
    }



}
