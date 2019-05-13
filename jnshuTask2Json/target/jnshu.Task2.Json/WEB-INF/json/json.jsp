<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/5/11
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>>
<json:object>
    <%--@elvariable id="studentList" type="java.util.List"--%>
    <json:array name="jsonArray" var="student" items="${ob}">
        <json:object>
            <json:property name="id" value="${student.id}"></json:property>
            <json:property name="name" value="${student.name}"></json:property>
            <json:property name="qq" value="${student.qq}"></json:property>
            <json:property name="type" value="${student.type}"></json:property>
            <json:property name="start_time" value="${student.start_time}"></json:property>
            <json:property name="school" value="${student.school}"></json:property>
            <json:property name="student_id" value="${student.student_id}"></json:property>
            <json:property name="link" value="${student.link}"></json:property>
            <json:property name="wish" value="${student.wish}"></json:property>
            <json:property name="bro" value="${student.bro}"></json:property>
            <json:property name="way" value="${student.way}"></json:property>
            <json:property name="create_time" value="${student.create_time}"></json:property>
            <json:property name="update_time" value="${student.update_time}"></json:property>
        </json:object>
    </json:array>
</json:object>
