package com.example.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.RoomDAO;
import com.example.dao.RoomDAOImpl;
import com.example.model.Room;


@WebServlet("/RoomServlet")
public class RoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoomDAO roomDAO;
       
   
    public RoomServlet() {
        super();
        roomDAO = new RoomDAOImpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  List<Room> rooms = roomDAO.getAllRooms();

	        request.setAttribute("rooms", rooms);

	        request.getRequestDispatcher("/WEB-INF/room.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
