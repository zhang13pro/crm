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
  <title>CRM��ҳ V2.0</title>
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
  <h1>��ϰ����ѧԱCRMϵͳ</h1>
  <div class="showdate">
    <img src="images/calendar.gif"/>
    <span id="dt">2019��3��4�� ����һ</span>
  </div>
  <div class="showTitle">
    <span class="show1"> ��ӭ�㣺�ܿ� </span>
    <span>
         <img src="images/pwd.gif"/>
         <a href="���Ŀ���.html" target="mainframe">���Ŀ���</a>
       </span>
    <span>
         <img src="images/login.gif"/>
         <a href="login.html">���µ�¼</a>
       </span>
  </div>
</div>

<div id="left">
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu1')">������Դ����</a>
    <ul id="menu1" style="display:none">
      <li>
        <a href="deplist.jsp" target="mainframe">���Ź���</a>
      </li>
      <li>
        <a href="ְ�����.html" target="mainframe">ְ�����</a>
      </li>
      <li>
        <a href="Ա������.html" target="mainframe">Ա������</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu2')">��ѧ����</a>
    <ul id="menu2" style="display:none">
      <li>
        <a href="�༶����.html" target="mainframe">�༶����</a>
      </li>
      <li>
        <a href="�γ̹���.html" target="mainframe">�γ̹���</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu3')">ѧ������</a>
    <ul id="menu3" style="display:none">
      <li>
        <a href="��У������.html" target="mainframe">��У������</a>
      </li>
      <li>
        <a href="����ת��.html" target="mainframe">ѧ������ת��</a>
      </li>
      <li>
        <a href="��ʧ����.html" target="mainframe">ѧ����ʧ����</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu4')">��ѯ����</a>
    <ul id="menu4" style="display:none">
      <li>
        <a href="��ѯ����.html" target="mainframe">��ѯѧ������</a>
      </li>
      <li>
        <a href="��������.html" target="mainframe">ѧ����������</a>
      </li>
    </ul>
  </div>
  <div class="showMenu">
    <img src="images/folder.gif"/>
    <a href="javascript:void(0)" onClick="showMenu('menu5')">��ҵ����</a>
    <ul id="menu5" style="display:none">
      <li>
        <a href="��ҵ���.html" target="mainframe">ѧ����ҵ���</a>
      </li>
      <li>
        <a href="��ҵ����.html" target="mainframe">ѧ����ҵ����</a>
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

