
public class Tarefa {
    private int ID;
    private String titulo;
    private String descricao;
    private int dataVencimento;
    private Status status;


    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status concluida) {
        this.status = concluida;
    }

    
}
