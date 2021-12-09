package fr.eni.projet.projetServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author  RobinFerre
 * 
 */

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/Connexion/CreationCompte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String identifiantI = request.getParameter("identifiantI");
		String NomI = request.getParameter("NomI");
		String PrenomI = request.getParameter("PrenomI");
		String telI = request.getParameter("telI");
		String emailI = request.getParameter("emailI");
		String passwordI = request.getParameter("passwordI");
		String texteRueI = request.getParameter("RueI");
		String codePostalI = request.getParameter("codePostalI");
		String texteVilleI = request.getParameter("VilleI");
		String passwordConfirmI = request.getParameter("passwordConfirmI");
	}
}
