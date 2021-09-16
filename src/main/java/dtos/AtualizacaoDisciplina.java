package dtos;

public class AtualizacaoDisciplina {

	private String atributo;
	private String newValue;
	
	public AtualizacaoDisciplina() {
		super();
	}
	
	public AtualizacaoDisciplina(String atributo, String newValue) {
		super();
		this.atributo = atributo;
		this.newValue = newValue;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNovoValor(String newValue) {
		this.newValue = newValue;
	}
}
