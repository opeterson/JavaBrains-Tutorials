<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styles.css" />
<title>Search</title>
</head>
<body>
<form method="post" action="tutorials/getTutorial.action">
  <div class="fields">
    <div>
      <label for="language">Search: </label>
      <input id="language" name="language" />
    </div>
    <div>
      <input type="submit" value="Search!" />
    </div>  
  </div>
</form>
</body>
</html>