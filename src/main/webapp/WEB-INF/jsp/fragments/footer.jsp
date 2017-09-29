<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.0/js/materialize.min.js"></script>

<spring:url value="/resources/core/js/test.js" var="testJS" />
<script src="${testJS}"></script>