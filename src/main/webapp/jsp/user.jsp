<%@ page import="java.util.List" %>
<%@ page import="com.demo.ssm.entity.Userinfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/10 0010
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script>
        $(function() {
            $(".meun-item").click(function() {
                $(".meun-item").removeClass("meun-item-active");
                $(this).addClass("meun-item-active");
                var itmeObj = $(".meun-item").find("img");
                itmeObj.each(function() {
                    var items = $(this).attr("src");
                    items = items.replace("_grey.png", ".png");
                    items = items.replace(".png", "_grey.png")
                    $(this).attr("src", items);
                });
                var attrObj = $(this).find("img").attr("src");
                ;
                attrObj = attrObj.replace("_grey.png", ".png");
                $(this).find("img").attr("src", attrObj);
            });
            $("#topAD").click(function() {
                $("#topA").toggleClass(" glyphicon-triangle-right");
                $("#topA").toggleClass(" glyphicon-triangle-bottom");
            });
            $("#topBD").click(function() {
                $("#topB").toggleClass(" glyphicon-triangle-right");
                $("#topB").toggleClass(" glyphicon-triangle-bottom");
            });
            $("#topCD").click(function() {
                $("#topC").toggleClass(" glyphicon-triangle-right");
                $("#topC").toggleClass(" glyphicon-triangle-bottom");
            });
            $(".toggle-btn").click(function() {
                $("#leftMeun").toggleClass("show");
                $("#rightContent").toggleClass("pd0px");
            })
        })

    </script>
    <script>
        function getData(){
        var u = parseInt(document.getElementById("index").value);

        var b = document.getElementById("myuserid").value = u;
            alert(b);
        }

    </script>
    <!--[if lt IE 9]>
    <script src="../js/html5shiv.min.js"></script>
    <script src="../js/respond.min.js"></script>
    <![endif]-->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/common.css" />
    <link rel="stylesheet" type="text/css" href="../css/slide.css" />
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="../css/flat-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="../css/jquery.nouislider.css">

</head>
<body>
<button class="btn btn-yellow btn-xs" data-toggle="modal" data-target="#addUser" style="margin: 20px">添加用户 </button>
<div class="data-div" style="width: 80%;height: auto;border: 1px solid lightgrey;margin: 20px" >
    <div class="row tableHeader" style="margin: auto;text-align: center">
        <div class="col-xs-2" style="width: 10%">
            id
        </div>
        <div class="col-xs-2" style="width: 15%">
            用户名
        </div>
        <div class="col-xs-2" style="width: 15%">
            地区
        </div>
        <div class="col-xs-2" style="width: 15%">
            真实姓名
        </div>
        <div class="col-xs-2" style="width: 15%">
            电话
        </div>
        <div class="col-xs-2" style="width: 10%">
            状态
        </div>

        <div class="col-xs-2" style="width: 20%">
            操作
        </div>
    </div>

<div class="tablebody">
<c:forEach items="${search}" var="ui" varStatus="vs">
    <div class="row" style="text-align: center;margin: auto">
        <div class="col-xs-2" style="width: 10%">
                ${ui.userid}
        </div>
        <div class="col-xs-2" style="width: 15%">
                ${ui.username}
        </div>

        <div class="col-xs-2" style="width: 15%">
                ${ui.useraddr}
        </div>
        <div class="col-xs-2" style="width: 15%">
                ${ui.userrealname}
        </div>
        <div class="col-xs-2" style="width: 15%">
                ${ui.userphone}
        </div>
        <div class="col-xs-2" style="width: 10%">
                ${ui.userstate}
        </div>

        <%--<input type="hidden" value="${vs.index}" id="index">--%>

        <div class="col-xs-2" style="width: 20%">
            <button class="btn btn-success btn-xs" data-toggle="modal" data-target="#reviseUser">修改</button>
            <button  href="userid?=${ui.userid}" id="delData" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteUser" type="button">删除</button>
        </div>

        <!--弹出修改用户窗口-->





    </div>
</c:forEach>
</div>

</div>


<%--<table border="1px">
    <thead align="center">
    <td>用户名</td>
    <td>地区</td>
    <td>真实姓名</td>
    <td>电话</td>
    <td>状态</td>
    <td>操作</td>

    </thead>
    <c:forEach items="${search}" var="ui">
        <tr>
            <td> ${ui.username}</td>
            <td> ${ui.useraddr}</td>
            <td> ${ui.userrealname}</td>
            <td> ${ui.userphone}</td>
            <td> ${ui.userstate}</td>
            <td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#reviseUser">修改</button>
                <button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteUser">删除</button></td>
        </tr>
    </c:forEach>
