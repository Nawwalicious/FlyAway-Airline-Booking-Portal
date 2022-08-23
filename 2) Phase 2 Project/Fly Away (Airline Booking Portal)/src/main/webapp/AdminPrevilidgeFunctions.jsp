<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<img src="FlyAwayBanner.png">
<h2>Welcome To FlyAway Airline Booking Portal</h2>
<body>
Please Choose The Details You Want To View:-

<form action="PrintBookedFlights" method="post">

Click Here To View Booked Flights 

<input type = "submit" value = "SUBMIT"/>
</form>

<form action="PrintPassengerDetails" method="post">

Click Here To View Passenger Details 

<input type = "submit" value = "SUBMIT"/>
</form>

<form action="PrintAirlineDetails" method="post">

Click Here To View Airlines and Fare 

<input type = "submit" value = "SUBMIT"/>
</form>


</body>
</html>