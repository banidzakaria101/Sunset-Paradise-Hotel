<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Room Search</title>
</head>
<body>
    <h1>Search Rooms</h1>
    <form action="RoomSearchServlet" method="get">
        <label for="checkInDate">Check-In Date:</label>
        <input type="date" id="checkInDate" name="checkInDate" required>
        <label for="checkOutDate">Check-Out Date:</label>
        <input type="date" id="checkOutDate" name="checkOutDate" required>
        <button type="submit">Search</button>
    </form>
</body>
</html>
