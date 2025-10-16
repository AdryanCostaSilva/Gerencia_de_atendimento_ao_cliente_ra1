public class ElementoCliente {
    private String id;
    private String nome;
    private String motivo;

    public ElementoCliente(String id, String nome, String motivo){
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
