package service;

import java.util.ArrayList;

import dao.ComentarioDao;
import model.Comentario;

public class ComentarioService {
	private ComentarioDao comentarioDAO;

	public ComentarioService() {
		super();
		this.comentarioDAO = new ComentarioDao();
	}
	
	public void cadastrar(Comentario c){
		this.comentarioDAO.cadastrar(c);
	}
	
	public void alterar(Comentario c){
		this.comentarioDAO.alterar(c);
	}
	
	public void excluir(Comentario c){
		this.comentarioDAO.excluir(c);
	}
	
	public Comentario consultar(int id){
		return this.comentarioDAO.consultar(id);
	}
	
	public ArrayList<Comentario> listarComentario(int idNoticia){
		return this.comentarioDAO.listarComentario(idNoticia);
	}
}
