<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background:#f4f6f9;
    }

    .box{
        width:380px;
        margin:100px auto;
        background:#fff;
        padding:30px;
        border-radius:8px;
        box-shadow:0 4px 10px rgba(0,0,0,0.1);
        text-align:center;
    }

    h3{
        color:#333;
        margin-bottom:20px;
    }

    input{
        width:90%;
        padding:10px;
        margin:10px 0;
        border:1px solid #ccc;
        border-radius:5px;
    }

    input:focus{
        border-color:#007bff;
        outline:none;
    }

    button{
        width:95%;
        padding:10px;
        margin-top:15px;
        border:none;
        border-radius:5px;
        background:#28a745;
        color:#fff;
        cursor:pointer;
    }

    button:hover{
        background:#218838;
    }
</style>

</head>
<body>

<div class="box">
    <h3>User Registration</h3>

    <form action="RegisterServlet" method="post">
        <input type="text" name="name" placeholder="Username" required>
        <input type="email" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>
        <button type="submit">Register</button>
    </form>
</div>

</body>
</html>