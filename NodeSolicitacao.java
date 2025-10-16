public class NodeSolicitacao {
    private ElementoSolicitacao information;
    private NodeSolicitacao nextNode;

    public NodeSolicitacao(){
        this.information = null;
        this.nextNode = null;
    }

    public void setInformation(ElementoSolicitacao information){
        this.information = information;
    }

    public ElementoSolicitacao getInformation(){
        return information;
    }

    public void setNextNode(NodeSolicitacao nextNode){
        this.nextNode = nextNode;
    }

    public NodeSolicitacao getNextNode(){
        return this.nextNode;
    }
}
