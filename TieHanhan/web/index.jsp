<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/7/24
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>CRM首页 V2.0</title>
  <link href="css/index.css" type="text/css" rel="stylesheet"/>
  <script type="text/javascript">
      function showMenu(mid){
          var mObj= document.getElementById(mid);
          var md = mObj.style.display;
          if(md=="none"){
              mObj.style.display="block";
          }else{
              mObj.style.display="none";
          }
      }
  </script>
</head>

<body>
<div id="top">
  <h1>传习教育学员CRM系统</h1>
  <div class="showdate">
    <img src="images/calendar.gif"/>
    <span id="dt">2019年3月4日 星期一</span>
  </div>
  <div class="showTitle">
    <span class="show1"> 欢迎你：杰克 </span>
    <span>
         <img src="images/pwd.gif"/>
         <a href="更改口令.html" target="mainframe">更改口令</a>
       </span>
    <span>
         <img src="images/login.gif"/>
         <a href="login.html">重新登录</a>
       </span>
  </div>
</div>

<div id="left">
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu1')">人力资源管理</a>
    <ul id="menu1" style="display:none">
      <li>
        <a href="deplist.jsp" target="mainframe">部门管理</a>
      </li>
      <li>
        <a href="职务管理.html" target="mainframe">职务管理</a>
      </li>
      <li>
        <a href="员工管理.html" target="mainframe">员工管理</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu2')">教学管理</a>
    <ul id="menu2" style="display:none">
      <li>
        <a href="班级管理.html" target="mainframe">班级管理</a>
      </li>
      <li>
        <a href="课程管理.html" target="mainframe">课程管理</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu3')">学工管理</a>
    <ul id="menu3" style="display:none">
      <li>
        <a href="在校生管理.html" target="mainframe">在校生管理</a>
      </li>
      <li>
        <a href="升班转班.html" target="mainframe">学生升班转班</a>
      </li>
      <li>
        <a href="流失管理.html" target="mainframe">学生流失管理</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu4')">咨询管理</a>
    <ul id="menu4" style="display:none">
      <li>
        <a href="咨询管理.html" target="mainframe">咨询学生管理</a>
      </li>
      <li>
        <a href="报名管理.html" target="mainframe">学生报名管理</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu5')">就业管理</a>
    <ul id="menu5" style="display:none">
      <li>
        <a href="就业情况.html" target="mainframe">学生就业情况</a>
      </li>
      <li>
        <a href="就业报表.html" target="mainframe">学生就业报表</a>
      </li>
    </ul>
  </div>

</div>

<div id="main">
  <iframe name="mainframe"
          scrolling="no" src="images/right.jpg" width="100%" height="100%" frameborder="0"/>
</div>
</body>
</html>

