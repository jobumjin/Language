<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import="model.domain.Person, java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>EL : ������ ȭ�鿡 ������ ��� tag</h3>
	- jsp ���Ͽ����� ��밡��(html ���Ͽ��� ��� �Ұ�)

	<table border="1">
	
		<tr><th>non-EL</th><th>EL</th></tr>
		<tr><td>2+3</td><td>${2+3}</td></tr>		
		<tr><td>'a' == 'a'</td><td>${'a' == 'a'}</td></tr>
		<tr><td>'a' != 'a'</td><td>${'a' != 'a'}</td></tr>
		<tr><td> 2 > 3 </td><td>${2 > 3}</td></tr>
	
	
	</table>
	
	<hr size ="5" color = "red">
	
	servlet���� request or session�� ������ setAttribute() �����Ŀ�
	forward �Ǵ� redirect �Ǵ� �ܼ� link�� �̵��Ǿ��� ����,
	java ��ü �����͸� EL tag�� ȭ�鿡 ��� <br>
	
	<% //test ������ ����
		/* �ܼ� ���ڿ� ���� �� Ȱ�� -> DTO -> �迭 -> list -> map */
				
		request.setAttribute("rd1", "rd1---");
		session.setAttribute("sd1", new Person("tester",11));
		
		
		//EL���� �迭�� ArrayList�� ������ ����ϴ� ���� ����
		Person [] all = {new Person("t1",11), new Person("t2",11)};
		session.setAttribute("sd2",all);
		
		//? HashMap - ���ڿ� -> DTO
		
	%>
	<!-- out.println(request.getAttribute("rd1")):  -->
	1. ${requestScope.rd1} <br>
	2. ${sessionScope.sd1.id}-${sessionScope.sd1.age} <br>
	3. ${sessionScope.sd2[0].id }-${sessionScope.sd2[1].id } <br>
	
	
</body>
</html>