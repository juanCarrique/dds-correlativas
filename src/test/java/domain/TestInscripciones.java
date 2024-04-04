package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class TestInscripciones {
    @Test
    public void testAprobarInscripcionSimple() {
        Materia analisis1 = new Materia();
        Materia algebra = new Materia();

        Alumno juan = new Alumno("1234", "Juan");

        Assertions.assertTrue(juan.inscribirse(List.of(analisis1, algebra)));
    }

    @Test
    public void testAprobarInscripcionCorrelativa() {
        Materia analisis1 = new Materia();
        Materia analisis2 = new Materia(List.of(analisis1));
        Materia algebra = new Materia();

        Alumno juan = new Alumno("1234", "Juan");
        juan.aprobarMaterias(List.of(analisis1, algebra));

        Assertions.assertTrue(juan.inscribirse(List.of(analisis2)));
    }

    @Test
    public void testReprobarInscripcionCorrelativa() {
        Materia analisis1 = new Materia();
        Materia analisis2 = new Materia(List.of(analisis1));
        Materia algebra = new Materia();

        Alumno juan = new Alumno("1234", "Juan");

        Assertions.assertFalse(juan.inscribirse(List.of(analisis2)));
    }
}
