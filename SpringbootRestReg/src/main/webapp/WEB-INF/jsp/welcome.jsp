<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h2>Student Registration</h2>
        <form:form action="student/save" method="post" >
        
         <form:label path="id">Id:</form:label>
            <form:input path="id"/><br/>
            
            
            <form:label path="name"> Name:</form:label>
            <form:input path="name"/><br/>
            
             <form:label path="age"> Age:</form:label>
            <form:input path="age"/><br/>
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
            
             <form:label path="schoolid"> School Id:</form:label>
            <form:input path="schoolid"/><br/>
             
                 
            <form:button>Register</form:button>
        </form:form>
    </div>

</body>
</html>