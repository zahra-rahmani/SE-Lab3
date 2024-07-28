package test;

import main.classes.Student;
import main.classes.Book;
import main.classes.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayTest {
    private Library library1;
    private Student student1;
    private Student student2;
    private Student student3;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setup() {
        library1 = new Library();
        student1 = new Student("student1", 1);
        student2 = new Student("student2", 2);
        student3 = new Student("student3", 3);
        book1 = new Book("test1", "ali", 1);
        book2 = new Book("test2", "ali", 2);
        book3 = new Book("test3", "mamad", 3);
        library1.addStudent(student1);
        library1.addStudent(student2);
        library1.addStudent(student3);
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        student1.addBook(book1);
    }

    @Test
    public void testDisplayStudent(){
        String result = student1.toString();
        Assert.assertEquals(result, "student1|1");
    }

    @Test
    public void testDisplayBook(){
        String result = book1.toString();
        String title = book1.getTitle();
        String author = book1.getAuthor();
        Assert.assertEquals(result, title + " by " + author);
    }

}
