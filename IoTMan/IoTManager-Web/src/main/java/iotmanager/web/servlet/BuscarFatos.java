package iotmanager.web.servlet;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;

import iotmanager.servico.FatosServico;

@WebServlet("/fatos")
public class BuscarFatos extends AppController {

	private static final long serialVersionUID = -3792128018549736146L;
	private FatosServico fatos;

	public void init() throws ServletException {
	
		super.init();
		
		if(fatos == null){
			fatos = new FatosServico();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getParameter("action");
		
		if("listar".equals(action)){
			
			request.getSession().setAttribute("listarFatosTudo", fatos.listarTodosFatos());
			response.sendRedirect("logs.jsp");
			
		}
		
	}

}
