public class Node {
    private Integer information;
    private Node nextNode;

    public Node(){
        this.information = null;
        this.nextNode = null;
    }

    public void setInformation(Integer information){
        this.information = information;
    }

    public Integer getInformation(){
        return information;
    }

    public void setNextNode(){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }
}
