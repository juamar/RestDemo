package model.pojos;
// Generated Jan 25, 2018 10:10:13 AM by Hibernate Tools 4.3.1

/**
 * Curso generated by hbm2java
 */
public class Alumno 
{
     private int id;
     private String nombre;
     private String apellido;

    public Alumno() {
    }
    public Alumno(int id) {
        this.id = id;
    }
    public Alumno(int id, String nombre, String apellido) {
       this.id = id;
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}