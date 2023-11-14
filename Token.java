package slr;


class Token {
    private String tipo;
    private String lexema;
    private int linha;
    private int colunaInicial;
    private int colunaFinal;


    public Token(String tipo, String lexema, int linha, int colunaInicial, int colunaFinal) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.colunaInicial = colunaInicial;
        this.colunaFinal = colunaFinal;
    }


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColunaInicial() {
		return colunaInicial;
	}

	public void setColunaInicial(int colunaInicial) {
		this.colunaInicial = colunaInicial;
	}

	public int getColunaFinal() {
		return colunaFinal;
	}

	public void setColunaFinal(int colunaFinal) {
		this.colunaFinal = colunaFinal;
	}
}
