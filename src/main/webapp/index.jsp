<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style type="text/css">
        table,th,tr,td{
            border: 1px black solid;
            border-collapse: collapse;
            align-content: center;
        }
    </style>
    <script type="text/javascript">

        function getAllStudent() {
            var selectAllStudent = document.getElementById("selectAllStudent");
            selectAllStudent.setAttribute("action","${pageContext.request.contextPath}/getAllStudent");
            selectAllStudent.submit();
        }
        function addAStudent() {
            var addAStudent = document.getElementById("addAStudent");
            addAStudent.setAttribute("action","${pageContext.request.contextPath}/addAStudent");
            addAStudent.submit();
        }
        function deleteAStudent(sid) {
            var deleteAStudent = document.getElementById("deleteAStudent");
            deleteAStudent.setAttribute("action","${pageContext.request.contextPath}/removeAStudentBySid/"+sid);
            deleteAStudent.submit();
        }
    </script>
</head>
<body>
<form method="post" id="selectAllStudent">
    <input type="hidden" name="_method" value="get">
</form>
<a href="javascript:void(0)" onclick="getAllStudent()">查询所有</a>
<hr>
<form method="post" id="addAStudent">
    <input type="hidden" name="_method" value="post">
    sid:<input type="text" name="sid">
    sname:<input type="text" name="sname">
    ssex:<input type="text" name="ssex">
    sage:<input type="text" name="sage">
</form>
<a href="javaScript:void(0)" onclick="addAStudent()">添加学生</a>
<hr>
<form method="post" id="deleteAStudent">
    <input type="hidden" name="_method" value="delete">
</form>

<table>
    <thead>
    <tr>
        <td>sid</td>
        <td>sname</td>
        <td>ssex</td>
        <td>sage</td>
        <td rowspan="2">operation</td>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${allStudent}">
        <tr>
            <td>${student.sid}</td>
            <td>${student.sname}</td>
            <td>${student.sage}</td>
            <td>${student.ssex}</td>
            <td><a href="javascript:void(0)" onclick="deleteAStudent('${student.sid}')">删除</a></td>
            <td><a href="" onclick=""></a>修改</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
