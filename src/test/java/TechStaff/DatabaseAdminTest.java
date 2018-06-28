package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Oscar", 3, 18.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Oscar", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(3, databaseAdmin.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(18.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5.50);
        assertEquals(23.50, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.18, databaseAdmin.payBonus(), 0.001);
    }

}

