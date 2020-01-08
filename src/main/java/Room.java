import java.util.ArrayList;

public class Room {
    private boolean isConference;
    private String name;
    private int number;
    private int capacity;
    private Boolean isSingle;
    private ArrayList<Guest> guests;

    public Room(boolean isConference,String name, int number, int capacity, Boolean isSingle){
        this.isConference =isConference;
        this.name=name;
        this.number=number;
        this.capacity=capacity;
        this.isSingle=isSingle;
        this.guests= new ArrayList<Guest>();
    }

    public int countGuests() {
        return this.guests.size();
    }


    public boolean isaConference() {
        return this.isConference;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Boolean isaSingle() {
        return this.isSingle;
    }

    public void addGuest(Guest guest) {
        if (this.capacity>0 ) {
            this.guests.add(guest);
            this.capacity -=1;
//            return this.Room();
        }
    }

    public Guest removeGuest(Guest guest) {
        this.guests.remove(guest);
        return guest;
    }
}
