package domain;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;


    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
    public Alumno(String legajo, String nombre, List<Materia> aprobadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = aprobadas;
    }

    public void aprobarMaterias(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
    public void aprobarMaterias(List<Materia> materias) {
        this.materiasAprobadas.addAll(materias);
    }

    public List<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;

    }

    public boolean inscribirse(List<Materia> materias) {
        Inscripcion inscripcion = new Inscripcion(materias);
        return inscripcion.aprobada(this);
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }
}