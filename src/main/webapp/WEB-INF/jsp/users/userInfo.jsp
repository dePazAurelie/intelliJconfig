<%--
  Created by IntelliJ IDEA.
  User: Aurélie de Paz
  Date: 20/09/2017
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType = "text/html;charset = UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/fragments/header.jsp" />
    <title>Your profile</title>
</head>

<body>
    <div class="parallax-container">
        <div class="parallax">
            <img src="/resources/core/image/beer.jpg">
        </div>
    </div>
    <div class="section white container">
        <h2>Your beer lover profile</h2>
        <table>
            <tr>
                <td>Name :</td>
                <td><c:out value="${name}" /></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><c:out value="${password}" /></td>
            </tr>
            <tr>
                <td>E-mail :</td>
                <td><c:out value="${email}" /></td>
            </tr>
            <tr>
                <td>You are :</td>
                <td><c:out value="${gender}" /></td>
            </tr>
            <tr>
                <td>You like :</td>
                <td><c:out value="${beer}" /></td>
            </tr>
        </table>
    </div>

    <footer class = "valign-wrapper">
        <div class="container">
            <a href="<c:url value='/' />">Back Home</a>
        </div>
        <jsp:include page="/WEB-INF/jsp/fragments/footer.jsp" />
    </footer>
    <div class="parallax-container">
        <div class="parallax">
            <img src="/resources/core/image/beer.jpg">
        </div>
    </div>
</body>

</html>
