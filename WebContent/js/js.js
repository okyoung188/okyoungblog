
function b(){
	h = $(window).height();
	t = $(document).scrollTop();
	if(t > h){
		$('#gotop').show();
	}else{
		$('#gotop').hide();
	}
}

/**
 * 获取当前页的导航项目，并高亮显示
 */
function navAnm(){
	var obj=null;
	var As=document.getElementById('nav').getElementsByTagName('a');
	obj = As[0];
	for(var i=1;i<As.length;i++){if(window.location.href.indexOf(As[i].href)>=0)
	obj=As[i];}
	obj.id='nav_current';	
}

$(document).ready(function(e) {
	b();
	/**
	 * 返回顶部
	 */
	$('#gotop').click(function(){
		$(document).scrollTop(0);	
	});	
	navAnm();
	
	/*分页*/
	 $.jqPaginator('#pagination', {  
	        totalPages: total_pages,  
	        visiblePages: visible_pages,  
	        currentPage: current_page,  
	        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',  
	        next: '<li class="next"><a href="javascript:;">下一页</a></li>',  
	        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',  
	        onPageChange: function (page, type) {  
	            // alert(type + '：' + page);  
	            if(if_firstime){  
	                if_firstime = false;  
	            }else if(!if_firstime){  
	                changePage(page);  
	            }  
	              
	        }  
	    });  
	
	/*$(".pageBox").pageFun({  在本地服务器上才能访问哦
		interFace:"data/page.json",  接口
		displayCount:4,  每页显示总条数
		maxPage:5,每次最多加载多少页
		dataFun:function(data){
			var dataHtml = '<li>'+data.dataNum+'</li>';
				return dataHtml;
		},
		pageFun:function(i){
			var pageHtml = '<li class="pageNum">'+i+'</li>';
				return pageHtml;
		}

	})*/
});

$(window).scroll(function(e){
	b();		
})
