<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>客户添加页面</title>
		<link rel="stylesheet" href="${path }/dist/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="${path }/css/update.css"/>
	</head>
	<body>
		<div class="container">
			<div id="update">
				<form action="${path}/customer/addRecord" id="tj" method="post"  class="form-horizontal" role="form">
					<fieldset>
						<legend>新增信息</legend>
						<input type="hidden" value="${vid}" name="id">
						<div class="form-group">
							<label for="visitDate" class="col-md-3 control-label">拜访日期</label>
							<div class="col-md-6">
								<input type="text" name="visitDate" value="" class="form-control" id="datetimepicker">
								<span class="glyphicon glyphicon-time form-control-feedback"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="type" class="col-md-3 control-label">拜访类型</label>
							<div class="col-md-6">
								<select name="type" class="form-control">
									<option value="电话">电话</option>
									<option value="短信">短信</option>
									<option value="邮件">邮件</option>
									<option value="上门">上门</option>
								</select>
							</div>
						</div>
						
						<div class="form-group">
							<label for="contact" class="col-md-3 control-label">联系人</label>
							<div class="col-md-6">
								<input type="text" name="contact" value="" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label for="content" class="col-md-3 control-label">拜访内容</label>
							<div class="col-md-6">
								<input type="text" name="content" value="" class="form-control">
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="button" class="btn btn-warning" onclick="savecustomer()">保存</button>
								<button type="button" class="btn btn-warning" >返回</button>
								
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
		
		<!--引入js-->
		<script type="text/javascript" src="${path }/js/jquery-3.2.1.min.js" ></script>
		<script type="text/javascript" src="${path }/dist/js/bootstrap.min.js" ></script>
		<script type="text/javascript" src="${path }/js/moment.js" ></script>
		<script type="text/javascript" src="${path }/js/bootstrap-datetimepicker.min.js" ></script>
		<script type="text/javascript" src="${path }/js/update.js"></script>
		<script type="text/javascript">
					function savecustomer() {
						var data = $("#tj").serialize();
						$.ajax({
							url:"${path}/customer/addRecord",
							type:"post",
							data:data,
							success:function(mes){
								if(mes == "SUCCESS") {
									window.location.href="${path}/customer/list";
								} else {
									false;
								}
							}
						})
					}	
		</script>
	</body>
		
	
</html>
