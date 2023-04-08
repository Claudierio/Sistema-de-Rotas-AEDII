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
		 
		 grafo.adicionarAresta(list.get(0), list.get(1), 22.6); // Garanhuns, Paranatama
		 grafo.adicionarAresta(list.get(1), list.get(2), 15.4); // Paranatama, Saloa
		 grafo.adicionarAresta(list.get(1), list.get(4), 24.0); // Paranatama, Meladinho
		 grafo.adicionarAresta(list.get(4), list.get(5), 12.2); // Meladinho, Iati
		 grafo.adicionarAresta(list.get(2), list.get(3), 25.9); // Saloa, Bom conselho
		 grafo.adicionarAresta(list.get(5), list.get(3), 26.0); // Iati, Bom Conselho
		 grafo.adicionarAresta(list.get(0), list.get(34), 23.2); // Garanhuns, Brejão
		 grafo.adicionarAresta(list.get(34), list.get(3), 26.3); // Brejão, Bom Conselho
		 grafo.adicionarAresta(list.get(0), list.get(16), 20.9); // Garannhus, Caétes
		 grafo.adicionarAresta(list.get(16), list.get(10), 28.4); // Caetés, Tarci
		 grafo.adicionarAresta(list.get(10), list.get(11), 14.5); // Tarci, Venturosa
		 grafo.adicionarAresta(list.get(11), list.get(12), 12.6); // Venturosa, Pedra
		 grafo.adicionarAresta(list.get(12), list.get(13), 19.1); // Pedra, Arcoverde
		 grafo.adicionarAresta(list.get(13), list.get(15), 27.3); // Arcoverde, Buíque
		 grafo.adicionarAresta(list.get(10), list.get(7), 9.1); // Tarci, Santo Antônio
		 grafo.adicionarAresta(list.get(7), list.get(9), 18.8); // Santo Antônio, Japecanga
		 grafo.adicionarAresta(list.get(9), list.get(8), 17.4); // Japecanga, Garcia
		 grafo.adicionarAresta(list.get(8), list.get(6), 28.4); // Garcia, Aguas Belas
		 grafo.adicionarAresta(list.get(6), list.get(5), 29.6); // Aguas Belas, Iati


		 
		 grafo.floydWarshall();
		
		grafo.imprimirMenorCaminho(list.get(15), list.get(3));
		

	}

}
