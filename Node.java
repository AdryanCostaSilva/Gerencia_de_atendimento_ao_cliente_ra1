public class Node {
    private Elemento information;
    private Node nextNode;

    public Node(){
        this.information = null;
        this.nextNode = null;
    }

    public void setInformation(Elemento information){
        this.information = information;
    }

    public Elemento getInformation(){
        return information;
    }

    public void setNextNode(){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }
}
