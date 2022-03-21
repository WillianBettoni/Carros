package prjtrabalhocarros;

public abstract class Veiculo {
    protected String proprietario;
    protected String nomeVeiculo;
    protected String fabricante;
    protected String combustivel;
    protected String cor;
    protected int anoFabricacao;
    
    public Veiculo(){};
    
    public Veiculo(String prop, String nomeVei, String fabri, String combus, String cor, int anofab){
        this.anoFabricacao = anofab;
        this.combustivel = combus;
        this.cor = cor;
        this.fabricante = fabri;
        this.nomeVeiculo = nomeVei;
        this.proprietario = prop;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    public abstract void ligar(); //override
    public abstract void desligar(); //override
    public abstract void iniciarMovimento(); //override
    public abstract void pararMovimento(); //override
    public abstract void virarParaDireita(); //override
    public abstract void virarParaEsquerda(); //override
    
    public void mostrarDados(){
        System.out.println("Proprietário: " + this.getProprietario());
        System.out.println("Nome veículo: " + this.getNomeVeiculo());
        System.out.println("Combustível: " + this.getCombustivel());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano Fabricação: " + this.getAnoFabricacao());
        System.out.println("Fabricante: " + this.getFabricante());        
    }
    
    
    
    
    
    
}
