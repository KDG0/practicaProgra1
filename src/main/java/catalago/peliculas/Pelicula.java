package catalago.peliculas;

public class Pelicula {
    protected String titulo;
    protected String director;
    protected int año;
    protected int duracion; //minutos
    protected String genero;

    //Constructor
    public Pelicula(String titulo, String director, int año, int duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
    }
    //MEtodo pa mostrar
    public void mostrarInfo() {
        System.out.println("Titulo: "+titulo);
        System.out.println("Director: "+director);
        System.out.println("Año: "+año);
        System.out.println("Titulo: "+duracion+" minutos");
        System.out.println("Genero: "+genero);
    }
}
