package heranca_polimorfismo;

public class Notebook extends Produto {

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco,double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco() {
        return "armazenamento=" + armazenamento + ", GPU=" + gpu + ", processador=" + processador;

    }

    // getters e setters

    public double getArmazenamento() {
        return armazenamento;
    }

    public String getGPU() {
        return gpu;
    }

    public String getProcessador() {
        return processador;
    }
    
}
