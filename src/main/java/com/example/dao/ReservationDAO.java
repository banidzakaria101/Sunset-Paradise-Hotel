package com.example.dao;

import java.util.List;
import com.example.model.Reservation;

public interface ReservationDAO {
    List<Reservation> getUserReservations(int userId);
    void addReservation(Reservation reservation);
    // Other methods for CRUD operations
}
