<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <jsp:include page="/WEB-INF/jsp/fragments/header.jsp" />
        <title>Kreognenberg</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <a href="<c:url value='/userForm' />">Access the form</a>
        <jsp:include page="/WEB-INF/jsp/fragments/footer.jsp" />
    </body>
</html>