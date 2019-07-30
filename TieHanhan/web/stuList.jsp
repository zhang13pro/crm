<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/30
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>在校生管理</title>
    <link href="css/list.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<div id="main">
    <div id="topMenu">
        <span class="tip">[在校生管理]</span>
        <%--TODO 添加模块--%>
        <a href="stuAdd.jsp" target="mainframe">
            <img src="images/button/tianjia.gif">
        </a>
        <button class="btn" onClick="query()"/>
    </div>
    <div id="selectFrom">
        <form action="" method="get">
            <table border="0" width="400px" height="40px" style="margin-left:10px">
                <tr>
                    <td>班级:</td>
                    <td>
                        <select name="className" id="classId">
                            <option value="-1">--请选择班级--</option>
                            <option value="1">A</option>
                            <option value="2">B</option>
                            <option value="3">C</option>
                        </select>
                    </td>

                    <td>学生姓名:</td>
                    <td>
                        <input name="sename"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div id="dataArea">
        <img src="images/result.gif"/>
        <table class="dataTable" width="100%" border="1" cellspacing="0" cellpadding="0">
            <tr class="hbg">
                <th>编号</th>
                <th>学生姓名</th>
                <th>性别</th>
                <th>入学时间</th>
                <th>所在班级</th>
                <th>状态</th>
                <th>编辑</th>
            </tr>
            <c:if test="${stuList == null}">
                <c:redirect url="stuServlet.do" />
            </c:if>
            <c:forEach items="${stuList}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.stuName}</td>
                <td>${stu.stuSex}</td>
                <td>${stu.beginTime}</td>
                <td>${stu.checkLevel}</td>
                <td>${stu.stuState}</td>
                <td>
                    <%--TODO 编辑 删除模块--%>
                    <a href="stuEdit.jsp?id=${stu.id}"><img src="images/button/modify.gif" class="img"></a>
                    <a href="stuDelete.do?id=${stu.id}"><img src="images/button/delete.gif" class="img"></a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="pageDiv">
    <span id="pageSpanId">当前1页/共2页,总条数6条。<br>
        <a href="">&nbsp;1&nbsp;</a>
        <a href="">&nbsp;2&nbsp;</a>
        <a href="">下一页</a>
        <a href="">尾页</a>
    </span>
        <input type="text" id="pageGoInputId" size="4"><input type="button" onclick="pageGo()" value="go">
    </div>
</div>
</body>
</html>

