<%--<%@ page contentType="text/html;charset=UTF-8" language="java"%>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>--%>


<%--<html>--%>
<%--<head>--%>

<%--</head>--%>
<%--<body>--%>
<%--<h2><c:if test="locale=en">--%>
<%--    <c:out value="${pageContext.request.locale.language}"/>--%>
<%--    английская--%>
<%--</c:if>--%>
<%--</h2>--%>
<%--<h2>--%>
<%--    <c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />--%>
<%--    <fmt:setLocale value="${language}" />--%>
<%--    русская--%>
<%--</h2>--%>

<%--<table>--%>
<%--    <tr>--%>
<%--        <td>Name</td>--%>
<%--        <td>Brand</td>--%>
<%--        <td>Price</td>--%>
<%--    </tr>--%>
<%--    <c:forEach var="car" items="${cars}">--%>
<%--        <tr>--%>
<%--            <td>${car.brand}</td>--%>
<%--            <td>${car.model}</td>--%>
<%--            <td>${car.price}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--</body>--%>
<%--</html>--%>

<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page isELIgnored="false" %>
<fmt:setLocale value="${param.locale}"/>
<%--<fmt:setLocale value="ru_RU"/>--%>
<fmt:setBundle basename="messages"/>
<fmt:requestEncoding value="UTF-8"/>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cars</title>
</head>
<body>
<h2>
    <fmt:message key="label.cars" />
</h2>
<table>
    <tr>
        <td>Name</td>
        <td>Brand</td>
        <td>Price</td>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.price}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
