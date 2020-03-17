<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var="car" items="${cars}">
    <h1>${car}</h1>
</c:forEach>

</body>
</html>
