 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<jsp:include page="header.jsp"/>
<c:if test="${not empty employee}">
<form action=updateEmployee?id=${employee.id} } method="post">
  <div class="form-group" >
    <label for="addEmployee">Name</label>
    <input type="name" required class="form-control" name="name" value=${employee.name}>
    <label for="addEmployee">Salary</label>
    <input type="salary" required class="form-control" name="salary"  value=${employee.salary}>
    <label for="addEmployee">Department</label>
    <input type="department" required class="form-control" name="department" value=${employee.dept}>
    <label for="addEmployee">Address</label>
    <input type="address" required class="form-control" name="address" value=${employee.address}>
    <label for="addEmployee">Phone</label>
    <input type="phone" required class="form-control" name="phone" value=${employee.phone}>  </div>
  <input type="submit" value="submit" class="btn btn-primary"></input>
</form>
</c:if>
<jsp:include page="footer.jsp"/>