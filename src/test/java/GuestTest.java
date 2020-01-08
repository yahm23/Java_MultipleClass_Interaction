import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void setup(){
        guest1 = new Guest("Eduardo");
        guest2 = new Guest("Yousef");
    }

    @Test
    public void shouldHaveName(){
        assertEquals("Yousef",guest2.getName());
    }


}
