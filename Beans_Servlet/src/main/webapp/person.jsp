<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Details</title>
</head>
<body>
    <h1>Person Details</h1>
    <jsp:useBean id="person" class="com.jspbeans.Person" scope="request"/>
    <p>Name: <jsp:getProperty name="person" property="name" /></p>
    <p>Age: <jsp:getProperty name="person" property="age" /></p>
</body>
</html>
