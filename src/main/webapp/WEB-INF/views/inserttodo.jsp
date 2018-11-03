<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


      <main role="main" class="inner cover">
     <sf:form method="POST" action="${pageContext.request.contextPath}/insertok" modelAttribute="todo">
			<div class="container">
				<div class="cover-heading">
				<table class=".table-hover">
					<tr> <td>제목: </td> <td><sf:input type="text" path="title"/><br>
						<sf:errors path="title" class="error"></sf:errors> </td> </tr>
					<tr> <td>할일: </td> <td><sf:textarea path="dowork" rows="5" cols="10"/><br>
						<sf:errors path="dowork" class="error"></sf:errors> </td> </tr>
					<tr> <td>우선순위: </td> <td><sf:input type="text" path="rank" placeholder="default=5"/><br>
						<sf:errors path="rank" class="error"></sf:errors> </td> </tr>
					<tr> <td>마감날짜: </td> <td><sf:input type="text" path="deadline" placeholder="2018-01-01"/><br>
						<sf:errors path="deadline" class="error"></sf:errors> </td> </tr>
					<tr> <td> </td> <td><input type="submit" value="insert!!"/> </td> </tr>
				</table>
				</div>
			</div>
		</sf:form>
      </main>

     