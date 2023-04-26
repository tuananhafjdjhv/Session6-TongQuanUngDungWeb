

<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 26/04/2023
  Time: 8:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách công việc </h1>
<form action="/TodoServlet" method="post">
    <input type="text" name="task" placeholder="new task..."/>
    <input type="submit" name="action" value="Add"/>
</form>
<table>
    <thead>
        <tr>
            <th>STT</th>
            <th>Task</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1</td>
            <td>di hoc</td>
            <td><button>delete</button></td>
            <td><button>update</button></td>
        </tr>
    </tbody>
</table>
</body>
</html>
