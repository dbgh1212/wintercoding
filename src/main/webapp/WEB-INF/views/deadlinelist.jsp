<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>

<div class="lead">
	<c:choose>
		<c:when test="${empty deadlineList}">
			<h3>
				<c:out value="데이터가 하나도 없습니다."></c:out>
			</h3>
		</c:when>
		<c:otherwise>
			<table class=".table-hover">
				<tr>
					<td><c:out value="제목"></c:out></td>
					<td><c:out value="할일"></c:out></td>
					<td><c:out value="마감날짜"></c:out></td>
				</tr>
				<c:forEach var="deadline" items="${deadlineList}">
					<tr>
						<td><c:out value="${deadline.title}"></c:out></td>
						<td><c:out value="${deadline.dowork}"></c:out></td>
						<td><c:out value="${deadline.deadline}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
</div>




<h5><a class="hyper-blue" href="${pageContext.request.contextPath}/">return home</a></h5>
