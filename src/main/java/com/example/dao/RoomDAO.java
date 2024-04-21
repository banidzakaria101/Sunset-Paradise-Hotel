package com.example.dao;

import java.util.List;
import com.example.model.Room;

public interface RoomDAO {
    List<Room> getAllRooms();
    List<Room> getAvailableRooms();
}
