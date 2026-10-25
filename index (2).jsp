 
<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Circle Area</title>
</head>
<body>

    <h2>Calculate Area of Circle</h2>

    <form action="circle" method="post">

        <label for="radius">Enter Radius:</label>
        <input type="number" name="radius" id="radius"
               placeholder="Enter radius" step="any" min="0" required>

        <br><br>

        <button type="submit">Calculate Area</button>

    </form>

</body>
</html>