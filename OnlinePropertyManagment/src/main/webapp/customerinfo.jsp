<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<style>

        /* Inline CSS Styles */
        .su-container {
            display: flex;
            background-color: white;
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center top;
            height: 100%;
            padding-top: 170px;
        }

        .bg-image img {
            width: 600px;
            height: 500px;
        }

        .su-container .signup {
            position: relative;
            top: -20px;
            display: flex;
            flex-direction: column;
            text-align: center;
            margin-left: auto;
            margin-right: auto;
            width: 40%;
            padding-bottom: 100px;
        }

        .signup h1 {
            position: relative;
            font-size: 30px;
            bottom: 30px;
            color: black;
        }

        .changeform h3 {
            color: #000;
            margin-top: 20px;
            margin-bottom: 5px;
        }

        .changeform a {
            color: green;
            text-decoration: underline;
        }

        .changeform a:hover {
            color: darkgreen;
        }

        .signup-form form {
            display: flex;
            flex-direction: column;
            justify-content: center;
            margin: auto;
            width: 380px;
        }

        .form-row {
            display: flex;
            justify-content: space-between;
        }

        form .form-row input {
            float: left;
            width: 45%;
        }

        .signup-form form .input_field {
            height: 50px;
            box-sizing: border-box;
            padding: 10px 10px 0px 10px;
            border: none;
            border-bottom: 2px solid #ebebeb;
            margin-top: 10px;
            margin-bottom: 10px;
            width: 100%;
            font-size: 16px;
            color: black;
        }

        .signup-form form input:hover {
            border-bottom-color: #dcdcdc;
        }

        .signup-form form input:focus {
            outline: none;
            border-bottom-color: #0061a7;
        }

        .submit-btn:disabled {
            background-color: aliceblue;
            margin-top: 20px;
            color: rgb(3, 62, 255);
            padding: 14px 20px;
            border: none;
            border-radius: 5px;
            width: 380px;
            opacity: 0.9;
            font-size: 15px;
        }

        .submit-btn:enabled {
            cursor: pointer;
            background-color: #0061a7;
            margin-top: 20px;
            color: rgb(255, 255, 255);
            padding: 14px 20px;
            border: none;
            border-radius: 5px;
            width: 380px;
            opacity: 0.9;
            font-size: 15px;
        }

        .submit-btn:hover {
            opacity: 1;
        }

        .accept {
            display: flex;
        }

        .accept input {
            height: 20px;
            width: 20px;
            margin-right: 20px;
        }

  
</style>
<section class="su-container">

<div class="container">
  <h2>Customer Details</h2>
 <table  class="table">
 <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        <th>Username</th>
        <th>Password</th>
      </tr>
    <c:forEach items="${customer}" var="customer">
<thead>
      
    </thead>
        <tr id="row">
            <td>${customer.first_name}</td> 
            <td>${customer.last_name}</td> 
            <td id="email" name="email">${customer.email}</td>
            <td>${customer.username}</td>
            <td>${customer.password}</td>
            <td>
            <form action="deleteCustomer" method="post" onsubmit="return checkPassword()">
            <input class="input_field" type="hidden" name="email" value="${customer.email}" />
            <button type="submit" class="btn btn-danger">Delete</button></td>
            </form>
        </tr> 
    </c:forEach>
</table>
</div>


        <div class="bg-image">
            <img src="https://png.pngtree.com/png-clipart/20230821/original/pngtree-online-store-delivery-service-flat-vector-illustration-picture-image_8152483.png" alt="">
        </div>
    </section>

</body>
</html>