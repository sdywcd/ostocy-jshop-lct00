/**
 * ui
 */
$(function(){
	style_path = "resources/css/colors";
	$("#date-picker").datepicker();
	$("#box-tabs, #box-left-tabs").tabs();
});
/*===========================================Gorgeous split-line==============================================*/
/**
 * Function
 */
//一件更新商城
function buildAllHtml(){
	$('#backinfo').html("正在生成网站请稍候......");
	$('#buildhtmlsubmit').attr("disabled",true);
	$.post("buildAllHtml.action",function(data){
		
		if(data.status=="success"){
			$('#backinfo').append(data.buildlog);
			$('#buildhtmlsubmit').attr("disabled",false);
			return;
		}
	});
}
/*===========================================Gorgeous split-line==============================================*/

/**
 * 检测用户是否登录并实行跳转控制
 */
$(function(){
	$.post("CheckLogin.action",function(data){
		if(data.slogin){
			var pathnamearray=window.location.pathname.split("/");
			var pathname=pathnamearray[1]+"/";
			if(pathname=="jshop/"){
				pathname="";
			}
		    top.location.href="http://"+window.location.host+"/"+pathname+"jshop/admin/jump.jsp";
		}else{
			if(data.length>0){
				var pathnamearray=window.location.pathname.split("/");
				var pathname=pathnamearray[1]+"/";
				if(pathname=="jshop/"){
					pathname="";
				}
				top.location.href="http://"+window.location.host+"/"+pathname+"jshop/admin/jump.jsp";
			}else{
				return;
			}
		}

	})
});

/*===========================================Gorgeous split-line==============================================*/


