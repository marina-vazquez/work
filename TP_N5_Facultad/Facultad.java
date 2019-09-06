package universidad.com;

import java.util.Scanner;

public class Facultad {
    private Long idEstudiantes = 1L;
    private String nombreFacultad;
    private int maxAlumnos;
    private Estudiante[] estudiantes;
    private int ultimaPos=0;

    public Facultad(){}
    public Facultad(String nombre, int maxAlumnos){
        this.nombreFacultad=nombre;
        this.maxAlumnos=maxAlumnos;
        estudiantes=new Estudiante[maxAlumnos];
    }

    public void agregarAlumno( Facultad facultad){

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese nombre del estudiante: ");
        String nombre=entrada.next();
        System.out.println("Ingrese nota media: ");
        double notaMedia=entrada.nextDouble();
        Estudiante estudiante= new Estudiante(nombre, idEstudiantes, notaMedia);
        estudiante.setFacultad(facultad);
        estudiantes[ultimaPos]=estudiante;
        idEstudiantes++;
        ultimaPos++;
    }

    public void listarAlumnos(){
        for (Estudiante estudiante: estudiantes ) {
            estudiante.toString();
        }
    }

    public Integer buscarAlumno(String nombre){
        for (int i=0; i<estudiantes.length;i++){
            if(estudiantes[i].getNombre()==nombre){
                return i;
            }
        }
        return  null;
    }
    public void borrarAlumno(Long id){
        for (int i=0; i< estudiantes.length;i++){
            if (estudiantes[i].getNrEstudiante()==id){
                estudiantes[i]=null;
            }
        }
    }

    public void modificarNotaMedia(String nombre, double nota){

        for (int i=0; i< estudiantes.length;i++){
            if (estudiantes[i].getNombre()==nombre){
                estudiantes[i].setNotaMedia(nota);
            }
        }
    }
}