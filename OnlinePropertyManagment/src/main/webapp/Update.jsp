<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="addCustomer">
<div class="row">
  <div class="col">
    <input type="text" class="form-control" name="Firstname" value="${param.First_name}" aria-label="Enter First name">
  </div>
  <div class="col">
    <input type="text" class="form-control" name="Lastname" value="${param.Last_name}" aria-label="Enter Last name">
  </div>
  </div>
  <div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" name="email" value="${param.email}">
</div>
<div class="input-group mb-3">
  <span class="input-group-text"></span>
  <div class="form-floating">
    <input type="text" class="form-control" id="floatingInputGroup1" name="user" value="${param.username}">
  </div>
</div>
<div class="form-floating">
  <input type="text" class="form-control" id="floatingPassword" name="Epwd" value="${param.password}">
</div>
<div class="form-floating">
  <input type="text" class="form-control" id="floatingPassword" name="Repwd" value="${param.Re_Enter_password}">
</div>
<button type="submit" class="btn btn-secondary">submit</button>
</div>
</form>

</body>
</html>