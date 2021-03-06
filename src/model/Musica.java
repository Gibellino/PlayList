package model;

public class Musica {

	private int musica_id, musica_duracao, album_id,
					musica_visualizacao, autor_id;
	private String musica_nome,	musica_path, musica_ano;

	/*public Musica(int musica_id, int musica_duracao, int album_id, int musica_visualizacao, int autor_id,
			String musica_nome, String musica_path_absoluto, String musica_ano, String musica_path_relativo) {
		this.musica_id = musica_id;
		this.musica_duracao = musica_duracao;
		this.album_id = album_id;
		this.musica_visualizacao = musica_visualizacao;
		this.autor_id = autor_id;
		this.musica_nome = musica_nome;
		this.musica_path_absoluto = musica_path_absoluto;
		this.musica_ano = musica_ano;
		this.musica_path_relativo = musica_path_relativo;
	}*/
	
	public Musica(int musica_id, String musica_nome, String musica_path, String musica_ano) {
		this.musica_id = musica_id;
		this.musica_nome = musica_nome;
		this.musica_path = musica_path;
		this.musica_ano = musica_ano;
	}

	public int getMusica_id() {
		return musica_id;
	}

	public void setMusica_id(int musica_id) {
		this.musica_id = musica_id;
	}

	public int getMusica_duracao() {
		return musica_duracao;
	}

	public void setMusica_duracao(int musica_duracao) {
		this.musica_duracao = musica_duracao;
	}

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public int getMusica_visualizacao() {
		return musica_visualizacao;
	}

	public void setMusica_visualizacao(int musica_visualizacao) {
		this.musica_visualizacao = musica_visualizacao;
	}

	public int getAutor_id() {
		return autor_id;
	}

	public void setAutor_id(int autor_id) {
		this.autor_id = autor_id;
	}

	public String getMusica_nome() {
		return musica_nome;
	}

	public void setMusica_nome(String musica_nome) {
		this.musica_nome = musica_nome;
	}
	
	public String getMusica_path() {
		return musica_path;
	}

	public void setMusica_path(String musica_path) {
		this.musica_path = musica_path;
	}

	public String getMusica_ano() {
		return musica_ano;
	}

	public void setMusica_ano(String musica_ano) {
		this.musica_ano = musica_ano;
	}

}
