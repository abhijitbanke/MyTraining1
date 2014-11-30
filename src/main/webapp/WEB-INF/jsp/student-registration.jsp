<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<form:form commandName="student" cssClass="form-horizontal">
 <div class="form-group">
 	<label for="studentName" class="col-sm-2 control-label">Student Name :</label>
 	<div class="col-sm-10">
      <form:input path="studentName" class="form-control" />
    </div>
 </div>
 
 <div class="form-group">
 	<label for="email" class="col-sm-2 control-label">Student Email :</label>
 	<div class="col-sm-10">
      <form:input path="email" class="form-control" />
    </div>
 </div>
 
 <div class="form-group">
 	<label for="password" class="col-sm-2 control-label">Password :</label>
 	<div class="col-sm-10">
      <form:password path="password" class="form-control" />
    </div>
 </div>
 
  <div class="form-group">
 	<div class="col-sm-2">
      <input type="submit" value="Submit" class="btn btn-lg btn-primary" />
    </div>
 </div>
 

</form:form>