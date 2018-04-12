<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>客户添加页面</title>
		<link rel="stylesheet" href="${path }/dist/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${path }/css/update.css" />
	</head>
	<body>
		<div class="container">
			<div id="update">
				<form action="${path}/customer/addCustomer" id="tj" method="post"  class="form-horizontal" role="form">
					<fieldset>
						<legend>新增信息</legend>
						<input type="hidden" value="" name="id">
						<div class="form-group">
							<label for="name" class="col-md-3 control-label">客户名</label>
							<div class="col-md-6">
								<input type="text" name="name" value="" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="col-md-3 control-label">客户地址</label>
							<div class="col-md-6">
								<input type="text" name="address" value="" class="form-control">
							</div>
						</div>
						
						<div class="form-group">
							<label for="phone" class="col-md-3 control-label">客户电话</label>
							<div class="col-md-6">
								<input type="text" name="phone" value="" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label for="fax" class="col-md-3 control-label">客户传真</label>
							<div class="col-md-6">
								<input type="text" name="fax" value="" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label for="levels" class="col-md-3 control-label">客户等级</label>
							<div class="col-md-6">
								<input type="text" name="levels" value="" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-warning" onclick="saveFilm()">保存</button>
								<button type="reset" class="btn btn-warning" onclick="back()">重置</button>
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
		<script type="text/javascript" src="${path }/js/update.js" ></script>
		
	</body>
		
	
</html>
