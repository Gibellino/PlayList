package services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Musica;



public interface Logica {

	static ArrayList<Musica> musicas = new ArrayList<>();
	
	String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
