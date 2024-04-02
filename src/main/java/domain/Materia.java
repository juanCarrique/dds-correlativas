package domain;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    private List<Materia> correlativas;
    public Materia() {
        this.correlativas = new ArrayList<>();
    }
    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean controlCorrelativas(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(this.correlativas);
    }
}
