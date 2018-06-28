package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Phil", 2, 12.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Phil", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(2, developer.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(12.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5.50);
        assertEquals(17.50, developer.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.12, developer.payBonus(), 0.001);
    }

}
