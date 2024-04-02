package domain;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class TestAlumnos {

    @Test
    public void testAprobarMateria() {
        Alumno alumno = new Alumno("1234", "Juan");
        Materia analisis1 = new Materia();
        alumno.aprobarMaterias(analisis1);
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(analisis1);
        Assert.assertEquals(materiasAprobadas, alumno.getMateriasAprobadas());
    }
}
