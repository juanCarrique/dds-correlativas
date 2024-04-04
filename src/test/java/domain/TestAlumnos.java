package domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlumnos {

    @Test
    public void testAprobarMateria() {
        Alumno alumno = new Alumno("1234", "Juan");
        Materia analisis1 = new Materia();
        alumno.aprobarMaterias(List.of(analisis1));
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(analisis1);

        Assertions.assertEquals(materiasAprobadas, alumno.getMateriasAprobadas());
    }
}
