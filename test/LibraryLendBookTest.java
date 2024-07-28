package test;

import main.classes.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;

import java.util.ArrayList;
import java.util.List;

public class LibraryLendBookTest {
    private Library library1;
    private Library library2;
    private Student student1;
    private Student student2;
    private Student student3;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setup() {
        library1 = new Library();
        library2 = new Library();
        student1 = new Student("student1", 1);
        student2 = new Student("student2", 2);
        student3 = new Student("student3", 3);
        book1 = new Book("test1", "ali", 1);
        book2 = new Book("test2", "ali", 2);
        book3 = new Book("test3", "mamad", 3);
        library1.addStudent(student1);
        library1.addStudent(student2);
        library2.addStudent(student3);
        library2.addStudent(student2);
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book2);
    }

    @Test
    public void testLendBookToStudentFromLibrary(){
        boolean result = library1.lendBook(book1, student1);
        Assert.assertEquals(result, true);
    }

    @Test
    public void testLendBookToStudentFromOtherLibrary(){
        boolean result = library2.lendBook(book2, student1);
        Assert.assertEquals(result, false);
    }
}
