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
}
