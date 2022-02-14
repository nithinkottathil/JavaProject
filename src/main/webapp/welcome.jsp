<jsp:include page="header.jsp"/>
<form action=addEmployee method="post">
  <div class="form-group" >
    <label for="addEmployee">Name</label>
    <input type="name" required class="form-control" name="name" placeholder="Enter name">
    <label for="addEmployee">Salary</label>
    <input type="salary" required class="form-control" name="salary"  placeholder="Enter salary">
    <label for="addEmployee">Department</label>
    <input type="department" required class="form-control" name="department" placeholder="Enter department">
    <label for="addEmployee">Address</label>
    <input type="address" required class="form-control" name="address" placeholder="Enter address">
    <label for="addEmployee">Phone</label>
    <input type="phone" required class="form-control" name="phone" placeholder="Enter phone">  </div>
  <input type="submit" value="submit" class="btn btn-primary"></input>
</form>
<jsp:include page="footer.jsp"/>