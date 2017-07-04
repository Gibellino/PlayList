package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import model.Musica;
import services.Logica;

/**
 * Servlet implementation class HandlerMusica
 */
@WebServlet("/HandlerMusica")
public class HandlerMusica extends HttpServlet {
	
	private final String UPLOAD_DIRECTORY = "C:/Users/TPSI1016/git/PlayList/WebContent/data";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandlerMusica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("musicas", Logica.musicas);

		request.getRequestDispatcher("/index.jsp?pag=musica").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<FileItem> multiparts;
		int duracao = 0;
		
		try {
			multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
			
			File music = null;
			
			for(FileItem item : multiparts){
				if(!item.isFormField()){
					String name = new File(item.getName()).getName();
					music = new File(UPLOAD_DIRECTORY + File.separator + name);
					item.write(music);
				}
			}
			
			//Logica.musicas.add(new Musica(Logica.musicas.size()+1, Integer.parseInt(request.getParameter("duracao")), ));
			Logica.musicas.add(new Musica(Logica.musicas.size()+1,
									request.getParameter("add_musica_nome"), 
										"data/" + music.getName(), 
											request.getParameter("add_musica_ano")));
		} catch (Exception e) {
			request.setAttribute("message", "File Upload Failed due to " + e);
		}
		
		this.doGet(request, response);
	}

}
