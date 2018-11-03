<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>


<main role="main" class="inner cover">
<div class="lead">
	<c:choose>
		<c:when test="${empty completeTodoList}">
			<h3>
				<c:out value="데이터가 하나도 없습니다." />
			</h3>
		</c:when>
		<c:otherwise>
			<table class=".table-hover">
				<tr>
					<td><c:out value="제목" /></td>
					<td><c:out value="할일" /></td>
					<td><c:out value="마감날짜" /></td>
				</tr>
				<c:forEach var="completeTodo" items="${completeTodoList}">
					<tr>
						<td><c:out value="${completeTodo.title}" /></td>
						<td><c:out value="${completeTodo.dowork}" /></td>
						<td><c:out value="${completeTodo.deadline}" /></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
</div>
</main>

<h5>
	<a class="hyper-blue" href="${pageContext.request.contextPath}/">return
		home</a>
</h5>
