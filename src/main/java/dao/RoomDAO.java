package dao;

import java.util.Date;
import java.util.List;
import model.Room;

public interface RoomDAO {
	List<Room> getAllRooms();
	List<Room> getAvailableRooms(Date checkInDate, Date checkOutDate);

}
