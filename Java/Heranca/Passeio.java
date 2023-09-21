// Victor Gabriel Lucio | RA: a2575302
public final class Passeio extends Veiculo implements Calc {
	private int qtdPassageiro;

    // Construtores
    public Passeio() {
        // From Passeio
        qtdPassageiro = 0;
        
        // From Veiculo
        setMarca("");
        setModelo("");
        setCor("");
        setPlaca("");
        setQtdRodas(4);
        setVelocMax(50);

        // From motor
        getMotor().setQtdPistoes(0);
        getMotor().setPotencia(0);
    }
	
	// Getters
	public int getQtdPassageiro() {
		return qtdPassageiro;
	}

	// Setters
	public void setQtdPassageiro(int qtdPassageiro) {
		this.qtdPassageiro = qtdPassageiro;
	} 

    // Veiculo superscript
    public int calcVel() {
        int vel = getVelocMax() * 1000;
        return vel;
    }

    // Interface
    public int calcular() {
        String letras = getMarca() + getModelo() + getCor() + getPlaca();
        int qtdLetras = letras.replaceAll("\\s", "").length();
        return qtdLetras;
    }
}
