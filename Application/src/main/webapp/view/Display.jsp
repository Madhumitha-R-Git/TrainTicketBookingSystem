<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TravelDetails</title>
<link rel="StyleSheet" href="css/Travel.css">
</head>
<body>
<center>
    <H1>Journey Details!</H1><br>
    <form  action= "AvailabilityPlaces" autocomplete="off" class="main"method="post" >
        <label id="start">Please select Starting point</label>
        <select id="StartingPlaces" name="place1">
        <option value="Chennai">Chennai</option>
        <option value="salem">Salem</option>
        <option value="Madurai">Madurai</option>
        <option value="Thiruchirapalli">Thiruchirapalli</option>
        </select>
        <br>
        <label id="End">Please select Ending point</label>
        <select id="EndingPlaces" name="place2">
            <option value="Chennai">Chennai</option>
            <option value="salem">Salem</option>
            <option value="Madurai">Madurai</option>
            <option value="Thiruchirapalli">Thiruchirapalli</option>
        </select>
        <br>
        <label id="name" ">Number Of Passengers</label>
        <input type="Number" id="num" name="num" required><br>
        <label id="date">Date of travel</label>
        <input type ="date" id="calendar"><br>
        <Button type = "submit"  id="checkBt">Check Status</Button>
    </form>

</center>
</body>
</html>