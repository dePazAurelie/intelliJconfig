<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <title>Kreognenberg</title>
        <jsp:include page="/WEB-INF/jsp/fragments/header.jsp" />
    </head>
    <body>
    <div class="parallax-container">
        <div class="parallax">
            <img src="/resources/core/image/beer.jpg">
        </div>
    </div>
    <div class="section white container">
        <h2>Hello Beer Addicts !</h2>
        <form:form method = "POST" action = "/userInfo">
            <table>
                <tr class = "row">
                    <td class = "input-field col s3"><form:label path = "name">Name :</form:label></td>
                    <td class = "input-field col s9"><form:input path = "name" /></td>
                    <td class = "input-field col s3"><form:label path = "password">Password :</form:label></td>
                    <td class = "input-field col s9"><form:input path = "password" type = "password"/></td>
                </tr>
                <tr class = "row">
                    <td class = "input-field col s3"><form:label path = "email">E-mail :</form:label></td>
                    <td class = "input-field col s9"><form:input path = "email" /></td>
                </tr>
            </table>
            <div class="margins">
                <p>
                    Gender :<br>
                </p>
                <form:radiobutton class="radio" path="gender" value="female" label="Female" /><br>
                <form:radiobutton class="radio" path="gender" value="male" label="Male" /><br>
                <form:radiobutton class="radio" path="gender" value="other" label="Other" /><br>
            </div>
            <div class="margins" >
                <p>
                    Which Beer do you prefer ?<br>
                </p>
                <form:select path="beer">
                    <form:option value="" label="Select" />
                    <form:option value="kronenbourg" label="Kronenbourg" />
                    <form:option value="heineken" label="Heineken" />
                    <form:option value="carlsberg" label="Carlsberg" />
                    <form:option value="guinness" label="Guinness" />
                    <form:option value="grimbergen" label="Grimbergen" />
                    <form:option value="1664" label="1664" />
                </form:select>
            </div>
            <div class="margins">
                <input type = "submit" class = "btn" value = "Send"/>
            </div>
        </form:form>
    </div>
    <footer class="valign-wrapper">
        <div class="container">
            <a href="<c:url value='/hi' />">Back Home</a>
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