</table>--%>
<div class="modal fade" id="reviseUser" role="dialog" aria-labelledby="gridSystemModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="gridSystemModalLabel">修改用户</h4>
            </div>
            <div class="modal-body">
                <div class="container-fluid">
                    <form class="form-horizontal" action="/userinfo/updateUserInfo.do" method="post">
                        <div class="form-group ">
                            <label for="sName" class="col-xs-3 control-label">用户名：</label>
                            <div class="col-xs-8 ">
                                <input type="text" class="form-control input-sm duiqi" name="u_username" placeholder="" value="${ui.username}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sLink" class="col-xs-3 control-label">真实姓名：</label>
                            <div class="col-xs-8 ">
                                <input type="text" class="form-control input-sm duiqi" name="u_realname" placeholder="" value="${ui.userrealname}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="sKnot" class="col-xs-3 control-label">电话：</label>
                            <div class="col-xs-8">
                                <input type="tel" class="form-control input-sm duiqi" name="u_userphone" placeholder="" value="${ui.userphone}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sKnot" class="col-xs-3 control-label">地区：</label>
                            <div class="col-xs-8">
                                <input type="text" class="form-control input-sm duiqi" name="u_useraddr" placeholder="" value="${ui.useraddr}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="situation" class="col-xs-3 control-label">状态：</label>
                            <div class="col-xs-8">
                                <c:if test="${ui.userstate=='在职'}">
                                    <label class="control-label" for="anniu">
                                        <input type="radio" name="u_userstate" id="normal" checked="checked">在职</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <label class="control-label" for="meun">
                                        <input type="radio" name="u_userstate" id="forbid"> 离职</label>
                                </c:if>
                                <c:if test="${ui.userstate=='离职'}">
                                    <label class="control-label" for="anniu">
                                        <input type="radio" name="u_userstate" id="normal" >在职</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <label class="control-label" for="meun">
                                        <input type="radio" name="u_userstate" id="forbid" checked="checked"> 离职</label>
                                </c:if>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                <button type="button" class="btn btn-xs btn-green">保 存</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!--弹出删除用户警告窗口-->
<div class="modal fade" id="deleteUser" role="dialog" aria-labelledby="gridSystemModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
            </div>
            <form action="/userinfo/deleteUserInfo.do" method="post">

                <div class="modal-body">
                    <div class="container-fluid">
                        确定要删除该用户？删除后不可恢复！
                    </div>
                </div>

                <input type="hidden" value="" id="myuserid">
                <div class="modal-footer">
                    <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                    <button type="submit" class="btn  btn-xs btn-danger">保 存</button>
                </div>
            </form>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->


<!--弹出添加用户窗口-->
<div class="modal fade" id="addUser" role="dialog" aria-labelledby="gridSystemModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="gridSystemModalLabel">添加用户</h4>
            </div>
            <div class="modal-body">
                <div class="container-fluid">
                    <form class="form-horizontal" method="post" action="/userinfo/addUserInfo.do">
                        <div class="form-group ">
                            <label for="sName" class="col-xs-3 control-label">用户名：</label>
                            <div class="col-xs-8 ">
                                <input type="text" class="form-control input-sm duiqi" name="username" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sLink" class="col-xs-3 control-label">真实姓名：</label>
                            <div class="col-xs-8 ">
                                <input type="text" class="form-control input-sm duiqi" name="realname" placeholder="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="sKnot" class="col-xs-3 control-label">电话：</label>
                            <div class="col-xs-8">
                                <input type="tel" class="form-control input-sm duiqi" name="userphone" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="sKnot" class="col-xs-3 control-label">地区：</label>
                            <div class="col-xs-8">
                                <select class=" form-control select-duiqi" name="useraddr">
                                    <option value="福建泉州">福建泉州</option>
                                    <option value="山东济南">山东济南</option>
                                    <option value="甘肃兰州">甘肃兰州</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="situation" class="col-xs-3 control-label">状态：</label>
                            <div class="col-xs-8">
                                <label class="control-label" for="anniu">
                                    <input type="radio" name="state" id="normal" value="在职">在职</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <label class="control-label" for="meun">
                                    <input type="radio" name="state" id="forbid" value="离职"> 离职</label>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                            <button type="submit" class="btn btn-xs btn-green">保 存</button>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->



</body>
</html>
