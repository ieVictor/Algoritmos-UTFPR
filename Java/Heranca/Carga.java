// Victor Gabriel Lucio | RA: a2575302
public final class Carga extends Veiculo implements Calc {
    private int tara;
    private int cargaMax;

    // Construtores
    public Carga() {
        // From Carga
        tara = 0;
        cargaMax = 0;

        // From Veiculo
        setPlaca("");
        setMarca("");
        setModelo("");
        setCor("");
        setQtdRodas(6);
        setVelocMax(50);

        // From motor
        getMotor().setQtdPistoes(0);
        getMotor().setPotencia(0);
    }

    // Getters
    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    // Setters
    public void setTara(int tara) {
        this.tara = tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    // Veiculo superscript 
    public int calcVel() {
        int vel = getVelocMax() * 100000;
        return vel;
    }

    // Interface
    public int calcular() {
        int soma = 
            getQtdRodas() + 
            getVelocMax() + 
            getCargaMax() +
            getTara() +
            getMotor().getQtdPistoes() +
            getMotor().getPotencia();

        return soma;
    }
}
