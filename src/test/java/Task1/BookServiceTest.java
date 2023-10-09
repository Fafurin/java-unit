package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

class BookServiceTest {

    Book book1;
    Book book2;

    private BookRepository mockRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        book1 = new Book("1", "Book1", "Author1");
        book2 = new Book("2", "Book2", "Author2");
        mockRepository = mock(BookRepository.class);

        bookService = new BookService(mockRepository);
    }

    @Test
    public void testServiceReturnsAllBooksFindByRepository() {
        when(mockRepository.findAll()).thenReturn(List.of(book1, book2));
        Assertions.assertEquals(List.of(book1, book2), bookService.findAllBooks());

    }

    @Test
    public void testServiceReturnsBookByIdFindByRepository() {
        when(mockRepository.findById("2")).thenReturn(book2);
        Assertions.assertEquals(book2, bookService.findBookById("2"));
    }

}