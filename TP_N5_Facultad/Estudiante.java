package universidad.com;

public class Estudiante {
	
    private String nombre;
    private Long nrEstudiante;
    private double notaMedia;
    private Facultad facultad= new Facultad();

    public Estudiante(){}

    public Estudiante(String nombre, Long nrEstudiante, double notaMedia){
        this.nombre=nombre;
        this.nrEstudiante=nrEstudiante;
        this.notaMedia=notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNrEstudiante() {
        return nrEstudiante;
    }

    public void setNrEstudiante(Long nrEstudiante) {
        this.nrEstudiante = nrEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }


    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nrEstudiante=" + nrEstudiante +
                ", notaMedia=" + notaMedia +
                ", facultad=" + facultad +
                '}';
    }
}