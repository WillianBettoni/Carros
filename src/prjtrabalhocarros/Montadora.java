package prjtrabalhocarros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Montadora {

    String nome;
    boolean vazio;
    ArrayList<Veiculo> listaVeiculo = new ArrayList();

    public void adicionarVeiculos(Veiculo v) {
        listaVeiculo.add(v);
    }
    
    public void mostrarDadosVeiculos(){
        vazio = true;
        for(int i=0; i<this.listaVeiculo.size(); i++){
            this.listaVeiculo.get(i).mostrarDados();
            System.out.println("**************");
            vazio = false;
        }
    }
    
    public Veiculo consultarVeiculo(String nomeVei, String prop){
        for(int i=0;i<this.listaVeiculo.size();i++){                       
            if(this.listaVeiculo.get(i).getNomeVeiculo().equals(nomeVei) && this.listaVeiculo.get(i).getProprietario().equals(prop)){
                return this.listaVeiculo.get(i);
            }            
        }
        return null;
    }

    public void exportarCarrosHibridos() throws FileNotFoundException, IOException {

        String linha = null;
        FileWriter f = new FileWriter("C:/Users/willi/carros.txt");
        PrintWriter pw = new PrintWriter(f);
        for (int i = 0; i < listaVeiculo.size(); i++) {
            linha = String.format("%s:%s:%s:%s:%s:%d", listaVeiculo.get(i).getProprietario(), listaVeiculo.get(i).getNomeVeiculo(),
                    listaVeiculo.get(i).getFabricante(), listaVeiculo.get(i).getCor(), listaVeiculo.get(i).getCombustivel(),
                    listaVeiculo.get(i).getAnoFabricacao());
            pw.println(linha);

        }
        pw.close();
    }
    
    public void importarCarrosHibridos() throws FileNotFoundException, IOException{
        FileReader f = new FileReader("C:/Users/willi/carros.txt");
        BufferedReader br = new BufferedReader(f);
        String[] listaEntrada = null;
        String linha = br.readLine();
        
        while(linha!=null){
            listaEntrada = linha.split(":");
            String Proprietario = listaEntrada[0];
            String nomeVeiculo = listaEntrada[1];
            String Fabricante = listaEntrada[2];
            String Cor = listaEntrada[3];
            String Combustivel = listaEntrada[4];
            int AnoFabricacao = Integer.parseInt(listaEntrada[5]);
            Hibrido hibrido = new Hibrido(Proprietario, nomeVeiculo, Fabricante, Cor, Combustivel, AnoFabricacao);
            this.adicionarVeiculos(hibrido);
            linha = br.readLine();
        }
        br.close();
        
    }
}
