package fr.eni.projet.projetServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projet.BusinessException;
import fr.eni.projet.BLL.UtilisateurManager;
import fr.eni.projet.BO.Utilisateur;
import fr.eni.projet.messages.LecteurMessage;

/**
 * 
 * @author  RobinFerre
 * 
 */

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

// RECUPERATION DES COOKIKES DE MDP ET D'ID
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("id"))
					request.setAttribute("cookieId", cookie.getValue());
				if (cookie.getName().equals("mdp"))
					request.setAttribute("cookieMdp", cookie.getValue());
			}
		}
		
		RequestDispatcher rd = null;		
		rd = request.getRequestDispatcher("WEB-INF/jsp/Connexion/ConnexionCompte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String identifiantC = request.getParameter("identifiantC");
		String passwordC = request.getParameter("passwordC");

		RequestDispatcher rd;
		
		if (request.getParameter("checkSouvenir") != null) {
			Cookie[] cookies = request.getCookies();
			int i = 0;
			// 	cookies non remplacés par les nouveau si deja existants
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("id")) {
					cookie.setValue(identifiantC);
					response.addCookie(cookie);
					i++;
				}
				if (cookie.getName().equals("mdp")) {
					cookie.setValue(passwordC);
					response.addCookie(cookie);
					i++;
				}
			}
			// 	CREATION DE COOKIES SI INEXISTANTS
			if(i != 2) {
				Cookie cookie = new Cookie("id", identifiantC);
				cookie.setMaxAge(60 * 60 * 24 * 30);
				response.addCookie(cookie);
				cookie = new Cookie("mdp", passwordC);
				cookie.setMaxAge(60 * 60 * 24 * 30);
				response.addCookie(cookie);
			}
		}
		try{
			UtilisateurManager um = UtilisateurManager.getInstance();
			Utilisateur user = um.connexion(identifiantC, passwordC);

			HttpSession sessionUser = request.getSession();
			sessionUser.setAttribute("utilisateur", user);
			rd = request.getRequestDispatcher("AccueilServlet");
			rd.forward(request, response);

		} catch (BusinessException e) {
			StringBuffer sb = new StringBuffer();
			sb.append("Une ou plusieurs erreurs se sont produites :");
			for(int i : e.getListeCodesErreur())
				sb.append("\n").append("CODE ").append(i).append(" - ").append(LecteurMessage.getMessageErreur(i));
			
			System.err.println(sb.toString());
			
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("WEB-INF/jsp/Connexion/ConnexionCompte.jsp").include(request, response);
			out.print(sb.toString());
		}
	}
}











