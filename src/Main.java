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
		 grafo.adicionarAresta(list.get(0), list.get(16), 21); // Garannhus, Caétes
		 grafo.adicionarAresta(list.get(16), list.get(10), 28); // Caetés, Tarci
		 grafo.adicionarAresta(list.get(10), list.get(11), 18); // Tarci, Venturosa
		 grafo.adicionarAresta(list.get(11), list.get(12), 12); // Venturosa, Pedra
		 grafo.adicionarAresta(list.get(12), list.get(13), 19); // Pedra, Arcoverde
		 grafo.adicionarAresta(list.get(13), list.get(15), 27); // Arcoverde, Buíque
		 grafo.adicionarAresta(list.get(10), list.get(50), 49); // Tarci, Santo Antônio
		 grafo.adicionarAresta(list.get(7), list.get(9), 75); // Santo Antônio, Japecanga
		 grafo.adicionarAresta(list.get(9), list.get(8), 17); // Japecanga, Garcia
		 grafo.adicionarAresta(list.get(8), list.get(6), 19); // Garcia, Aguas Belas
		 grafo.adicionarAresta(list.get(6), list.get(5), 40); // Aguas Belas, Iati


		 
		 grafo.floydWarshall();
		
		System.out.println("Viagem de " + list.get(0).getNome() + " para " + list.get(1).getNome() + "\n");
		grafo.imprimirMenorCaminho(list.get(0), list.get(3));
		

	}

}
