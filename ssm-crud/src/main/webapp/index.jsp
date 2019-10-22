<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery.min.js"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"
	rel="stylesheet"></script>

</head>

<body>

	<div class="modal fade" id="addUserModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新增学生</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" name="userName" class="form-control"
									id="addUserName" placeholder="姓名"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学号</label>
							<div class="col-sm-10">
								<input type="text" name="stuNo" class="form-control"
									id="addStuNo" placeholder="学号"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">电话</label>
							<div class="col-sm-10">
								<input type="text" name="phone" class="form-control"
									id="addPhone" placeholder="电话">
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">班级</label>
							<div class="col-sm-4">
								<select name="classId" class="form-control" id="addStuClass">

								</select>
							</div>
						</div>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="addBtn" class="btn btn-primary">保存</button>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="editUserModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">编辑学生</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" name="userName" class="form-control"
									id="editUserName" placeholder="姓名"> <span
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学号</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="editStuNo"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">电话</label>
							<div class="col-sm-10">
								<input type="text" name="phone" class="form-control"
									id="editPhone" placeholder="电话">
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">班级</label>
							<div class="col-sm-4">
								<select name="classId" class="form-control" id="editStuClass">

								</select>
							</div>
						</div>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="editBtn" class="btn btn-primary">保存</button>
				</div>
			</div>
		</div>
	</div>



	<div class="container">

		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>学生管理系统</h1>
			</div>

		</div>

		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary " onclick="showAdd()">新增</button>
				<button class="btn btn-danger" id="delete_all_btn">删除</button>
			</div>
		</div>

		<!-- 列表 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="student_list">
					<thead>
						<tr>
							<th><input type="checkbox" id="check_all" /></th>
							<th>编号</th>
							<th>姓名</th>
							<th>学号</th>
							<th>电话</th>
							<th>班级</th>
							<th>操作</th>
						</tr>
					</thead>

					<tbody>


					</tbody>
					<!-- <tr>
						<th>1</th>
						<th>2</th>
						<th>3</th>
						<th>4</th>
						<th>5</th>
						<th>
							<button class="btn btn-primary btn-sm">
								<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
								编辑
							</button>
							<button class="btn btn-danger btn-sm">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								删除
							</button>
						</th>
					</tr> -->
				</table>
			</div>

		</div>

		<!-- 页码 -->

		<!-- 分页文字记录数 -->
		<div class="row">
			<div class="col-md-6" id="page_info">
				<!-- 当前页，总页，总记录数 -->
			</div>

			<!-- 分页页码条 -->
			<div class="col-md-6" id="page_nav">
				<!-- <nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="#">首页</a></li>
					<li><a href="#" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
					</a></li>
					<li><a href="#">尾页</a></li>
				</ul>
				</nav> -->
			</div>
		</div>
	</div>

	<script type="text/javascript">
	
		var totalPage;
		var currentPage;
		var addCheck = true;
		var stuNoState = true;
	
		$(function() {
			to_page(1);
			create_class_list("#addStuClass");
		});
	
		function to_page(pageIndex) {
			$("#check_all").prop("checked", false);
			$.ajax({
				url : '${APP_PATH}/users',
				data : 'pageIndex=' + pageIndex,
				type : 'get',
				success : function(result) {
					console.log(result.data.pageInfo);
					create_student_list(result);
					create_page_info(result);
					create_page_nav(result);
				}
			});
	
		}
	
		function create_class_list(element) {
			$(element).empty();
			$.ajax({
				url : '${APP_PATH}/stuClass',
				type : 'get',
				success : function(result) {
	
					$.each(result.data.stuClass, function(i, o) {
						var classItem = $("<option></option>").append(o.className).attr("value", o.classId);
						classItem.appendTo(element);
					});
				}
			});
	
		}
	
		function create_student_list(result) {
			$("#student_list tbody").empty();
	
			var list = result.data.pageInfo.list;
			$.each(list, function(i, o) {
				var checkBox = $("<td><input type='checkbox' class='check_item'/></td>");
				var uid = $("<td></td>").append(o.uid);
				var name = $("<td></td>").append(o.userName);
				var stuNo = $("<td></td>").append(o.stuNo);
				var phone = $("<td></td>").append(o.phone);
				var className = $("<td></td>").append(o.stuClass.className);
	
				var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
					.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
	
				editBtn.attr("edit-id", o.uid);
	
				var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
					.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
	
				deleteBtn.attr("delete-id", o.uid);
				var btnArea = $("<td></td>").append(editBtn).append("  ").append(deleteBtn);
	
				$("<tr></tr>")
					.append(checkBox)
					.append(uid)
					.append(name)
					.append(stuNo)
					.append(phone)
					.append(className)
					.append(btnArea)
					.appendTo("#student_list tbody");
			});
	
		}
	
	
		function create_page_info(result) {
			$("#page_info").empty();
			$("#page_info").append("当前第" + result.data.pageInfo.pageNum + "页，总"
				+ result.data.pageInfo.pages + "页，总记录数"
				+ result.data.pageInfo.total + "条");
	
			totalPage = result.data.pageInfo.pages;
			currentPage = result.data.pageInfo.pageNum;
		}
	
		function create_page_nav(result) {
			var pageInfo = result.data.pageInfo;
	
			$("#page_nav").empty();
	
			var ul = $("<ul></ul>").addClass("pagination");
	
			var firstPage = $("<li></li>").append($("<a></a>").append("首页"));
			var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
			var nextPage = $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPage = $("<li></li>").append($("<a></a>").append("尾页"));
	
			if (pageInfo.isFirstPage == true) {
				firstPage.addClass("disabled");
			} else {
				firstPage.click(function() {
					to_page(1);
				});
			}
	
			if (pageInfo.hasPreviousPage == false) {
				prePage.addClass("disabled");
			} else {
				prePage.click(function() {
					to_page(pageInfo.pageNum - 1);
				});
			}
	
			if (pageInfo.hasNextPage == false) {
				nextPage.addClass("disabled");
			} else {
				nextPage.click(function() {
					to_page(pageInfo.pageNum + 1);
				});
			}
	
			if (pageInfo.isLastPage == true) {
				lastPage.addClass("disabled");
			} else {
	
				lastPage.click(function() {
					to_page(pageInfo.pages);
				});
			}
	
			ul.append(firstPage).append(prePage);
	
			$.each(pageInfo.navigatepageNums, function(i, o) {
				var tempPage = $("<li></li>").append($("<a></a>").append(o));
	
				if (pageInfo.pageNum == o) {
					tempPage.addClass("active");
				}
	
				tempPage.click(function() {
					to_page(o);
				});
	
	
				ul.append(tempPage);
			});
	
			ul.append(nextPage).append(lastPage);
	
			var nav = $("<nav></nav>").append(ul);
	
			nav.appendTo("#page_nav");
	
	
		}
	
		function reset_modal(element) {
			$(element)[0].reset();
			$(element).find("*").removeClass("has-success has-error");
			$(element).find(".help-block").text("");
	
		}
	
	
		function showAdd() {
			reset_modal('#addUserModal form');
			$('#addUserModal').modal('toggle');
		}
	
		function validate_add_form() {
			var userName = $("#addUserName").val();
			var regName = /(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,6})/;
	
			var stuNo = $("#addStuNo").val();
			var regStuNo = /^[0-9_-]{10,12}$/;
	
			if (!regName.test(userName)) {
				validate_show("#addUserName", "has-error", "姓名由2到5个字符或6到16为英文和数字的组合");
				addCheck = false;
			} else {
				validate_show("#addUserName", "has-success", "");		}
	
			if (!regStuNo.test(stuNo)) {
				validate_show("#addStuNo", "has-error", "学号由10到12位数字组合");
				addCheck = false;
			} else {
				if (!stuNoState) {
					validate_show("#addStuNo", "has-error", "该学号已存在");
				} else {
	
					validate_show("#addStuNo", "has-success", "");
				}
			}
	
			if (regName.test(userName) && regStuNo.test(stuNo)) {
				addCheck = true;
			}
	
	
		}
	
		function validate_show(id, type, msg) {
			$(id).parent().removeClass("has-success has-error");
			$(id).next("span").text("");
			$(id).parent().addClass(type);
			$(id).next("span").text(msg);
		}
	
		$("#addStuNo").change(function() {
			$.ajax({
				url : '${APP_PATH}/check_user',
				data : "stuNo=" + $("#addStuNo").val(),
				type : 'get',
				success : function(result) {
					if (result.code == 200) {
						$("#addBtn").attr("btn-state", "success");
						validate_show("#addStuNo", "has-success", "");
						stuNoState = true;
					} else {
						validate_show("#addStuNo", "has-error", result.data.reason);
						$("#addBtn").attr("btn-state", "error");
						stuNoState = false;
					}
				}
			});
		});
	
	
	
	
	
	
		$("#addBtn").click(function() {
			validate_add_form();
			if (!addCheck || ($(this).attr("btn-state") == "error")) {
				alert("用户名出问题");
				return false;
			}
	
			$.ajax({
				url : '${APP_PATH}/user',
				data : $("#addUserModal form").serialize(),
				type : 'POST',
				success : function(result) {
					if (result.code == 200) {
						alert(result.msg);
						$("#addUserModal").modal('hide');
						to_page(totalPage);
					} else {
	
						console.log(result);
	
						if (undefined != result.data.error.stuNo) {
							validate_show("#addStuNo", "has-error", result.data.error.stuNo);
						} else {
							validate_show("#addStuNo", "has-success", "");
						}
	
						if (undefined != result.data.error.userName) {
							validate_show("#addUserName", "has-error", result.data.error.userName);
						} else {
							validate_show("#addUserName", "has-success", "");
						}
					}
				}
			});
		});
	
	
		$(document).on("click", ".edit_btn", function() {
	
			create_class_list("#editStuClass");
			getUser($(this).attr('edit-id'));
			$("#editBtn").attr('edit-id', $(this).attr('edit-id'));
			$('#editUserModal').modal('toggle');
	
		});
	
		function getUser(id) {
			$.ajax({
				url : '${APP_PATH}/user/' + id,
				type : 'GET',
				success : function(result) {
					console.log(result);
					$("#editUserName").val(result.data.user.userName);
					$("#editStuNo").text(result.data.user.stuNo);
					$("#editPhone").val(result.data.user.phone);
					$("#editUserModal select").val([ result.data.user.classId ]);
				}
			});
		}
	
		$("#editBtn").click(function() {
			var userName = $("#editUserName").val();
			var regName = /(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,6})/;
	
			if (!regName.test(userName)) {
				validate_show("#editUserName", "has-error", "姓名由2到5个字符或6到16为英文和数字的组合");
				alert("用户名出问题");
				return false;
			} else {
				validate_show("#editUserName", "has-success", "");
			}
	
			var id = $(this).attr("edit-id");
			$.ajax({
				url : '${APP_PATH}/user/' + id,
				data : $("#editUserModal form").serialize(),
				type : 'PUT',
				success : function(result) {
					$("#editUserModal").modal('hide');
					to_page(currentPage);
	
				}
			});
		});
	
		$(document).on("click", ".delete_btn", function() {
	
			var name = $(this).parents("tr").find("td:eq(2)").text();
			var id = $(this).attr('delete-id');
	
			if (confirm("确认删除用户:" + name + "吗?")) {
				$.ajax({
					url : "${APP_PATH}/user/" + id,
					type : "DELETE",
					success : function(result) {
						alert(result.msg);
						to_page(currentPage);
					}
				});
	
			}
		});
	
		$("#check_all").click(function() {
	
			$(".check_item").prop("checked", $(this).prop("checked"));
	
		});
	
		$(document).on("click", ".check_item", function() {
	
			var flag = $(".check_item:checked").length == $(".check_item").length;
			$("#check_all").prop("checked", flag);
	
		})
	
		$("#delete_all_btn").click(function() {
	
			if ($(".check_item:checked").length == 0) {
				alert("请勾选要删除的用户");
			} else {
	
				var nameString = "";
				var idString = "";
				$.each($(".check_item:checked"), function() {
					nameString += $(this).parents("tr").find("td:eq(2)").text() + ",";
					idString += $(this).parents("tr").find(".edit_btn").attr("edit-id") + "-";
				});
				nameString = nameString.substring(0, nameString.length - 1);
				idString = idString.substring(0, idString.length - 1);
				if (confirm("确认删除以下用户?:\n" + nameString)) {
	                 $.ajax({
                         url:"${APP_PATH}/user/"+idString,
                         type:"DELETE",
                         success:function(result){
                             alert(result.msg);
                             to_page(currentPage);
                         }	                 
	                 
	                 });
				}
			}
		});
	</script>
</body>
</html>
