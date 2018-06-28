package ManagementTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", 1, 15.00, "Shop floor" );
    }

    @Test
    public void canGetName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(1, manager.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(15.00, manager.getSalary(), 0.001);
    }

    @Test
    public void getDeptname(){
        assertEquals("Shop floor", manager.getDeptname());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5.50);
        assertEquals(20.50, manager.getSalary(), 0.001);
    }

}
