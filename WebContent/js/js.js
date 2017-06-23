
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
	 
	 
		/**
		 *  Class : focusedPage, pageButtion
		 */
	 function initPage(){
		 var reqType,reqData;
		 var pageTotal,pageNum,pageSize;
		 
		 //#pageTotal
		 if(pageTotal > 0){
	    	 $('#pageTotal').text(pageTotal);
		 } else {
			 $('#pageTotal').text('0');
		 }
		 // #pageDiv
		 if (pageGroup >= groupSize -1){//last group
			fillPage(pageTotal);// append number
		 } else {
			fillPage(pageSize);
		 }
		 //#firstPage,prevPage,prevPageG,nextPage,nextPageG,lastPage
		 if(pageTotal > 0){
			 if(pageNum && pageNum <= pageTotal){
				 if (pageNum == 1){
					 disableDiv($('#firstPage'));
					 disableDiv($('#prevPage'));
				 } else if (pageNum == pageTotal){
					 disableDiv($('#lastPage'));
					 disableDiv($('#nextPage'));
				 } else {
					 var index = (pageNum-1) % pageSize;
					 var pageGroup = (pageNum-1) / pageSize;
					 var groupSize = pageTotal / pageSize + (pageTotal % pageSize > 0 ? 1 : 0);
					 if(pageGroup >= groupSize - 1){
						 diableDiv($('#nextPageG'));
					 }
					 if (!pageGroup){
						 disableDiv($('#prevPageG'));
					 }
				 }
			 }else{
				 disableDiv($('#firstPage,#prevPage,#prevPageG,#nextPage,#nextPageG,#lastPage'));
			 }
		 } else {
			 disableDiv($('#firstPage,#prevPage,#prevPageG,#nextPage,#nextPageG,#lastPage'));
		 }
		 
		 function fillPage(num){
			 if (!num){
				 num=5;//default 5
			 }
			 for (var i=0;i < num;i++){
				 $('#page').append(
						 '<a href="javascript:void(0)" class="pageButton"' +
						 'onclick="requestBlog('
						 +reqType+','+reqData+',' + (pageNum - index + i)+ ','+pageSize+')">'
						 + (pageNum - index + i)+ '</a>');
			 }
			 var focused = $('#page a').get(index);
			 $(focused).addClass('focusedPage');
		 }
		 
		 $('#firstPage').on('click',function(){
			 requestBlog(reqType,reqData,1,pageSize);
		 });
		 $('#lastPage').on('click',function(){
			 requestBlog(reqType,reqData,pageTotal,pageSize);
		 });
		 $('#prevPage').on('click',function(){
			 requestBlog(reqType,reqData,pageNum - 1,pageSize);
		 });
		 $('#nextPage').on('click',function(){
			 requestBlog(reqType,reqData,pageNum + 1,pageSize);
		 });
		 $('#prevPageG').on('click',function(){
			 requestBlog(reqType,reqData,(pageGroup-1)*pageSize+1,pageSize);
		 });
		 $('#nextPageG').on('click',function(){
			 requestBlog(reqType,reqData,(pageGroup+1)*pageSize+1,pageSize);
		 });
	 }
	initPage();


	function requestBlog(reqType,reqData,pageNum,pageSize){
		window.location.href='?'+reqType+'='+reqData+'&'+'pageNum='+pageNum+'&'+'pageSize='+pageSize;
	}
	
    function disaleDiv(obj){
    	if (!obj instanceof jQuery){
    	  obj = $(obj);	
    	}
    	obj.replaceWith(function(){
    		return $('<span/>',{html:$(this).html(),class:'pageButtion disabledButton'});
    	});
    }
	 
	 
});




$(window).scroll(function(e){
	b();		
})
