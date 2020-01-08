import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
//    private Room updatedRoom;

    public Hotel(ArrayList<Room> rooms){
        this.rooms = new ArrayList<Room>(rooms);
    }

    public ArrayList<Room> getRooms(){
        return this.rooms;
    }

    public int countRooms() {
        return this.rooms.size();
    }

    public Room getSpecificRoom(Room room){

        for (int i =0; i<rooms.size(); i++){
            if (room.getName() == rooms.get(i).getName() && room.getNumber() == rooms.get(i).getNumber()){
                return room;
            }
        }
        return null;

    }

    public void checkIn(Room room, ArrayList<Guest> guests) {

        Room updateRoom = this.getSpecificRoom(room);
        for (int i =0; i < guests.size(); i++){
            updateRoom.addGuest(guests.get(i));
        }
    }


    public void checkOut(Room room, ArrayList<Guest> guests) {
         Room updateRoom = this.getSpecificRoom(room);
        for (int i =0; i < guests.size(); i++){
            updateRoom.removeGuest(guests.get(i));
        }
    }
}
