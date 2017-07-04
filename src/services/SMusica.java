package services;


import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.*;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import model.Musica;

public class SMusica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		if (req.getParameter("acao").equals("addMusica")) {
			//addMusica(req, res);
			return "/add.jsp";
		}
		
		req.setAttribute("musicas", Logica.musicas);
		
		return "/index.jsp";
	}

}
