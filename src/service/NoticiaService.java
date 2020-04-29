package service;

import java.util.ArrayList;

import dao.NoticiaDao;
import model.Noticia;

public class NoticiaService {
	private NoticiaDao noticiaDAO;

	public NoticiaService() {
		super();
		this.noticiaDAO = new NoticiaDao();
	}
	
	public void cadastrar(Noticia n){
		this.noticiaDAO.cadastrar(n);
	}
	
	public void alterar(Noticia n){
		this.noticiaDAO.alterar(n);
	}
	
	public void excluir(int id){
		this.noticiaDAO.excluir(id);
	}
	
	public Noticia consultar(int id){
		return this.noticiaDAO.consultar(id);
	}
	
	public ArrayList<Noticia> listarNoticias(){
		return this.noticiaDAO.listarNoticias();
	}
	
}
