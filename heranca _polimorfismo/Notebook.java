package heranca _polimorfismo;

public class Notebook {

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco,double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    public String etiquetapreco() {
        return "Notebook[armazenamento=" + armazenamento + ", gpu=" + gpu + ", processador=" + processador + "]";

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
