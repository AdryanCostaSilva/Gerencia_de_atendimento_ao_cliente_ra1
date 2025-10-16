public class Pilha {
    private NodeSolicitacao topo;

    public Pilha(){
        this.topo = null;
    }

    public void inserirSolicitacao(ElementoSolicitacao elemento){
       NodeSolicitacao novo = new NodeSolicitacao();
       novo.setInformation(elemento);
       novo.setNextNode(this.topo);
       topo = novo;
       System.out.println("Solicitação: " + elemento.getDescricao() + " -> adicionado!");
    }

    public void removerSolicitacao(){
        if (vazia()){
            System.out.println("Nenhuma solicitação na pilha!");
            return;
        }

        System.out.println("Solicitação " + topo.getInformation().getDescricao() + " removida!" );

        topo = topo.getNextNode();
    }

    public void imprimirSolicitacoes(){
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
