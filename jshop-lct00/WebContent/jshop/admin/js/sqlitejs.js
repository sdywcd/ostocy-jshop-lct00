var a=true;
function validate(){
	
	var path=$('#path').val();
	if(path==""){
		jAlert("路径不能为空","信息提示");
		return false;
	}
	return a;
}
$(function(){
	$('#cof').click(function(){
		validate();
		if(a){
			var path=$('#path').val();
			$.post("createTable.action",{"path":path},function(data){
				if(data.sqlite){
					jAlert("生成成功","信息提示");
				}
			});
		}
	});
});