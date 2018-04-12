<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>客户列表页</title>
		<link rel="stylesheet" href="${path }/dist/css/bootstrap.min.css" />
		<script type="text/javascript" src="${path }/js/jquery-3.2.1.min.js" ></script>
	</head>
	<body>
		<!--导航开始-->
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#example-navbar-collapse">
							<span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span
								class="icon-bar"></span> <span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">客户管理</a>
					</div>
					<div class="collapse navbar-collapse" id="example-navbar-collapse">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#"><span class="text-success"></span></a></li>
							<!-- <li><a href="#"><span class="badge pull-right">"+count+"</span>在线人数</a></li>
							<li><a href="#"><span class="badge pull-right">"+totalCount+"</span>总访问量</a></li> -->
							<li><a href="${path }/user/safeExit">安全退出</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<!--导航结束-->
		<div class="container">
			<ol class="breadcrumb">
				<li><a href="#">客户信息</a></li>
				<li><a href="#">2018</a></li>
				<li class="active">十月</li>
			</ol>
		</div>
		
		<!--查询开始-->
		<div class="container">
			<div>
				<form action="${path }/student/studentList" class="bs-example bs-example-form" role="form">
					<div class="row">
						<div class="col-md-4">
							<a href="${path }/customer/add" class="btn btn-info">添加客户</a>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!--查询结束-->
		
		<!--列表主体开始-->
		<div class="container">
			<div class="table-responsive">
				<table class="table table-hover">
					<caption>全部客户信息</caption>
					<thead>
						<tr class="active">
							<th><input type="checkbox" onclick="checkAll(this)" /></th>
							<th>客户姓名</th>
							<th>客户地址</th>
							<th>客户电话</th>
							<th>客户传真</th>
							<th>客户等级</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${customerList }" varStatus="vs">
							<tr>
								<td><input type="checkbox" value="${customer.id }" name="cks" /></td>
								<td>${customer.name }</td>
								<td>${customer.address }</td>
								<td>${customer.phone }</td>
								<td>${customer.fax }</td>
								<td>${customer.levels }</td>
								<td><a href="${path }/customer/keep?id=${customer.id}" class="btn btn-warning">查看</a></td>
								<td><a href="${path }/customer/delete?id=${customer.id}" class="btn btn-warning">删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<!--列表主体结束-->
	</body>
</html>
