// Victor Gabriel Lucio | RA: a2575302
public class Motor {
	private int qtdPistoes;
	private int potencia;

    // Construtores
    public Motor() {
        qtdPistoes = 0;
        potencia = 0;
    }

	// Getters
	public int getQtdPistoes() {
		return qtdPistoes;
	}

	public int getPotencia() {
		return potencia;
	}

	// Setters
	public void setQtdPistoes(int qtdPistoes) {
		this.qtdPistoes = qtdPistoes;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
