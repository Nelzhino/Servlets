package co.com.pruebas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletsDemoImpl
 */
@WebServlet(description = "Demo sobre la creacion de servlets.", urlPatterns = { "/RegistroUsuario" })
public class ServletsDemoImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletsDemoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><body>");
		printWriter.println("<h1>Se registro el siguiente usuario</h1>");
		printWriter.println(String.format("Nombre: %s %s", request.getParameter("nombre"), "<br/>"));
		printWriter.println(String.format("Apellidos: %s %s", request.getParameter("apellidos"), "<br/>"));
		printWriter.println(String.format("Salario: %d", Integer.parseInt(request.getParameter("salario"))));
		printWriter.println(String.format("<h6>La fecha y hora son: %s", new Date()));
		printWriter.print("</body></html>");
	}

}
