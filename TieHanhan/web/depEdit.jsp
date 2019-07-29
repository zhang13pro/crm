<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/25
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>部门编辑</title>
    <link href="css/add.css" type="text/css" rel="stylesheet"/>
</head>

<body>

<div id="topMenu">
    <span class="tip">[部门编辑]</span>
    <button class="btn add" onClick="history.go(-1)"/>
    <button class="btn" onClick="formSumit()"/>
</div>
<div id="addFrom">
    <%
        String id = request.getParameter("id");
        String depName = request.getParameter("depName");
    %>
    <form id="formId" action="/depUpdate.do" method="post" >
        <table width="400px" border="0" cellspacing="0" cellpadding="0">
        <input type="hidden" name="depId" value="<%=id%>"/>
            <tr>
                <td width="80px">部门名:</td>
                <td>
                    <input id="depId" name="depName" onBlur="depBlur()"  value="<%=depName%>"/>
                    <span id="depTip"></span>
                </td>
            </tr>


        </table>
    </form>
</div>
<script type="text/javascript">
    function formSumit(){
        var formObj=document.getElementById("formId");
        if(depBlur()){
            formObj.submit();//手动提交表单
            return true;
        }
        return false;
    }
    function depBlur(){
        var lid= document.getElementById("depId");
        var ltp= document.getElementById("depTip");
        if(lid.value ==""){
            ltp.innerHTML="请输入部门名！！";
            return false;
        }else{
            ltp.innerHTML="<em style='color:green'>√</em>";
        }
        return true;
    }
</script>
</body>
</html>

