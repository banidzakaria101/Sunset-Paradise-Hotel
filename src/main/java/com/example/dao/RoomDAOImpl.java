package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.example.model.Room;
import com.example.util.DBUtil;

public class RoomDAOImpl implements RoomDAO {

    @Override
    public List<Room> getAllRooms() {
	    List<Room> rooms = new ArrayList<>();
	    String sql = "SELECT * FROM rooms";

	    try (Connection connection = DBUtil.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            int roomId = resultSet.getInt("room_id");
	            String roomType = resultSet.getString("room_type");
	            double price = resultSet.getDouble("price");
	            boolean available = resultSet.getBoolean("available");

	            Room room = new Room(roomId, roomType, price, available);
	            rooms.add(room);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return rooms;
	}

    @Override
    public List<Room> getAvailableRooms() {
        // Implement logic to retrieve available rooms for the given date range
        return null;
    }

    // Implement other methods for CRUD operations
}
