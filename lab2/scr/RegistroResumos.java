import java.util.ArrayList;
public class RegistroResumos {
    
    private int numeroDeResumos;
    private int cont = 0;
    private ArrayList<Resumo> resumos;
    
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new ArrayList(this.numeroDeResumos = numeroDeResumos);
    }

    public void adiciona(String tema, String resumo) {
        this.resumos.add(cont++, new Resumo(tema, resumo));
        if (cont > numeroDeResumos) {cont = 0;}
    }
    public String[] pegaResumos() {
        String[] array = new String[this.cont];
        for (int i = 0; i < this.resumos.size(); i++) {
            array[i] = resumos.get(i).toString();
        }
        return array;
    }
    public String imprimeResumos() {
        String saida = "- " + this.cont + " resumo(s) cadastrado(s)" + "\n";
        for (Resumo resumo: resumos) {
            saida += resumo.getTema() + " | ";
        }
        return saida;
    }
    public int conta() {
        return this.resumos.size();
    }
    public boolean temResumo(String tema) {
        return meuContais(tema);
    }
    private boolean meuContais(String tema) {
        for (Resumo resumo: resumos) {
            if (resumo.getTema().equals(tema)) {return true;}
        } return false;
    }

}
