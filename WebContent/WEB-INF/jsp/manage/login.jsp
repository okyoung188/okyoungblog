<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<style type="text/css">
body{width:100%;height:100%;background:url(/resource/image/images/bj_zhuce.jpg);clear:both}
#loginform{position:absolute;top:50%;left:50%;width:500px;height:350px;padding:20px;margin-left:-300px;margin-top:-150px;text-align: center;}
#loginform div{margin:20px auto}
#loginform span{display:inline-block;width:40%;color:#fff;line-height:26px}
#loginform .loginparam{width:50%;height:20px;border-radius:4px}
.loginbtn {width:20%;height:26px;border-radius:4px;}
</style>
<title>okyoung管理页面</title>
</head>
<body>
	<form id="loginform" action="login.action" method="post" onsubmit="return validate();">
		<div>
			<span>用户名：</span><input id="username" class="loginparam" name="username" type="text" placeholder="请输入用户名">
		</div>
		<div>
			<span>密码：</span><input id="password" class="loginparam" name="pwd" type="password" placeholder="请输入密码">
		</div>
		<div>
			<span></span><input id="loginbtn" class="loginbtn" type="submit" value="登录">
		</div>
		<span id="hint" style="margin-left:20%;color:red"><s:property value="#request.message"/></span>
	</form>
	<script>
		function validate() {
			var username = $('#username').val();
			var password = $('#password').val();
			if (!username || !username.trim()) {
				$('#hint').html('用户名不能为空！');
				return false;
			}
			if (!password) {
				$('#hint').html('密码不能为空！');
				return false;
			}
			return true;
		}
	</script>
</body>
</html>