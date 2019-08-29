package com.teste.leonardo;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@Entity
//@Table(name="url")
public class App extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1901343114908422687L;
	String URL_OR, URL_CUT;
	int Id_USR = 1;
	static Encurta u = new Encurta(5, "www.levil.com.br/");
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL_OR =  request.getParameter("Url_OR");
		URL_CUT = App();
		response.sendRedirect("/resultado.jsp");
	}
	private  String App() {
		return u.encurtador(URL_OR);
	}
	App (){
		
	}
	public static void main(String[] args) {
		
		
	       //Session session = HibernateUtil.getSessionFactory().openSession();
	        //session.beginTransaction();

	    
	     
		String urls[] = { "https://duckduckgo.com/", "https://www.google.com/", "http://www.yahoo.com", "www.yahoo.com/", "www.amazon.com", "www.amazon.com/page1.asp", "www.amazon.com/page2.asp", "www.mercadolivre.com.br", "www.facebook.com", "receita.economia.gov.br", "www.techmundo.com", "www.lifehacker.com", "www.bb.com.br" };

		for (int i = 0; i < urls.length; i++) {
			//session.save(u);
			System.out.println("Original:" + urls[i] + " | Encurtado: " + u.encurtador(urls[i]) + " | Refeita: "+ u.refazUrl(u.encurtador(urls[i])));
		}
		//session.getTransaction().commit();
	}

}
