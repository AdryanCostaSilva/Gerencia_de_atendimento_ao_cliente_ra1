public class NodeCliente {
    private ElementoCliente information;
    private NodeCliente nextNode;

    public NodeCliente(){
        this.information = null;
        this.nextNode = null;
    }

    public void setInformation(ElementoCliente information){
        this.information = information;
    }

    public ElementoCliente getInformation(){
        return information;
    }

    public void setNextNode(NodeCliente nextNode){
        this.nextNode = nextNode;
    }

    public NodeCliente getNextNode(){
        return this.nextNode;
    }
}
