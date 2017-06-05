package br.com.triway.controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.triway.model.Livro;
import br.com.triway.service.CatalogoService;

@ManagedBean(name = "livroBean")
@SessionScoped
public class LivroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String RESULTADO = "Resultado";
	private static final String LIVRO = "Livro";
	private CatalogoService service;
	private Livro livro;
	private List<Livro> livros;
	private String titulo;
	
	@PostConstruct
	private void init(){
		service = new CatalogoService();
	}

	public String pesquisar(){

		livros = service.consultar(titulo);
	
		return RESULTADO;
	}

	public String verLivro(int codigo){
			
		livro = service.verLivro(codigo);
	
		return LIVRO;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}