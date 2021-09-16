package excecoes;

public class DisciplinaInvalidaException extends RuntimeException {
	
	private String Titulo;
	private String Detalhes;
	
	public DisciplinaInvalidaException(String titulo, String detalhes) {
		super();
		Titulo = titulo;
		Detalhes = detalhes;
	}
	public String getTitulo() {
		return Titulo;
	}
	
	public String getDetalhes() {
		return Detalhes;
	}

}
