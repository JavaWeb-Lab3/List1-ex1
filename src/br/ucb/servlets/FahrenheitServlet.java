package br.ucb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FahrenheitServlet
 */
@WebServlet("/FahrenheitServlet")
public class FahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String celsiusTempString = request.getParameter("temperature_in_celsius");
		PrintWriter out = response.getWriter();
		try{
			double celsiusTempInteger = ((Double.parseDouble(celsiusTempString)*9)/5) + 32;
			out.println("O resultado: "+ celsiusTempInteger + " F");
		} catch(NumberFormatException nfe){
			out.println("O formato inserido não é adequado para a conversão. Por favor utilize apenas números.");
		}
		
		
		
	}

}
