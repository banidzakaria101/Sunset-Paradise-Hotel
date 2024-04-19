//package servlet;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/RoomSearchServlet")
//public class RoomSearchServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//  
//    public RoomSearchServlet() {
//        super();
//    }
//
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import dao.RoomDAO;
import dao.RoomDAOImp;
import model.Room;

public class RoomSearchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String checkInDateString = request.getParameter("checkInDate");
        String checkOutDateString = request.getParameter("checkOutDate");

        RoomDAO roomDAO = new RoomDAOImp();
        List<Room> availableRooms = roomDAO.getAvailableRooms(checkInDate, checkOutDate);

        // Transférer les résultats à room-search.jsp pour affichage
        request.setAttribute("availableRooms", availableRooms);
        RequestDispatcher dispatcher = request.getRequestDispatcher("room-search.jsp");
        dispatcher.forward(request, response);
    }
}

