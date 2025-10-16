import java.util.Scanner;
public class Menu{
	private String opt = "0";
	private int id;

	private Fila filaClientes = new Fila();
	private Pilha pilhaSolicitacoes = new Pilha();

	public void menu(Scanner scanner){

		// Dados iniciais para exemplo, passados pelo professor

		ElementoCliente[] filaAtendimentoExemplo = new ElementoCliente[] {
				new ElementoCliente("CLI001", "Maria Silva", "Dúvida sobre produto"),
				new ElementoCliente("CLI002", "João Souza", "Reclamação de serviço"),
				new ElementoCliente("CLI003", "Ana Costa", "Solicitação de reembolso"),
				new ElementoCliente("CLI004", "Pedro Alves", "Informações de entrega"),
				new ElementoCliente("CLI005", "Carla Dias", "Agendamento de visita"),
				new ElementoCliente("CLI006", "Lucas Martins", "Alteração de pedido"),
				new ElementoCliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
				new ElementoCliente("CLI008", "Rafael Lima", "Renovação de assinatura"),
				new ElementoCliente("CLI009", "Fernanda Gomes", "Suporte para instalação"),
				new ElementoCliente("CLI010", "Carlos Eduardo", "Pedido de orçamento")
		};

		ElementoSolicitacao[] historicoExemplo = new ElementoSolicitacao[] {
				new ElementoSolicitacao("REQ001", "Instalação de software", "2024-08-20 10:30"),
				new ElementoSolicitacao("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
				new ElementoSolicitacao("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
				new ElementoSolicitacao("REQ004", "Suporte técnico", "2024-08-20 12:00"),
				new ElementoSolicitacao("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
				new ElementoSolicitacao("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
				new ElementoSolicitacao("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
				new ElementoSolicitacao("REQ008", "Configuração de rede", "2024-08-20 14:00"),
				new ElementoSolicitacao("REQ009", "Restauração de dados", "2024-08-20 14:30"),
				new ElementoSolicitacao("REQ010", "Consulta técnica", "2024-08-20 15:00")
		};

		for (int i = 0; i < 10; i++){
			filaClientes.adicionarCliente(filaAtendimentoExemplo[i]);
			pilhaSolicitacoes.inserirSolicitacao(historicoExemplo[i]);
		}

		do{
			System.out.println("\n");
			System.out.println("""
					1- Ver Fila de Atendimento
					2- Adicionar cliente na fila
					3- Atender o próximo cliente
					4- Ver Histórico de Serviços
					5- Adicionar solicitação no histórico
					6- Remover solicitação do histórico
					9- Sair
					""");
			System.out.printf("Opção: ");
			opt = scanner.nextLine();
			System.out.printf("\n");
			switch(opt){
				case "1":
					System.out.println("=== Fila de Atendimento ===");
					filaClientes.imprimirClientes();
					break;
				case "2":
					System.out.println("ID: ");
					String id_c = scanner.nextLine();

					System.out.println("Nome: ");
					String nome = scanner.nextLine();

					System.out.println("Motivo da atendimento: ");
					String motivo = scanner.nextLine();

					ElementoCliente cliente = new ElementoCliente(id_c, nome, motivo);
					filaClientes.adicionarCliente(cliente);

					break;
				case "3":
					filaClientes.atenderCliente();
					break;
				case "4":
					System.out.println("=== Histórico de Solicitações ===");
					pilhaSolicitacoes.imprimirSolicitacoes();
					break;
				case "5":
					System.out.println("ID: ");
					String id_s = scanner.nextLine();

					System.out.println("Descrição: ");
					String descricao = scanner.nextLine();

					System.out.println("Data e Hora: ");
					String data_hora = scanner.nextLine();

					ElementoSolicitacao solicitacao = new ElementoSolicitacao(id_s, descricao, data_hora);
					pilhaSolicitacoes.inserirSolicitacao(solicitacao);

					break;
				case "6":
					pilhaSolicitacoes.removerSolicitacao();
					break;
				case "9":
					System.out.printf("O sistema será encerrado...\n");
					System.exit(0);
					break;
				default:
					System.out.printf("Opção inválida, tente novamente.\n");
					break;	
			}
		}while(!opt.equals("9"));
	}
}
