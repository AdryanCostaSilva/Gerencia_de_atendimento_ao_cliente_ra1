public class Fila {
    private NodeCliente primeiro;
    private NodeCliente ultimo;

    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionarCliente(ElementoCliente cliente){
        NodeCliente novoCLiente = new NodeCliente();
        novoCLiente.setInformation(cliente);
        novoCLiente.setNextNode(null);

        if (vazia()){
            primeiro = novoCLiente;
            ultimo = novoCLiente;
        } else{
            ultimo.setNextNode(novoCLiente);
            ultimo = novoCLiente;
        }
        System.out.println("Cliente: " + cliente.getNome() + " -> adicionado!");
    }

    public void atenderCliente(){
        if (vazia()){
            System.out.println("Nenhum cliente na fila!");
            return;
        }

        System.out.println("Cliente" + primeiro.getInformation().getNome() + " atendido!");
        primeiro = primeiro.getNextNode();

        if (primeiro == null){
            ultimo = null;
        }
    }

    public void imprimirClientes(){
        NodeCliente atual = primeiro;
        int count = 0;
        while (atual != null){
            count ++;
            System.out.println("["+count+"] Cliente - ID: "+atual.getInformation().getId()+ " | Nome: "+atual.getInformation().getNome()+"| Motivo da solicitação: "+atual.getInformation().getMotivo());
            atual = atual.getNextNode();
        }
    }

    public boolean vazia(){
        return primeiro == null;
    }
}
