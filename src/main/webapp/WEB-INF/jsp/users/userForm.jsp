<%--
  Created by IntelliJ IDEA.
  User: Aurélie de Paz
  Date: 20/09/2017
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
    <head>
        <title>Kreognenberg</title>
        <jsp:include page="/WEB-INF/jsp/fragments/header.jsp" />
    </head>
<body class = "container">
    <h2>Hello Beer Addicts !</h2>
    <form:form method = "POST" action = "/V2/userInfo">
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
            <tr>
                <td colspan = "2">
                    <input type = "submit" class = "btn" value = "Send"/>
                </td>
            </tr>
        </table>
        <div class = "row">
            <div class = "input-field col s4">Gender :<br>
                <input type="radio" name="gender" value="female" id="female" /> <label for="female">Female</label><br>
                <input type="radio" name="gender" value="male" id="male" /> <label for="male">Male</label><br>
                <input type="radio" name="gender" value="other" id="other" /> <label for="other">Other</label><br>
            </div>

            <div class="input-field col s4">
                <select name="beer" id="beer">
                    <option value="" disabled selected>Choose your option</option>
                    <option value="kronenbourg">Kronenbourg</option>
                    <option value="heineken">Heineken</option>
                    <option value="carlsberg">Carlsberg</option>
                    <option value="guinness">Guinness</option>
                    <option value="grimbergen">Grimbergen</option>
                    <option value="1664">1664</option>
                </select>
                <label>Beers ?</label>
            </div>

            <div class = "input-field col s4">You are interested in :<br>
                <input type="checkbox" name="buy" id="buy" /> <label for="buy">Buying Beer ?</label><br>
                <input type="checkbox" name="brew" id="brew" /> <label for="brew">Brew Beer ?</label><br>
                <input type="checkbox" name="look" id="look" /> <label for="look">Look around ?</label><br>
            </div>
        </div>
    </form:form>
</body>

</html>

<!--
<form method="POST" action="/userInfo">
<p>
Username : <input type="text" name="inputName"><br>
E-mail : <input type="email" name="inputEmail"><br>
Password : <input type="password" name="inputPassword"><br>
</p>
<p>
Gender :<br>
<input type="radio" name="gender" value="female" id="female" /> <label for="female">Female</label><br>
<input type="radio" name="gender" value="male" id="male" /> <label for="male">Male</label><br>
<input type="radio" name="gender" value="other" id="other" /> <label for="other">Other</label><br>
</p>
<p>
<label for="beer">Beers ?</label><br>
<select name="beer" id="beer">
<option value="kronenbourg">Kronenbourg</option>
<option value="heineken">Heineken</option>
<option value="carlsberg">Carlsberg</option>
<option value="guinness">Guinness</option>
<option value="grimbergen">Grimbergen</option>
<option value="1664">1664</option>
</select>
</p>
<p>
You are interested in :<br>
<input type="checkbox" name="buy" id="buy" /> <label for="buy">Buying Beer ?</label><br>
<input type="checkbox" name="brew" id="brew" /> <label for="brew">Brew Beer ?</label><br>
<input type="checkbox" name="look" id="look" /> <label for="look">Look around ?</label><br>
</p>
<input type="submit" value="Send" />
</form>
-->
