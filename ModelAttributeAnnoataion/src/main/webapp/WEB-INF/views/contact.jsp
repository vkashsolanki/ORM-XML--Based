<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Contact Page</title>
</head>
<body>


<div class="container mt-5" >
<h2 class="container text-center">Registration  Form </h2>

	<form action="process" method="post">
	
			<div class="form-group">
			<label for="exampleInputEmail1">User Name</label> 
			 <input
				type="text" class="form-control" id="name" name="name"
				aria-describedby="username" placeholder="Enter Your Name">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">User Email</label> 
			 <input
				type="email" class="form-control" id="email" name="email"
				aria-describedby="email" placeholder="Enter Your Email">

		</div>
		
				<div class="form-group">
			   <label for="userpassword">User Password </label> 
			 <input
				type="password" class="form-control" id="userpassword" name="password"
				aria-describedby="password" placeholder="Enter your Password">  
				
				
				</div>
							
					
					<div class="continer text-center">
					<button type="submit" class="btn btn-danger">Register</button>
					</div>
					

	</form>
   </div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>