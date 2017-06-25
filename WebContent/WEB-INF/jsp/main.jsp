<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<title>博客主页</title>
<meta name="keywords" content="黑色模板,个人网站模板,个人博客模板,博客模板,css3,html5,网站模板" />
<meta name="description" content="这是一个有关黑色时间轴的css3 html5 网站模板" />
<link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animation.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/page.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqPaginator.min.js"></script>
<style>
.pageDiv{font:14px "微软雅黑", "Microsoft Yahei";text-align:center;width:100%;height:50px;padding:10px 10px;background-color:#D6D6D6}
.pageDiv div{float:left;line-height:25px}
.pageDiv a {float:left;dispaly:inline-block;width:70px;height:25px;margin-left:5px;background:#f0f0f0;line-height:25px}
.pageDiv a.focusedPage{background-color:red}
.pageDiv span.disabledButton{background-color: #D3A6A9}
.pageDiv>span{float:left;dispaly:inline-block;width:70px;height:25px;margin-left:5px;background:#f0f0f0;line-height:25px}
.pageButtons a{float:left;dispaly:inline-block;width:45px;height:25px;backrgound:#f0f0f0}
.pageDiv a:hover{background-color:#e0e0e0}
</style>
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
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
		<div class="blogs">
			<ul class="bloglist">
			    <li style="border-right:0px;"><div class="arrow_box currposition"><span>当前的位置：</span><a id="current"><s:property value=""/></a></div></li>
				<s:iterator value="modelList" var="art">
					<li>
						<div class="arrow_box">
							<div class="ti"></div>
							<!--三角形-->
							<div class="ci"></div>
							<!--圆形-->
							<h2 class="title">
								<a href="/" target="_blank"><s:property value="#art.title"/></a>
							</h2>
							<ul class="textinfo">
								<a href="/"><img src='<s:property value="#art.indeximg"/>'></a>
								<p><s:property value="#art.content"/></p>
							</ul>
							<ul class="details">
								<li class="likes"><a href="#"><s:property value="#art.viewCount"/></a></li>
								<li class="comments"><a href="#"><s:property value="#art.critiqueSize"/></a></li>
								<li class="icon-time"><a href="#"><s:property value="#art.time"/></a></li>
							</ul>
						</div> <!--arrow_box end-->
					</li>
				</s:iterator>
				<li style="border-right: 0px;">
					<div id="pageDiv" class="pageDiv">
						<a id="firstPage" class="firstPage">首页</a> <a id="prevPage" class="prevPage">< 上一页</a> <a id="prevPageG" class="prevPageG">...</a>
						<div id="pageButtons" class="pageButtons"></div>
						<a id="nextPageG" class="nextPageG">...</a> <a id="nextPage" class="nextPage">下一页 ></a> <a id="lastPage" class="lastPage">尾页</a>
						<div class="last" style="font-size: 14px;">
							共<span id="totalPage" class="totalPage"></span>页，跳转至 <input type="number" class="keuInput" value="1" style="width: 35px">
							<button type="button" class="btnSure">确定</button>
						</div>
					</div>
				</li>
			</ul>
			<!--bloglist end-->
			<aside>
				<div class="card">
					<h1>我的名片</h1>
					<p>网名：Harry Yang</p>
					<p>职业：Java工程师</p>
					<p>电话：18817504792</p>
					<p>Email：18817504792@126.com</p>
					<ul class="linkmore">
						<li><a href="/" class="talk" title="给我留言"></a></li>
						<li><a href="/" class="address" title="联系地址"></a></li>
						<li><a href="/" class="email" title="给我写信"></a></li>
						<li><a href="/" class="photos" title="生活照片"></a></li>
						<li><a href="/" class="heart" title="关注我"></a></li>
					</ul>
				</div>
				<div class="search">
					<form class="searchform" method="get" action="#">
						<input type="text" name="s" value="Search" onfocus="this.value=''" onblur="this.value='Search'">
					</form>
				</div>
				<div class="viny">
					<dl>
						<dt class="art">
							<img src="/resource/image/images/artwork.png" alt="专辑">
						</dt>
						<dd class="icon-song">
							<span></span>南方姑娘
						</dd>
						<dd class="icon-artist">
							<span></span>歌手：赵雷
						</dd>
						<dd class="icon-album">
							<span></span>所属专辑：《赵小雷》
						</dd>
						<dd class="icon-like">
							<span></span><a href="/">喜欢</a>
						</dd>
						<dd class="music">
							<audio src="/resource/image/images/nf.mp3" controls></audio>
						</dd>
						<!--也可以添加loop属性 音频加载到末尾时，会重新播放-->
					</dl>
				</div>
				<div class="tuijian">
					<h2>推荐文章</h2>
					<ol>
						<li><span><strong>1</strong></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>
						<li><span><strong>2</strong></span><a href="/">励志人生-要做一个潇洒的女人</a></li>
						<li><span><strong>3</strong></span><a href="/">女孩都有浪漫的小情怀――浪漫的求婚词</a></li>
						<li><span><strong>4</strong></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>
						<li><span><strong>5</strong></span><a href="/">女生清新个人博客网站模板</a></li>
						<li><span><strong>6</strong></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>
						<li><span><strong>7</strong></span><a href="/">Column 三栏布局 个人网站模板</a></li>
						<li><span><strong>8</strong></span><a href="/">时间煮雨-个人网站模板</a></li>
						<li><span><strong>9</strong></span><a href="/">花气袭人是酒香―个人网站模板</a></li>
					</ol>
				</div>
				<div class="toppic">
					<h2>图文并茂</h2>
					<ul>
						<li><a href="/"><img src="/resource/image/images/k01.jpg">腐女不可怕，就怕腐女会画画！
								<p>伤不起</p> </a></li>
						<li><a href="/"><img src="/resource/image/images/k02.jpg">问前任，你还爱我吗？无限戳中泪点~
								<p>感兴趣</p> </a></li>
						<li><a href="/"><img src="/resource/image/images/k03.jpg">世上所谓幸福，就是一个笨蛋遇到一个傻瓜。
								<p>喜欢</p> </a></li>
					</ul>
				</div>
				<div class="clicks">
					<h2>热门点击</h2>
					<ol>
						<li><span><a href="/">慢生活</a></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>
						<li><span><a href="/">爱情美文</a></span><a href="/">励志人生-要做一个潇洒的女人</a></li>
						<li><span><a href="/">慢生活</a></span><a href="/">女孩都有浪漫的小情怀――浪漫的求婚词</a></li>
						<li><span><a href="/">博客模板</a></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>
						<li><span><a href="/">女生个人博客</a></span><a href="/">女生清新个人博客网站模板</a></li>
						<li><span><a href="/">Wedding</a></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>
						<li><span><a href="/">三栏布局</a></span><a href="/">Column 三栏布局 个人网站模板</a></li>
						<li><span><a href="/">个人网站模板</a></span><a href="/">时间煮雨-个人网站模板</a></li>
						<li><span><a href="/">古典风格</a></span><a href="/">花气袭人是酒香―个人网站模板</a></li>
					</ol>
				</div>
			</aside>
		</div>
		<!--blogs end-->
	</div>
	<!--mainbody end-->
	<footer>
		<div class="footer-mid">
			<div class="links">
				<h2>友情链接</h2>
				<ul>
					<li><a href="/">杨青个人博客</a></li>
					<li><a href="http://www.3dst.com">3DST技术服务中心</a></li>
				</ul>
			</div>
			<div class="visitors">
				<h2>最新评论</h2>
				<dl>
					<dt>
						<img src="/resource/image/images/s8.jpg">
					<dt>
					<dd>
						DanceSmile
						<time>49分钟前</time>
					</dd>
					<dd>
						在 <a href="http://www.yangqq.com/jstt/bj/2013-07-28/530.html" class="title">如果要学习web前端开发，需要学习什么？ </a>中评论：
					</dd>
					<dd>文章非常详细，我很喜欢.前端的工程师很少，我记得几年前yahoo花高薪招聘前端也招不到</dd>
				</dl>
				<dl>
					<dt>
						<img src="/resource/image/images/s7.jpg">
					<dt>
					<dd>
						yisa
						<time>2小时前</time>
					</dd>
					<dd>
						在 <a href="http://www.yangqq.com/news/s/2013-07-31/533.html" class="title">芭蕾女孩的心事儿</a>中评论：
					</dd>
					<dd>我手机里面也有这样一个号码存在</dd>
				</dl>
				<dl>
					<dt>
						<img src="/resource/image/images/s6.jpg">
					<dt>
					<dd>
						小林博客
						<time>8月7日</time>
					</dd>
					<dd>
						在 <a href="http://www.yangqq.com/jstt/bj/2013-06-18/285.html" class="title">如果个人博客网站再没有价值，你还会坚持吗？ </a>中评论：
					</dd>
					<dd>博客色彩丰富，很是好看</dd>
				</dl>
			</div>
			<section class="flickr">
				<h2>摄影作品</h2>
				<ul>
					<li><a href="/"><img src="/resource/image/images/01.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/02.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/03.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/04.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/05.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/06.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/07.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/08.jpg"></a></li>
					<li><a href="/"><img src="/resource/image/images/09.jpg"></a></li>
				</ul>
			</section>
		</div>
		<div class="footer-bottom">
			<p>
				Copyright 2013 Design by <a href="http://www.yangqq.com">DanceSmile</a>
			</p>
		</div>
	</footer>
	<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
	<div id="tbox">
		<a id="togbook" href="/e/tool/gbook/?bid=1"></a> <a id="gotop" href="javascript:void(0)"></a>
	</div>
	<!-- 代码结束 -->
	<script type="text/javascript">
	function initPage() {
		var reqType='<s:property value="[0].reqType"/>', reqData='<s:property value="[0].reqData"/>';
		var pageTotal=<s:property value="[0].pageTotal"/>, pageNum=<s:property value="[0].pageNum"/>, pageSize=<s:property value="[0].pageSize"/>;
        var pageGSize = 5;//one group have 5 page btns
		
		//#pageTotal
		if (pageTotal > 0) {
			$('#pageTotal').text(pageTotal);
		} else {
			$('#pageTotal').text('0');
		}
		
		// #pageDiv
		if (pageNum>0&& pageTotal>0 && pageNum <= pageTotal) {
			var index = (pageNum - 1) % pageGSize;//start with 0
			var pageGroup = Math.floor((pageNum - 1) / pageGSize);//start with 0
			var groupSize = Math.floor(pageTotal / pageGSize)
					+ (pageTotal % pageGSize > 0 ? 1 : 0);
			if (pageGroup >= groupSize - 1) {//last group
				fillPage(pageTotal - pageGroup*pageGSize);// append number
			} else {
				fillPage(pageGSize);
			}
			$('#totalPage').html(pageTotal);
		} else {
			return;
		}
		
		//#firstPage,prevPage,prevPageG,nextPage,nextPageG,lastPage
		if (pageNum == 1) {
			disableDiv($('#firstPage'));
			disableDiv($('#prevPage'));
		} else if (pageNum == pageTotal) {
			disableDiv($('#lastPage'));
			disableDiv($('#nextPage'));
		} 
		if (pageGroup >= groupSize - 1) {
			disableDiv($('#nextPageG'));
		}
		if (!pageGroup) {
			disableDiv($('#prevPageG'));
		}

		$('#firstPage').on('click', (function() {
			return function(){requestBlog(reqType, reqData, 1, pageSize)};
		})());
		$('#lastPage').on('click', (function() {
			return function(){requestBlog(reqType, reqData, pageTotal, pageSize)};
		})());
		$('#prevPage').on('click', (function() {
			return function(){requestBlog(reqType, reqData, pageNum - 1, pageSize)};
		})());
		$('#nextPage').on('click', (function() {
			return function(){requestBlog(reqType, reqData, pageNum + 1, pageSize)};
		})());
		$('#prevPageG').on(
				'click',
				(function() {
					return function(){requestBlog(reqType, reqData, (pageGroup - 1) * pageGSize + 1, pageSize)};
				})()
				);
		$('#nextPageG').on(
				'click',
				(function() {
					return function(){requestBlog(reqType, reqData, (pageGroup + 1) * pageGSize + 1, pageSize)};
				})()
	            );
		
		function fillPage(num) {
			if (!num) {
				num = 5;//default 5
			}
			for (var i = 0; i < num; i++) {
				$('#pageButtons').append(
						'<a href="javascript:void(0)" class="pageButton"'
								+ 'onclick="requestBlog(\'' + reqType + '\',\''
								+ reqData + '\',' + (pageNum - index + i)
								+ ',' + pageSize + ')">'
								+ (pageNum - index + i) + '</a>');
			}
			var focused = $('#pageButtons a').get(index);
		    $(focused).addClass('focusedPage');
		/* 	$(focused).css('background-color','red'); */
		}
	}
	initPage();

	function requestBlog(reqType, reqData, pageNum, pageSize) {
		window.location.href = window.location.href.replace(/(.*?)\?.+/, "$1") +'?' + reqType + '=' + encodeURI(reqData) + '&'
				+ 'pageNum=' + pageNum + '&' + 'pageSize=' + pageSize;
	}
	function disableDiv(obj) {
		if (!obj instanceof jQuery) {
			obj = $(obj);
		}
		obj.replaceWith(function() {
			return $('<span/>', {
				html : $(this).html(),
				class : 'disabledButton'
			});
		});
	}
	</script>
</body>
</html>