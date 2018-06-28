package TechStaff;

import org.junit.Before;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Oscar", 3, 18.00);
    }

}
