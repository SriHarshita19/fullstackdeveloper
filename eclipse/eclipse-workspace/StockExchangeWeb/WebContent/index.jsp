<%@ include file="header.jsp" %>
<body>
<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" scope="page"></jsp:useBean>

<jsp:setProperty property="username" name="user" value="admin007"/>
<jsp:setProperty property="password" name="user" value="admin#123"/>

<jsp:setProperty property="*" name="user"/>

<hr>
User details are:<br>
<jsp:getProperty property="username" name="user"/>
<jsp:getProperty property="password" name="user"/>
</body>
</html>