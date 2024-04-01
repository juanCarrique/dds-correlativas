package domain;
import java.util.List;

public class Materia {
    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    public List<Materia> correlativas;

    public boolean controlCorrelativas(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(this.correlativas);
    }
}
