package CompiladorAuto;

public class InfoVariavel {
    private String tipo;
    private String escopo;
    
    
	public InfoVariavel(String tipo, String escopo) {
		super();
		this.tipo = tipo;
		this.escopo = escopo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEscopo() {
		return escopo;
	}


	public void setEscopo(String escopo) {
		this.escopo = escopo;
	}

	
    
}
