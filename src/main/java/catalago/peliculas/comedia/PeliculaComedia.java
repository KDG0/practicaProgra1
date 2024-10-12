package catalago.peliculas.comedia;

import catalago.peliculas.Pelicula;

public class PeliculaComedia extends Pelicula {

    public PeliculaComedia(String titulo, String director, int año, int duracion) {
        super(titulo, director, año, duracion, "Comedia");
    }


    public void mostrarEscenaChistosa() {
        System.out.println("macarena");
    }
}
