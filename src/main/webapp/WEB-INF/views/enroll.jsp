<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Student Enrollment Form</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
</head>

<body>
 	<div class="form-container">
 	<h1>Enrollment Form</h1>
	<form:form method="POST" modelAttribute="userinfo" class="form-horizontal">
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="uname">uname</label>
				<div class="col-md-7">
					<form:input type="text" path="uname" id="uname" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="uname" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="unumber">unumber</label>
				<div class="col-md-7">
					<form:input type="text" path="unumber" id="unumber" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="unumber" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="insert" class="btn btn-primary btn-sm">
			</div>
		</div>

		
	</form:form>
	</div>
</body>
</html>