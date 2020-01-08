
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

        Room room1;
        Room room2;

        Guest guest1;
        Guest guest2;

        Hotel hotel;

        ArrayList<Room> allRooms;

    @Before
    public void setup(){
        room1 = new Room(true,"The Mike Ritchie",0,10,null);
        room2 = new Room(false,"",1,1,true);

        guest1 = new Guest("Eduardo");
        guest2 = new Guest("Yousef");

        allRooms = new ArrayList<Room>();
        allRooms.add(room1);
        allRooms.add(room2);

        hotel = new Hotel(allRooms);
    }

        @Test
        public void checkHotelHasRooms(){
            assertEquals(2, hotel.countRooms());
        }

        @Test
        public void canCheckInGuestIntoRoom(){
          ArrayList<Guest> guestsToCheckIn = new ArrayList<Guest>();
          guestsToCheckIn.add(guest1);
          guestsToCheckIn.add(guest2);
          hotel.checkIn(room1, guestsToCheckIn);
          assertEquals(2, room1.countGuests());
        }

        @Test
        public void roomIsUpdatedWhenGuestCheckIn(){
            ArrayList<Guest> guestsToCheckIn = new ArrayList<Guest>();
            guestsToCheckIn.add(guest1);
            hotel.checkIn(room1, guestsToCheckIn);
            assertTrue(hotel.getRooms().contains(room1));

        }
         @Test
        public void canCheckOutGuestFromRoom(){
            ArrayList<Guest> guestsToCheckIn = new ArrayList<Guest>();

            guestsToCheckIn.add(guest1);
            guestsToCheckIn.add(guest2);

            hotel.checkOut(room1, guestsToCheckIn);
            assertEquals(0, room1.countGuests());
        }

        @Test
        public void roomIsUpdatedWhenGuestCheckOut(){
            ArrayList<Guest> guestsToCheckIn = new ArrayList<Guest>();
            guestsToCheckIn.add(guest1);
            guestsToCheckIn.add(guest2);
            hotel.checkOut(room1, guestsToCheckIn);
            assertTrue(hotel.getRooms().contains(room1));
        }
    }
