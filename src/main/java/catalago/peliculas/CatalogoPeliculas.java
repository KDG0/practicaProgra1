package catalago.peliculas;

import catalago.peliculas.accion.PeliculaAccion;
import catalago.peliculas.comedia.PeliculaComedia;
import catalago.peliculas.terror.PeliculaTerror;

import java.util.*;

public class CatalogoPeliculas {
    private Map<String, List<Pelicula>> peliculasPorGenero;

    public CatalogoPeliculas(){
        peliculasPorGenero = new HashMap<>();
        peliculasPorGenero.put("accion", new ArrayList<>());
        peliculasPorGenero.put("comedia",new ArrayList<>());
        peliculasPorGenero.put("terror",new ArrayList<>());
    }

    public void agregarPelicula(Pelicula pelicula) {
        String genero = pelicula.genero.toLowerCase();
        if (peliculasPorGenero.containsKey(genero)) {
            peliculasPorGenero.get(genero).add(pelicula);
            System.out.println("Pelicula agregada exitosamente");
        } else {
            System.out.println("Genero no reconocido");
        }
    }

    public void mostrarPeliculasPorGenero(String genero){
        genero = genero.toLowerCase();
        if(peliculasPorGenero.containsKey(genero)){
            List<Pelicula> peliculas = peliculasPorGenero.get(genero);
            if (peliculas.isEmpty()){
                System.out.println("No hay peliculas de este genero");
            } else {
                for (Pelicula pelicula : peliculas) {
                    pelicula.mostrarInfo();
                    System.out.println();
                }
            }
        } else {
            System.out.println("Genero no reconocido");
        }
    }

    public void menuInteractivo(){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5){
            System.out.println("\n ----- Catalogo de peliculas -----");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Mostrar peliculas de Accion");
            System.out.println("3. Mostrar peliculas de Comedia");
            System.out.println("4. Mostrar peliculas de Terror");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    agregarPeliculaDesdeMenu(scanner);
                    break;
                case 2:
                    mostrarPeliculasPorGenero("accion");
                    break;
                case 3:
                    mostrarPeliculasPorGenero("comedia");
                    break;
                case 4:
                    mostrarPeliculasPorGenero("terror");
                    break;
                case 5:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    return;
            }

        }
    }

    private void agregarPeliculaDesdeMenu(Scanner scanner){
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el director de la pelicula: ");
        String director = scanner.nextLine();
        System.out.println("Ingrese el año de la pelicula: ");
        int año = scanner.nextInt();
        System.out.println("Ingrese la duracion de la pelicula (en minutos): ");
        int duracion = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese el genero de la pelicula: ");
        String genero = scanner.nextLine().toLowerCase();

        Pelicula pelicula = null;
        switch (genero.toLowerCase()) {
            case "accion":
                pelicula = new PeliculaAccion(titulo, director, año, duracion);
                break;
            case "comedia":
                pelicula = new PeliculaComedia(titulo, director, año, duracion);
                break;
            case "terror":
                pelicula = new PeliculaTerror(titulo, director, año, duracion);
            default:
                System.out.println("Genero no valido");
                return;
        }
        agregarPelicula(pelicula);

    }


}
