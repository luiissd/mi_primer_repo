import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Libro agregado: " + book);
    }

    /// Funcionalidad para listar todos los libros con Stream
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Lista de libros:");
            books.stream()
                    .map(book -> books.indexOf(book) + 1 + ". " + book) // Agrega el índice y el libro
                    .forEach(System.out::println); // Imprime cada libro
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
