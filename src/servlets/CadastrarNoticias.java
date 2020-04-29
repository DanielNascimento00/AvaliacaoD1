package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import service.NoticiaService;

@WebServlet("/CadastrarNoticias")
public class CadastrarNoticias extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CadastrarNoticias() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noticia n = new Noticia();
		n.setTitulo(request.getParameter("titulo"));
		n.setTexto(request.getParameter("texto"));
		n.setDescricao(request.getParameter("descricao"));
		
		NoticiaService service = new NoticiaService();
		service.cadastrar(n);
	}
}
