package servlets;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/livros")
public class Servlets extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String ano = req.getParameter("ano");

		resp.getWriter().printf(
			"Título do Livro: " + titulo + "\n\n"+ "Autor: " + autor + "\n\n" + "Ano de Publicação: " + ano, StandardCharsets.UTF_8);
		}

}