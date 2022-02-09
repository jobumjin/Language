package step01.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//index.html -> login.html -> LoginValidate.java(forward=dispatcher) -> SuccessView.java로 이동
/* login.html에서 get으로 요청?
 * 
 * 
 */


//http://ip:port/project명/success로 요청하게 되는 url mapping 설정
@WebServlet("/success")
public class SuccessView extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SuccessView doGet()");
		process(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SuccessView doPost()");
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request로 부터 getParameter("id")값을 server 콘솔에 출력
		System.out.println(request.getParameter("id"));
		//setAttribute로 저장한 데이터 server 콘솔에 출력
		System.out.println(request.getAttribute("name"));
		
		//? client 브라우저에 안녕하세요 출력
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("안녕하세요");
		
	}
}
