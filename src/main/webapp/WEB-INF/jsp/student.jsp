<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

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
	<c:forEach items="${users}" var="student">
		<tr>
			<td>
				${student.id}
			</td>
			<td>
				<a href="<spring:url value="/students/${student.id}.html" />"> ${student.studentName} </a>
				
			</td>
		</tr>		
	</c:forEach>
</tbody>
</table>
    