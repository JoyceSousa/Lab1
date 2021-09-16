package excecoes;

public class DisciplinaJaExisteException  extends RuntimeException{
	private String titulo;
	private String detalhes;
	
	public DisciplinaJaExisteException(String titulo, String detalhes) {
		super();
		this.titulo = titulo;
		this.detalhes = detalhes;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDetalhes() {
		return detalhes;
	}

}
