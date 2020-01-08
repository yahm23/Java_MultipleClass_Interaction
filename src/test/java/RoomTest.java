import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RoomTest {

    Room room1;
    Room room2;

    Guest guest1;
    Guest guest2;

    @Before
    public void setup(){
    room1 = new Room(true,"The Mike Ritchie",0,10,null);
    room2 = new Room(false,"",1,1,true);

    guest1 = new Guest("Eduardo");
    guest2 = new Guest("Yousef");
    }

    @Test
    public void isAConference(){
        assertEquals(true,room1.isaConference());
        assertEquals(false,room2.isaConference());
    }

    @Test
    public void hasNumber(){
        assertEquals(0,room1.getNumber());
        assertEquals(1,room2.getNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10,room1.getCapacity());
        assertEquals(1,room2.getCapacity());
    }

    @Test
    public void isASingle(){
        assertEquals(null,room1.isaSingle());
        assertEquals(true,room2.isaSingle());
    }


    @Test
    public void guestListStartsEmpty(){
        assertEquals(0,room1.countGuests());
    }

    @Test
    public void canAddGuest(){
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        assertEquals(2,room1.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        room1.removeGuest(guest2);
        assertEquals(1,room1.countGuests());
        assertEquals(guest1,room1.removeGuest(guest1));
    }

    @Test
    public void capacityCanbeCheckedWhenAdding(){
        room2.addGuest(guest1);
        room2.addGuest(guest2);
        assertEquals(1,room2.countGuests());
    }


}
