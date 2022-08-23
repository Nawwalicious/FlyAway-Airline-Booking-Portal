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
<h3>Enter The Travel Details Below:</h3><br/>

<form action="StoringServlet" method="post">

Date Of Travel (DD/MM/YYYY): <input type = "text" name = "Date_Of_Travel"/>

<label for="source">  Source:</label>
<select name="source" id="source">
    <option value=" "> </option>
    <option value="Hyderabad">Hyderabad</option>
    <option value="Mumbai">Mumbai</option>
    <option value="Delhi">Delhi</option>
    <option value="Kolkata">Kolkata</option>
    <option value="Bangalore">Bangalore</option>
    <option value="Dubai">Dubai</option>
    <option value="Kathmandu">Kathmandu</option>
    <option value="Hong Kong">Hong Kong</option>
    <option value="Moscow">Moscow</option>
    <option value="Tokyo">Tokyo</option>
    <option value="Seoul">Seoul</option>
  </select>
  
<label for="Destination">  Destination:</label>
<select name="Destination" id="Destination">
    <option value=" "> </option>
    <option value="Hyderabad">Hyderabad</option>
    <option value="Mumbai">Mumbai</option>
    <option value="Delhi">Delhi</option>
    <option value="Kolkata">Kolkata</option>
    <option value="Bangalore">Bangalore</option>
    <option value="Dubai">Dubai</option>
    <option value="Kathmandu">Kathmandu</option>
    <option value="Hong Kong">Hong Kong</option>
    <option value="Moscow">Moscow</option>
    <option value="Tokyo">Tokyo</option>
    <option value="Seoul">Seoul</option>
  </select>
  
  Number Of Passengers: <input type = "text" name = "No_Passengers"/>
  
  <input type = "submit" value = "SUBMIT"/>
  </form>
  
  <br><br>
</body>
</html>