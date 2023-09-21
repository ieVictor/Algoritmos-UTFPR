// Victor Gabriel Lucio | RA: a2575302
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private int velocMax;

	private Motor motor = new Motor();
	private String dataCadastro;
    private Calendar calendario = new GregorianCalendar();

	// Getters
	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public int getVelocMax() {
		return velocMax;
	}
    
    public Motor getMotor() {
        return motor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

	// Setters
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;

        if(velocMax < 10 || velocMax > 250) {
            System.out.println("\nVelocidade fora dos limites brasileiros!");
            velocMax = 100;
            return;
        }
	}

    public void setDataCadastro() {
       dataCadastro = 
            calendario.get(Calendar.DAY_OF_MONTH) + "/" + 
            calendario.get(Calendar.MONTH) + "/" +
            calendario.get(Calendar.YEAR); 
    }

	// Abstracts
	public abstract int calcVel();
}
