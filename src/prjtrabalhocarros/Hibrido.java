package prjtrabalhocarros;

public class Hibrido extends Veiculo implements Jato, Helicoptero, Lancha, Automovel {

    public int etapaAtual;

    public int getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(int etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public Hibrido() {
        super();
        this.etapaAtual = 0;
    }

    public Hibrido(String prop, String nomeVei, String fabri, String combus, String cor, int anofab) {
        super(prop, nomeVei, fabri, combus, cor, anofab);
        this.etapaAtual = 0;
    }

    //veículo    
    @Override
    public void ligar() {
        System.out.println("Veículo está ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Veículo está desligando...");
    }

    @Override
    public void iniciarMovimento() {
        System.out.println("Veículo está iniciando movimento...");
    }

    @Override
    public void pararMovimento() {
        System.out.println("Veículo está parando...");
    }

    @Override
    public void virarParaDireita() {
        System.out.println("Veículo está virando à direita...");
    }

    @Override
    public void virarParaEsquerda() {
        System.out.println("Veículo está virando à esquerda...");
    }

    ///jato
    @Override
    public void aterrissarComoJato() {
        System.out.println("Jato está aterrisando...");
        this.etapaAtual = 1;
    }

    @Override
    public void voarComoJato() {
        System.out.println("Jato está voando...");
        this.etapaAtual = 1;
    }

    @Override
    public void trocarMarchaComoJato() {
        System.out.println("Jato está trocando a marcha...");
        this.etapaAtual = 1;
    }

    @Override
    public void acionarAsas() {
        System.out.println("Jato está acionando as asas...");
        this.etapaAtual = 1;
    }

    @Override
    public void recolherAsas() {
        System.out.println("Jato está recolhendo as asas...");
        this.etapaAtual = 1;
    }

    @Override
    public void mostrarDadosJato() {
        if (etapaAtual == 1) {
            System.out.println("Etapa Atual: JATO");
        }

    }

    @Override
    public void decolar() {
        System.out.println("Jato está decolando...");
        this.etapaAtual = 1;
    }

    ////helicóptero
    @Override
    public void voarComoHelicoptero() {
        System.out.println("Helicóptero está voando...");
        this.etapaAtual = 3;
    }

    @Override
    public void aterrissarComoHelicoptero() {
        System.out.println("Helicóptero está aterrissando...");
        this.etapaAtual = 3;
    }

    @Override
    public void trocarMarchaComoHelicoptero() {
        System.out.println("Helicóptero está trocando de marcha...");
        this.etapaAtual = 3;
    }

    @Override
    public void acionarHelices() {
        System.out.println("Helicóptero está acionando as helices...");
        this.etapaAtual = 3;
    }

    @Override
    public void recolherHelices() {
        System.out.println("Helicóptero está recolhendo as helices...");
        this.etapaAtual = 3;
    }

    @Override
    public void deslocar() {
        System.out.println("Helicóptero está se deslocando...");
        this.etapaAtual = 3;
    }

    @Override
    public void mostrarDadosHelicoptero() {
        if (etapaAtual == 3) {
            System.out.println("Etapa Atual: HELICOPTERO");
        }
    }

    ////lancha
    @Override
    public void navegar() {
        System.out.println("Lancha está navegando...");
        this.etapaAtual = 2;
    }

    @Override
    public void lancarAncora() {
        System.out.println("Lancha está levantando âncora...");
        this.etapaAtual = 2;
    }

    @Override
    public void recolherAncora() {
        System.out.println("Lancha está recolhendo âncora...");
        this.etapaAtual = 2;
    }

    @Override
    public void trocarMarchaComoLancha() {
        System.out.println("Lancha está trocando de marcha...");
        this.etapaAtual = 2;
    }

    @Override
    public void acionarCarcaca() {
        System.out.println("Lancha está acionando carcaça...");
        this.etapaAtual = 2;
    }

    @Override
    public void recolherCarcaca() {
        System.out.println("Lancha está recolhendo carcaça...");
        this.etapaAtual = 2;
    }

    @Override
    public void andarParaTrasComoLancha() {
        System.out.println("Lancha está andando para trás...");
        this.etapaAtual = 2;
    }

    @Override
    public void mostrarDadosLancha() {
        if (etapaAtual == 2) {
            System.out.println("Etapa Atual: LANCHA");
        }
    }

    ////automóvel
    @Override
    public void trocarMarchaComoAuto() {
        System.out.println("Automóvel está trocando de marcha...");
        this.etapaAtual = 0;
    }

    @Override
    public void trocarPneu() {
        System.out.println("Automóvel está trocando de pneu...");
        this.etapaAtual = 0;
    }

    @Override
    public void andarParaTrasComoAuto() {
        System.out.println("Automóvel está andando para trás...");
        this.etapaAtual = 0;
    }

    @Override
    public void mostrarDadosAuto() {
        if (etapaAtual == 0) {
            System.out.println("Etapa Atual: AUTOMOVEL");
        }
    }
    
    public void mostrarVeiculoAtual() {
        if (this.etapaAtual == 0) {
            System.out.println("Veículo atual: Automóvel!");
        }

        if (this.etapaAtual == 1) {
            System.out.println("Veículo atual: Jato!");
        }

        if (this.etapaAtual == 2) {
            System.out.println("Veículo atual: Lancha!");
        }

        if (this.etapaAtual == 3) {
            System.out.println("Veículo atual: Helicóptero!");
        }
    }
}
