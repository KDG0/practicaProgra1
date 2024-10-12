package catalago.peliculas.accion;

import catalago.peliculas.Pelicula;

public class PeliculaAccion extends Pelicula {

    public PeliculaAccion(String titulo, String director, int año, int duracion) {
        super(titulo, director, año, duracion, "Accion");
    }

    // Metodo
    public void mostrarEscenaPelea() {
        System.out.println("volvere");
    }
}
