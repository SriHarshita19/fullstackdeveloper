<%@include file="header.jsp" %>
<c:out value="Hello World"/>
<br>
<c:set var="name" value="Harshita"/>
Name:<c:out value="${name}"/>
<c:remove var="name"/>
<br/>
Name:<c:out value="${name}"/>
<c:forEach var="i" begin="1" end="6" step="1">

</c:forEach>
Loop: <br/>
<c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach>
Loop with Arrays: <br/>
<c:forEach var="i" items="1,2,44,5,66">
<h2>${i}</h2>
</c:forEach>
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>
<c:set value="10" var="num"></c:set>
  <c:choose>
  <c:when test="${num%2==0}">
  <c:out value="${num} is even number"></c:out>  
</c:when>  
<c:otherwise>  
<c:out value="${num} is odd number"></c:out>  
</c:otherwise>  
</c:choose>  
</body>
</html>

