import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Repositorio repositorio = new Repositorio();
		repositorio.bancoCidades();
		
		ArrayList<Cidade> list = repositorio.lista;
		
		Grafo grafo = new Grafo(list.size());
		
		 for (Cidade c : list){
	            grafo.adicionarVertice(c);
	        }
		 
		 grafo.adicionarAresta(list.get(0), list.get(1), 23); // Garanhuns, Paranatama
		 grafo.adicionarAresta(list.get(1), list.get(2), 16); // Paranatama, Saloa
		 grafo.adicionarAresta(list.get(1), list.get(4), 24); // Paranatama, Meladinho
		 grafo.adicionarAresta(list.get(4), list.get(5), 12); // Meladinho, Iati
		 grafo.adicionarAresta(list.get(2), list.get(3), 26); // Saloa, Bom conselho
		 grafo.adicionarAresta(list.get(5), list.get(3), 26); // Iati, Bom Conselho
		 grafo.adicionarAresta(list.get(0), list.get(34), 23); // Garanhuns, Brejão
		 grafo.adicionarAresta(list.get(34), list.get(3), 26); // Brejão, Bom Conselho

		 grafo.floydWarshall();
		
		grafo.imprimirMenorCaminho(list.get(0), list.get(3));

	}

}
