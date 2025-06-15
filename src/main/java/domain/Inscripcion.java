package domain;
import java.util.List;

public class Inscripcion {

    private List<Materia> materiasInscripcion;

    public Inscripcion(List<Materia> materias) {
        this.materiasInscripcion = materias;
    }
    public boolean aprobada(Alumno alumno) {
        for (Materia materia : this.materiasInscripcion) {
            if (!materia.controlCorrelativas(alumno)) {
                return false;
            }
        }
        return true;
    }
    public boolean estaAprobada(Alumno alumno) {
        for (Materia materia : this.materiasInscripcion) {
            if (!materia.controlCorrelativas(alumno)) {
                return false;
            }
        }
        return true;
    }

}
