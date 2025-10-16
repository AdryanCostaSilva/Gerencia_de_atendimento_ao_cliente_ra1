public class ElementoSolicitacao {
    private String id;
    private String descricao;
    private String dataHora;

    public ElementoSolicitacao(String id, String descricao, String dataHora){
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
