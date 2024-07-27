package test;

import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryStudentSearchTest {
    private Library library;
    private Student student1;
    private Student student2;
    private Student student3;
    @Before
    public void setup() {
        library = new Library();
        student1 = new Student("student1", 1);
        student2 = new Student("student2", 2);
        student3 = new Student("student3", 3);
        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);
    }

    @Test
    public void testSearchById() {
        final ArrayList<Object> queryList = new ArrayList<>(){{
            add(1);
            add(2);
            add(5);
        }};
        List<Student> results = library.searchStudents(SearchByType.ID, queryList);
        Assert.assertEquals(List.of(student1, student2), results);
    }

    @Test
    public void testSearchByName() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add("student2");
            add("student3");
            add("student4");
        }};
        List<Student> results = library.searchStudents(SearchByType.NAME, queryList);
        Assert.assertEquals(List.of(student2, student3), results);
    }

    @Test
    public void testSearchByInvalidField() {
        final ArrayList<Object> queryList = new ArrayList<>() {{
            add("author1");
        }};
        List<Student> results = library.searchStudents(SearchByType.AUTHOR, queryList);
        Assert.assertEquals(List.of(), results);
    }
}