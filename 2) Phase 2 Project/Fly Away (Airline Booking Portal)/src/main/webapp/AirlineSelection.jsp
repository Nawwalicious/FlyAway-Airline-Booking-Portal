<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<img src="FlyAwayBanner.png">
<h3>Select An AirLine Below:</h3><br/>

<form action="StoringAirlineDetails" method="post">

<label for="airline">  Airline:</label>
<select name="airline" id="airline">
    <option value=" "> </option>
    <option value="Indigo">Indigo</option>
    <option value="Spice Jet">Spice Jet</option>
    <option value="Air India">Air India</option>
    <option value="Vistara">Vistara</option>
    <option value="Emirates">Emirates</option>
    <option value="Cathay Pacific">Cathay Pacific</option>
    <option value="Turkish Airlines">Turkish Airlines</option>
    <option value="Qantas">Qantas</option>
    <option value="Qatar Airways">Qatar Airways</option>
  </select>
  

  <input type = "submit" value = "SUBMIT"/>          
                                           <img src="fare.png">
  
  </form>
  
  <br><br>

</body>
</html>