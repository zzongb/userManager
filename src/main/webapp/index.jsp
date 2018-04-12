<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>进入主页面</title>
	</head>
	<body>
		<c:set var="path" value="${pageContext.request.contextPath }" scope="application"></c:set>
		<jsp:forward page="/customer/list"></jsp:forward>
	</body>
</html>