package catalago.peliculas.terror;

import catalago.peliculas.Pelicula;

public class PeliculaTerror extends Pelicula {

    //constructorsh
    public PeliculaTerror(String titulo, String director, int año, int duracion) {
        super(titulo, director, año, duracion, "Terror");
    }

    //metodo
    public void mostrarEscenaMiedo() {
        System.out.println("Waaazaaaaaaa..!!");
    }
}
