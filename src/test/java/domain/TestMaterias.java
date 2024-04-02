package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestMaterias {
    @Test
    public void testControlCorrelativas(){
        Materia analisis1 = new Materia();
        Materia analisis2 = new Materia(List.of(analisis1));

        Alumno juan = new Alumno("1234", "Juan");
        juan.aprobarMaterias(List.of(analisis1));

        Assert.assertTrue(analisis2.controlCorrelativas(juan));
    }

    @Test
    public void testFailControlCorrelativas(){
        Materia analisis1 = new Materia();
        Materia analisis2 = new Materia(List.of(analisis1));

        Alumno juan = new Alumno("1234", "Juan");

        Assert.assertFalse(analisis2.controlCorrelativas(juan));
    }
}
