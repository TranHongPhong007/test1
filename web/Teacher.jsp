<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sách Giáo Viên</title>
    <style>
        /* Sử dụng font chữ dễ đọc */
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap');

        body {
            font-family: 'Poppins', Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        /* Header */
        .header {
            width: 100%;
            background: #007bff;
            color: white;
            text-align: center;
            padding: 15px;
            font-size: 20px;
            font-weight: bold;
            box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: #333;
            text-align: center;
            margin-top: 20px;
        }

        /* Bảng danh sách giáo viên */
        table {
            width: 80%;
            border-collapse: collapse;
            background: white;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }

        th, td {
            padding: 12px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #007bff;
            color: white;
            font-weight: bold;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:nth-child(odd) {
            background-color: #ffffff;
        }

        /* Responsive */
        @media screen and (max-width: 768px) {
            table {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <!-- Phần Header hiển thị thông tin -->
    <div class="header">
        Name: Tran Hong Phong - ID: DE180299
    </div>

    <h2>📚 Danh Sách Giáo Viên 📚</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Điện Thoại</th>
        </tr>
        <c:forEach var="teacher" items="${teachers}">
            <tr>
                <td>${teacher.teacherID}</td>
                <td>${teacher.name}</td>
                <td>${teacher.dob}</td>
                <td>${teacher.tel}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
