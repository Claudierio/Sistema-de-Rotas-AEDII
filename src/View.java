
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private Scanner scan;

	public void menu(Grafo grafo, ArrayList<Cidade> list){
        
        
		scan = new Scanner(System.in);
        Boolean continuar = true;
        
        while(continuar){
        	System.out.println("\n1 - Imprimir cidades");
        	System.out.println("2 - Imprimir a Matriz");
            System.out.println("3 - Escolher a viagem");
            System.out.println("0 - Sair");

            int opcao = scan.nextInt();

            switch (opcao){
            	case 1:
            		System.out.println("");
                    grafo.imprimirCidades();
            		break;
            	case 2:
            		System.out.println("");
                    grafo.imprimirMatriz();
            		break;
                case 3:

                    Scanner texto = new Scanner(System.in);
                    String str = null;
                    String str1 = null;
                    
                    System.out.println("");
                    
                    System.out.println("Informe o nome da cidade de origem: ");
                    str = texto.nextLine();
                    System.out.println("Informe o nome da cidade de destino: ");
                    str1 = texto.nextLine();
                    
                    grafo.imprimirMenorCaminho(Cidade.findByCidade(str, list), Cidade.findByCidade(str1, list));
                    break;
              
                case 0: 
                    System.out.println("\nSaindo...");
                    continuar = false;
                    break;
                    
                default:
                    
                     System.out.println("\nInvalido");
                     break;

            }
        }
    }
}


