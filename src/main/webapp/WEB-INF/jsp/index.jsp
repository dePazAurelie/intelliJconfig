<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <jsp:include page="/WEB-INF/jsp/fragments/header.jsp" />
        <title>Kreognenberg</title>
    </head>
    <body>
        <div class="parallax-container">
            <div class="parallax">
                <img src="../../resources/core/image/beer.jpg">
            </div>
        </div>
        <div class="section white container">
            <h3>Hello You Beer lover !</h3>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            </p>

            <div>
                <table class="striped">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>E-mail</th>
                            <th>Password</th>
                            <th>Gender</th>
                            <th>Beer you like</th>
                       </tr>
                    </thead>
                    <tbody>
                       <c:forEach items="${users}" var="user">
                            <tr>
                                <td>${user.name}</td>
                                <td>${user.email}</td>
                                <td>${user.password}</td>
                                <td>${user.gender}</td>
                                <td>${user.beer}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <footer class="valign-wrapper">
            <div class="container">
                <a href="<c:url value='/userForm' />">Register a new user ?</a>
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