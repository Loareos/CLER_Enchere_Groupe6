package fr.eni.projet.projetServlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projet.BO.Utilisateur;
/**
 * 
 * @author Clément
 * 
 */
/**
 * Servlet implementation class VenteArticleServlet
 */
@WebServlet("/VenteArticleServlet")
public class VenteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("WEB-INF/jsp/Vente/VenteArticle.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		 //On récupère les infos de l'user connecté
		HttpSession sessionUser = request.getSession();
		
		//Récupérer les infos de l'annonce : 
		String titre = request.getParameter("titre");
		String photo = request.getParameter("photo");
		String description = request.getParameter("description");
		Integer categorie = Integer.parseInt(request.getParameter("categorie"));
		Integer miseAPrix = Integer.parseInt(request.getParameter("miseAPrix"));
		LocalDateTime DebutEnchere = LocalDateTime.parse(request.getParameter("DebutEnchere"));
		LocalDateTime FinEnchere = LocalDateTime.parse(request.getParameter("FinEnchere"));
		String rueRetrait = request.getParameter("rueRetrait");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");
		

		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("AccueilServlet");
		rd.forward(request, response);
		
		
	}

}
