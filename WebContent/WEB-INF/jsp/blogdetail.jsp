<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animation.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/page.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqPaginator.min.js"></script>
<title>博客页</title>
<style>
.blogsection > div {margin:20px 0;}
.articleComp{text-align:center;margin:20px auto}
.blogshow{padding:25px}
.crtqArea{margin-top:100px}
form>div{margin:10px 35px}
.hint{font-size:12px;color:#a6a6a6}
.sectionSeparate{font-size:18px;border-bottom:1px solid #C9C9C9}
ul{list-style:none}
</style>
</head>
<body>
	<header>
		<nav id="nav">
			<ul>
				<li><a href="${pageContext.request.contextPath}">网站首页</a></li>
				<li><a href="${pageContext.request.contextPath}/main">主页</a></li>
				<li><a href="${pageContext.request.contextPath}/download/" target="_blank" title="博客文章">博客文章</a></li>
				<li><a href="${pageContext.request.contextPath}/book/" target="_blank" title="图书推荐">图书推荐</a></li>
				<li><a href="${pageContext.request.contextPath}/newshtml5/" target="_blank" title="HTML5 / CSS3">站外链接</a></li>
				<li><a href="${pageContext.request.contextPath}/news/s/" target="_blank" title="留言">留言</a></li>
				<li><a href="${pageContext.request.contextPath}/web/" target="_blank" title="网站介绍">网站介绍</a></li>
				<li><a href="${pageContext.request.contextPath}/aboutme" target="_blank" title="关于我">关于我</a></li>
			</ul>
		</nav>
	</header>
	<!--header end-->
	<div id="mainbody">
		<div class="blogsection">
		    <div class="currposition">
				<span>当前的位置：</span> <a href="?"><s:property value="position.name" /></a>
				<s:if test="%{position.subPosition != null}">
					<span>></span>
					<a href="?<s:property value="position.subPosition.reqType"/>=<s:property value="position.subPosition.reqData"/>"><s:property value="position.subPosition.name" /></a>
					<s:if test="%{position.subPosition.subPosition != null}">
						<span>></span>
						<a href="?<s:property value="position.subPosition.subPosition.reqType"/>=<s:property value="position.subPosition.subPosition.reqData"/>"> <s:property value="position.subPosition.subPosition.name" /></a>
					</s:if>
				</s:if>
			</div>
	        <div class="blogshow" style="background:#fff">
	           <h1 class="articleComp"><s:property value="artModel.title"/></h1>
	           <p class="articleComp">
	              <span>作者：<s:property value="artModel.editor"/></span> 
	              <span>时间：<s:property value="artModel.time"/></span> 
	              <span>关键字:<s:property value="artModel.keyword"/></span>
	           </p>
	           <p class="articleComp">
	              <span>浏览:<s:property value="artModel.viewCount"/></span> 
	              <span>评论:<s:property value="artModel.critiqueSize"/></span> 
	              <span>类别:<s:property value="artModel.articleType"/></span> 
	           </p>
	           <s:property value="artModel.content" escape="false"/>
	           <!-- 评论区 -->
	           <div class="crtqArea">
	                <p class="sectionSeparate">评论区</p>
					<form action="critiqueadd.action" method="post">
						<div>
							<p>评论：</p>
							<textarea id="critique" rows="10" cols="70"></textarea>
						</div>
						<div>
						   <label for="crtq-name">您的昵称：</label><input id="crtq-name" name="nickname"><span class="hint" style="color:red">*必填</span>
						</div>
						<div>
						   <label for="crtq-email">您的邮箱：</label><input id="crtq-email" name="email"><span class="hint" style="color:red">*必填</span>
						</div>
						<div>
						   <label for="crtq-prvtpage">您的个人主页：</label><input id="crtq-prvtpage" name="personalPage"><span class="hint">如有</span>
						</div>
						<div>
						   <label for="crtq-rmbme">记住个人信息：</label><input id="crtq-rmbme" name="rememberInfo" type="checkbox">
						</div>
						<div><input type="submit" value="提交" style="width:50px"></div>				
					</form>
				</div>
				 <!-- 评论 列表-->
				<div class="crtqList">
				   <p class="sectionSeparate">评论列表</p>
				   <ul>
				      <s:iterator value="critiqueList" var="critique">
							<li>
								<p>
									<s:property value="#critique.nickname" />	：
								</p>
								<p>
									<s:property value="#critique.content" />
								</p>
								<p>
									<span style="float: right"><s:property value="#critique.time" /></span>
								</p>
							</li>
						</s:iterator>
				   </ul>
				</div>
	        </div>
	   </div>
	   <aside> 
		  <jsp:include page="aside.jsp" /> 
	   </aside>
	</div>
	<!--mainbody end-->
	<footer>
	    <jsp:include page="foot.jsp"/>
	</footer>
	<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
	<div id="tbox">
		<a id="togbook" href="/e/tool/gbook/?bid=1"></a> <a id="gotop" href="javascript:void(0)"></a>
	</div>
</body>
</html>