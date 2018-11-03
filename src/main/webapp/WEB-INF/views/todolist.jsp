<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>

<main role="main" class="inner cover">
<div class="lead">
	<c:choose>
		<c:when test="${empty todolist}">
			<h3>
				<c:out value="데이터가 하나도 없습니다."></c:out>
			</h3>
		</c:when>
		<c:otherwise>
			<table>
				<tr>
					<td><c:out value="제목"></c:out></td>
					<td><c:out value="할일"></c:out></td>
					<td><c:out value="우선순위"></c:out></td>
					<td><c:out value="마감날짜"></c:out></td>
					<td><c:out value="완료처리"></c:out></td>
					<td><c:out value="수정"></c:out></td>
					<td><c:out value="삭제"></c:out></td>
				</tr>
				<c:forEach var="todo" items="${todolist}">
					<tr>
						<td><c:out value="${todo.title}"></c:out></td>
						<td><c:out value="${todo.dowork}"></c:out></td>
						<td><c:out value="${todo.rank}"></c:out></td>
						<td><c:out value="${todo.deadline}"></c:out></td>
						<td><a href="<c:url value="/completetodo/${todo.id}"/>"><i class="fa fa-check"></i></a></td>
						<td><a href="<c:url value="/updatetodo/${todo.id}"/>"><i class="fa fa-edit"></i></a></td>
						<td><a href="<c:url value="/deletetodo/${todo.id}"/>"> <i class="fa fa-times"></i></a> </td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
</div>
</main>




<h5><a class="hyper-blue" href="${pageContext.request.contextPath}/">return home</a></h5>
