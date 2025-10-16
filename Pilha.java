public class Pilha {
    private NodeSolicitacao topo;

    public Pilha(){
        this.topo = null;
    }

    public void inserir(ElementoSolicitacao elemento){
       NodeSolicitacao novo = new NodeSolicitacao();
       novo.setInformation(elemento);
       novo.setNextNode(this.topo);
       topo = novo;
    }

    public void remover(){
        if (vazia()){
            return;
        }
        topo = topo.getNextNode();
    }

    public void imprimir(){
        int count = 0;
        NodeSolicitacao atual = topo;
        while (atual != null){
            count++;
            System.out.println("["+ count +"] Solicitação - ID: " + atual.getInformation().getId() + " | Descrição: " + atual.getInformation().getDescricao() + " | Data e Hora: " + atual.getInformation().getDataHora());
            atual = atual.getNextNode();
        }
    }

    public boolean vazia(){
        return topo == null;
    }
}
