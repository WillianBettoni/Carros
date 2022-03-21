package prjtrabalhocarros;

public interface Lancha {
    
    static final String idLancha = null;
    
    public abstract void navegar();
    public abstract void lancarAncora();
    public abstract void recolherAncora();
    public abstract void trocarMarchaComoLancha();
    public abstract void acionarCarcaca();
    public abstract void recolherCarcaca();
    public abstract void andarParaTrasComoLancha();
    public abstract void mostrarDadosLancha();
}
