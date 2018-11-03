<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<header class="masthead mb-auto">
        <div class="inner">
          <h3 class="masthead-brand">Winter Coding</h3>
          <nav class="nav nav-masthead justify-content-center">
            <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>
            <a class="nav-link" href="${pageContext.request.contextPath}/inserttodo">Todo 추가</a>
            <a class="nav-link" href="${pageContext.request.contextPath}/todolist">Todo 목록</a>
            <a class="nav-link" href="${pageContext.request.contextPath}/completetodo">완료된 Todo 목록</a>
            <a class="nav-link" href="${pageContext.request.contextPath}/deadlinelist">기간 지난 Todo 목록</a>
          </nav>
        </div>
      </header>