package ManagementTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Lisa", 5, 123.20, "Shop floor", 2000.30);
    }

    @Test
    public void canGetName(){
        assertEquals("Lisa", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(5, director.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(123.20, director.getSalary(), 0.001);
    }

    @Test
    public void getDeptname(){
        assertEquals("Shop floor", director.getDeptname());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5.50);
        assertEquals(128.70, director.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1.232, director.payBonus(), 0.001);
    }
}
