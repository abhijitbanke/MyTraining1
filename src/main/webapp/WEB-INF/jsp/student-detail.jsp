<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<html>
<table class="table table-bordered table-hover table-striped">
<thead>
<tr>
	<td>
		Student ID
	</td>
	<td>
		Student Name
	</td>
</tr>
</thead>
<tbody>
<tr>
	<td> ${student.id} </td>
	<td> ${student.studentName} </td>
</tr>
</tbody>
</table >
<table class="table table-bordered table-hover table-striped">
<tr>
	<td>
		Project ID
	</td>
	<td>
		Project Name
	</td>
	<td>
		Project Cost
	</td>
	<td>
		Clients
	</td>
</tr>
 	<c:forEach items="${student.projects}" var="project">
			<tr>
				<td> ${project.id}</td>
				<td>${project.projectName}</td>
				<td>${project.projectCost}</td>
				<td>
					<table class="table table-bordered table-hover table-striped">
					<tr>
						<td>ID </td>
						<td>Client Name</td>
					</tr>
					<c:forEach items="${project.projectClients}" var="projectClient">
						<tr>
							<td>${projectClient.id}</td>
							<td> ${projectClient.clientName} </td>
						</tr>
					</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
  
</table>
</html>
