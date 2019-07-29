<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/25
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>部门管理</title>
    <link href="css/list.css" type="text/css" rel="stylesheet"/>
    <style type="text/css">
        #pageSpanId a{
            text-decoration: none;
        }
    </style>
</head>

<body>
<div id="main">
    <div id="topMenu">
        <span class="tip">[部门管理]</span>
        <!-- 添加部门 -->
        <a href="/depAdd.jsp" target="mainframe">
            <img src="images/button/tianjia.gif">
        </a>
    </div>
    <div id="dataArea">
        <img src="images/result.gif"/>
        <table class="dataTable" width="100%" border="1" cellspacing="0" cellpadding="0">
            <tr class="hbg">
                <th>部门ID</th>
                <th>部门名称</th>
                <th>编辑</th>
            </tr>
            <c:if test="${depList == null}">
                <c:redirect url="/depList.do"/>
            </c:if>
            <c:forEach items="${depList}" var="dep">
                <tr>
                    <td>${dep.id}</td>
                    <td>${dep.depName}</td>
                    <td>
                        <a href="depEdit.jsp?id=${dep.id}&depName=${dep.depName}">
                            <img src="images/button/modify.gif"/>
                        </a>
                        <a href="/depDelete.do?id=${dep.id}">
                            <img src="images/button/delete.gif"/>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div id="pageDiv">
    <span id="pageSpanId">当前1页/共2页，总条数6条。<br>
        <a href="">&nbsp;1&nbsp;</a>
        <a href="">&nbsp;2&nbsp;</a>
        <a href="">下一页</a>
        <a href="">尾页</a>
    </span>
            <input type="text" id="pageGoInputId" size="4"><input type="button" onclick="pageGo()" value="go">
        </div>
        <script type="text/javascript">
            function pageGo(){
                var inputValue = document.getElementById('pageGoInputId').value;location.href = 'All?pageSize=5&pageNum=' + inputValue;
            }
        </script>

        </td>
        </tr>
        </tbody>
        </table>
    </div>
</div>
</body>
</html>

