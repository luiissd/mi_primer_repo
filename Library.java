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

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
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


    public void removeBook(String title) {
        Book bookToRemove = findBookByTitle(title); // Busca el libro por título
        if (bookToRemove != null) {
            books.remove(bookToRemove); // Si lo encuentra, lo elimina
            System.out.println("Libro eliminado: " + bookToRemove);
        } else {
            System.out.println("No se encontró el libro con el título: " + title);
        }
    }
    
}


