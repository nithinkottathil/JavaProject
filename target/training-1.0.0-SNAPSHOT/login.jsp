<jsp:include page="header.jsp"/>
<form action=login method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" required class="form-control" name="email" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input required type="password" class="form-control" name="password" placeholder="Password">
  </div>
  <input type="submit" value="submit" class="btn btn-primary"></input>
</form>
<jsp:include page="footer.jsp"/>