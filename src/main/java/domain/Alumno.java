package domain;
import java.util.List;

public class Alumno {
    public String legajo;
    public String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String legajo, String nombre, List<Materia> aprobadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasAprobadas = aprobadas;
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;

    }

    public boolean inscribirse(List<Materia> materias) {
        Inscripcion inscripcion = new Inscripcion(materias);
        return inscripcion.aprobada(this);
    }
}