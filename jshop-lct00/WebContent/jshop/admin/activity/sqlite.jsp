<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>

		<title>sqlite数据库存放路径</title>


	</head>

	<body>

		<!-- header 包含头部导航-->
		<%@include file="/jshop/admin/header.jsp"%>
		<!-- end header -->
		<!-- content -->
		<div id="content">
			<!-- end content / left -->
			<%@include file="/jshop/admin/left.jsp"%>
			<!-- end content / left -->
			<!-- content / right -->
			<div id="right">
				<!-- table -->
				<div class="box">
					<!-- box / title -->
					<div class="title">
						<h5>
							sqlite数据库存放路径
						</h5>

					</div>

					<div class="form">
						<div class="fields">
							<div class="field field-first">
								<div class="label">
									<label for="input-small">
										存放路径:
									</label>
								</div>
								<div class="input">
									<input type="text" id="path" name="path" class="small" />
									<div class="button highlight">
										<input type="button"  id="cof" name="cof" value="确定" />
										
									</div>
								</div>
								
							</div>
							
						</div>
						<div>
						<h6 style="color: red">注意：如果是win7系统的用户，请不要把存放路径放在C盘。格式：C:/</h6>
						</div>
					</div>


					

				
				</div>
				<!-- end table -->

				<script type="text/javascript" src="<%=basePath%>jshop/admin/js/sqlitejs.js"></script>


			</div>
			<!-- end content / right -->
		</div>
		<!-- end content -->
		<!-- footer -->
		<%@include file="/jshop/admin/footer.jsp"%>
		<!-- end footert -->		



	</body>
</html>
