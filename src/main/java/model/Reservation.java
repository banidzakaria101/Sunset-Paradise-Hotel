package model;

import java.sql.Date;

public class Reservation {
	private int reservationId;
	private int roomId;
	private Date reservationStart;
	private Date reservationEnd;
	
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public Date getReservationStart() {
		return reservationStart;
	}
	public void setReservationStart(Date reservationStart) {
		this.reservationStart = reservationStart;
	}
	public Date getReservationEnd() {
		return reservationEnd;
	}
	public void setReservationEnd(Date reservationEnd) {
		this.reservationEnd = reservationEnd;
	}
}
