<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS">
<meta charset="ISO-8859-1">
<title>Property Management System</title>
</head>
<body>
<form method="post" action="addCustomer">
<div class="row">
  <div class="col">
    <input type="text" class="form-control" name="Firstname" placeholder="Enter First name" aria-label="Enter First name">
  </div>
  <div class="col">
    <input type="text" class="form-control" name="Lastname" placeholder="Enter Last name" aria-label="Enter Last name">
  </div>
  </div>
  <div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" name="email" placeholder="Enter Your Email Address">
</div>
<div class="input-group mb-3">
  <span class="input-group-text"></span>
  <div class="form-floating">
    <input type="text" class="form-control" id="floatingInputGroup1" name="user" placeholder="Enter Username">
  </div>
</div>
<div class="form-floating">
  <input type="password" class="form-control" id="floatingPassword" name="Epwd" placeholder="Enter Password">
</div>
<div class="form-floating">
  <input type="password" class="form-control" id="floatingPassword" name="Repwd" placeholder="Re-Enter Password">
</div>
<button type="submit" class="btn btn-secondary">submit</button>
</div>
</form>
</body>
</html>