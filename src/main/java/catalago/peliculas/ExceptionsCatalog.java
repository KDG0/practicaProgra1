
public class ExceptionsCatalog {

    // Excepción base para todas las excepciones del catálogo
    public static class ExceptionsCatalog extends Exception {
        public ExceptionsCatalog(String mensaje) {
            super(mensaje);
        }
    }

    // Excepción para películas no encontradas
    public static class PeliculaNoEncontradaException extends ExceptionsCatalog {
        public PeliculaNoEncontradaException(int id) {
            super("Película con ID " + id + " no encontrada en el catálogo.");
        }
    }

    // Excepción para opciones inválidas en el menú
    public static class OpcionInvalidaException extends ExceptionsCatalog {
        public OpcionInvalidaException(String mensaje) {
            super("Opción inválida: " + mensaje);
        }
    }

    // Excepción para tipo de película no válido
    public static class TipoPeliculaInvalidoException extends ExceptionsCatalog {
        public TipoPeliculaInvalidoException(String tipo) {
            super("El tipo de película '" + tipo + "' no es válido o no está disponible.");
        }
    }

    // Excepción para cuando el catálogo está vacío
    public static class CatalogoVacioException extends ExceptionsCatalog {
        public CatalogoVacioException() {
            super("El catálogo está vacío. No hay películas disponibles.");
        }
    }
}
