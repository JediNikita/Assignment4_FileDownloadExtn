<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Download File</title>
</head>
<body>

	<form method= "post" action="${pageContext.request.contextPath}/home">
		<div class="form-group">
			<label for="fileName">File Name:</label>
			<input type="text" class="form-control" id="fileName"/>
		</div>
		<div class="form-group">
			<label for="fileName">URL:</label>
			<input type="text" class="form-control" id="url"/>
		</div>
		<div class="form-group">
			<label for="fileName">Save To:</label>
			<input type="text" class="form-control" id="path"/>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form> 

</body>
</html>