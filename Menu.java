import java.util.Scanner;
public class Menu{
	private String opt = "0";
	private int id;
	public void menu(Scanner scanner){
		do{
			System.out.println("""
					1- Ver Fila de Atendimento
					2- Ver Histórico de Serviços
					9- Sair
					""");
			System.out.printf("Opção: ");
			opt = scanner.nextLine();
			System.out.printf("\n");
			switch(opt){
				case "1":
					//TODO: Exibir Fila de Atendimento
					break;
				case "2":
					//TODO: Exibir Histórico de Serviços
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
