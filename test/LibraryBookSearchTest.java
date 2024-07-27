package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;

import java.util.ArrayList;
import java.util.List;

public class LibraryBookSearchTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setup() {
        library = new Library();
        book1 = new Book("title1", "author1", 1);
        book2 = new Book("title2", "author2", 2);
        book3 = new Book("title3", "author3", 3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void testSearchById() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add(1);
            add(2);
        }};
        List<Book> results = library.searchBooks(SearchByType.ID, queryList);
        Assert.assertEquals(List.of(book1, book2), results);
    }

    @Test
    public void testSearchByAuthor() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add("author1");
            add("author3");
        }};
        List<Book> results = library.searchBooks(SearchByType.AUTHOR, queryList);
        Assert.assertEquals(List.of(book1, book3), results);
    }

    @Test
    public void testSearchByTitle() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add("title2");
            add("title3");
        }};
        List<Book> results = library.searchBooks(SearchByType.TITLE, queryList);
        Assert.assertEquals(List.of(book2, book3), results);
    }

    @Test
    public void testSearchByInvalidField() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add("name1");
        }};
        List<Book> results = library.searchBooks(SearchByType.NAME, queryList);
        Assert.assertEquals(List.of(), results);
    }
}