// Victor Gabriel Lucio | RA: a2575302
public class TstVeic {

    public static void main(String[] args) {
        
        Passeio p1 = new Passeio();
        Carga c1 = new Carga();
        Leitura l = new Leitura();

        // Passeio
        System.out.println("\nInfo Passeio ----");
        p1.setPlaca(l.entDados("Placa: "));
        p1.setMarca(l.entDados("Marca: "));
        p1.setModelo(l.entDados("Modelo: "));
        p1.setCor(l.entDados("Cor: "));
        p1.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas: ")));
        p1.setVelocMax(Integer.parseInt(l.entDados("Velocidade maxima: ")));
        p1.setDataCadastro();

        // Carga
        System.out.println("\nInfo Carga ----");
        c1.setPlaca(l.entDados("Placa: "));
        c1.setMarca(l.entDados("Marca: "));
        c1.setModelo(l.entDados("Modelo: "));
        c1.setCor(l.entDados("Cor: "));
        c1.setTara(Integer.parseInt(l.entDados("Tara: ")));
        c1.setCargaMax(Integer.parseInt(l.entDados("Carga maxima: ")));
        c1.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas: ")));
        c1.setVelocMax(Integer.parseInt(l.entDados("Velocidade maxima: ")));
        c1.setDataCadastro();

        // Impressao dos dados
        System.out.println("\nPasseio ----");
        System.out.println("Velocidade: " + p1.calcVel() + " M/h");
        System.out.println("Quantidade de letras: " + p1.calcular());
        System.out.println("Data de cadastro:" + p1.getDataCadastro());

        System.out.println("\nCarga ----");
        System.out.println("Velocidade: " + c1.calcVel() + " CM/h");
        System.out.println("Soma dos valores: " + c1.calcular());
        System.out.println("Data de cadastro: " + c1.getDataCadastro());
    }
}
