<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<form action="addCustomer" method="post" onsubmit="return checkPassword()">
</form>
        <div class="signup">
            <h1 class="main-title">Admin Control</h1>
            <div class="signup-form">
               <form action="admin" method="post" onsubmit="return checkPassword()">
                   
                    <div class="btn-div">
                        <button class="submit-btn" type="submit"  onclick="compit();" name="submit" id="btn">
                            See ALL Customers
                        </button>
                    </div>
                </form>
            </div>
            
        </div>
        <div class="bg-image">
            <img src="https://png.pngtree.com/png-clipart/20230821/original/pngtree-online-store-delivery-service-flat-vector-illustration-picture-image_8152483.png" alt="">
        </div>
    </section>

</body>
</html>