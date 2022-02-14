 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <jsp:include page="header.jsp"/>
    <h3>Employee List</h3>
    <table class = "table table-striped" border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Name</th>
          <th>Department</th>
          <th>Address</th>
          <th>Salary</th>
          <th>Phone</th>
       </tr>
       <c:forEach items="${employeeList}" var="employee" >
          <tr>
             <td>${employee.name} </td>
             <td>${employee.dept}</td>
             <td>${employee.address}</td>
             <td>${employee.salary}</td>
             <td>${employee.phone}</td>
             <td>
                <a href="editEmployee?id=${employee.id}">Edit</a>
             </td>
             <td>
                <a href="deleteEmployee?id=${employee.id}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>

    <a href="welcome.jsp" >Create Employee</a>
    
    <jsp:include page="footer.jsp"/>