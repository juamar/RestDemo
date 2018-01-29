package model.pojos;
// Generated Jan 25, 2018 10:10:13 AM by Hibernate Tools 4.3.1



/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private int id;
     private Curso curso;
     private String nombres;
     private String apellidos;

    public Alumno() {
    }

	
    public Alumno(int id) {
        this.id = id;
    }
    public Alumno(int id, Curso curso, String nombres, String apellidos) {
       this.id = id;
       this.curso = curso;
       this.nombres = nombres;
       this.apellidos = apellidos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }




}


