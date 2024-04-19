

//	@Override
//	public List<Room> getAllRooms() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Room> getAllAvailableRooms() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	package dao;

	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Date;
import java.util.List;

import model.Room;

	public class RoomDAOImp implements RoomDAO {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "";

	    public RoomDAOImp() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public List<Room> getAllRooms() {
	        return null;
	    }

	    @Override
	    public List<Room> getAvailableRooms(Date checkInDate, Date checkOutDate) {
	        return null;
	    }

	}



