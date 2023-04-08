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
		 
		 grafo.adicionarAresta(list.get(0), list.get(1), 22.6);   // Garanhuns, Paranatama
		 grafo.adicionarAresta(list.get(1), list.get(2), 15.4);   // Paranatama, Saloa
		 grafo.adicionarAresta(list.get(1), list.get(4), 24.0);   // Paranatama, Meladinho
		 grafo.adicionarAresta(list.get(4), list.get(5), 12.2);   // Meladinho, Iati
		 grafo.adicionarAresta(list.get(2), list.get(3), 25.9);   // Saloa, Bom conselho
		 grafo.adicionarAresta(list.get(5), list.get(3), 26.0);   // Iati, Bom Conselho
		 grafo.adicionarAresta(list.get(0), list.get(34), 23.2);  // Garanhuns, Brejão
		 grafo.adicionarAresta(list.get(34), list.get(3), 26.3);  // Brejão, Bom Conselho
		 grafo.adicionarAresta(list.get(0), list.get(16), 20.9);  // Garannhus, Caétes
		 grafo.adicionarAresta(list.get(16), list.get(10), 28.4); // Caetés, Tarci
		 grafo.adicionarAresta(list.get(10), list.get(11), 14.5); // Tarci, Venturosa
		 grafo.adicionarAresta(list.get(11), list.get(12), 12.6); // Venturosa, Pedra
		 grafo.adicionarAresta(list.get(12), list.get(13), 19.1); // Pedra, Arcoverde
		 grafo.adicionarAresta(list.get(13), list.get(15), 27.3); // Arcoverde, Buíque
		 grafo.adicionarAresta(list.get(10), list.get(7), 9.1);   // Tarci, Santo Antônio
		 grafo.adicionarAresta(list.get(7), list.get(9), 18.8);   // Santo Antônio, Japecanga
		 grafo.adicionarAresta(list.get(9), list.get(8), 17.4);   // Japecanga, Garcia
		 grafo.adicionarAresta(list.get(8), list.get(6), 28.4);   // Garcia, Aguas Belas
		 grafo.adicionarAresta(list.get(6), list.get(5), 29.6);   // Aguas Belas, Iati
		 grafo.adicionarAresta(list.get(0), list.get(33), 16.3);  //Garanhuns, Joao Joao
		 grafo.adicionarAresta(list.get(33), list.get(32), 11.1); //Sao joao, Angelin
		 grafo.adicionarAresta(list.get(32), list.get(45), 5.8);  //Angelin, Palmerina
		 grafo.adicionarAresta(list.get(45), list.get(42), 35.7); //palmerina, correntes
		 grafo.adicionarAresta(list.get(0), list.get(46), 28.9);  //Garanhuns, Iratama
		 grafo.adicionarAresta(list.get(46), list.get(43), 24.0); //Iratama, lagoa do ouro
		 grafo.adicionarAresta(list.get(46), list.get(44), 17.1); //Lagoa do ouro, Barra do brejo
		 grafo.adicionarAresta(list.get(46), list.get(42), 15.8); //Lagoa ouro, Correntes
		 grafo.adicionarAresta(list.get(42), list.get(40), 16.2); // coorentes, santana
		 grafo.adicionarAresta(list.get(40), list.get(38), 26.3); //santana, uniao
		 grafo.adicionarAresta(list.get(38), list.get(37), 32.7); //uniao, serra grande
		 grafo.adicionarAresta(list.get(32), list.get(31), 13.4); //angelin, Canhotinho
		 grafo.adicionarAresta(list.get(31), list.get(47), 27.4); //Canhotinho, quipapa
		 grafo.adicionarAresta(list.get(37), list.get(47), 26.1); //serra grande, quipapa
		 grafo.adicionarAresta(list.get(31), list.get(20), 33.3); // Canhorinho, lajedo
		 grafo.adicionarAresta(list.get(0), list.get(24), 18.6);  //garanhuns, batinga
		 grafo.adicionarAresta(list.get(25), list.get(21), 5.6);  //baatinga, jupi
		 grafo.adicionarAresta(list.get(21), list.get(20), 13.7); //Jupi, lajedo
		 grafo.adicionarAresta(list.get(20), list.get(23), 41.6); //Jupi,Juerma
		 grafo.adicionarAresta(list.get(16), list.get(17), 5.9);  //caetes, capoeiras
		 grafo.adicionarAresta(list.get(17), list.get(18), 33.);  // capoeiras, sao bento
		 grafo.adicionarAresta(list.get(18), list.get(19), 12.1); //sao bento, queimada grande
		 grafo.adicionarAresta(list.get(19), list.get(20), 8.7);  //queimada grande, lajedo
		 grafo.adicionarAresta(list.get(20), list.get(26), 21.8); //lajedo, cachoeirinha
		 grafo.adicionarAresta(list.get(20), list.get(25), 23.0); //Ibirajuba, Lajedo
		 grafo.adicionarAresta(list.get(25), list.get(27), 17.8); //Ibirajuba, Altinho
		 grafo.adicionarAresta(list.get(27), list.get(49), 15.0); //Altinho, Agrestina
		 grafo.adicionarAresta(list.get(23), list.get(48), 21.2); //Jurama, panelas
		 grafo.adicionarAresta(list.get(23), list.get(28), 12.8); //Panelas, Cupira
		 grafo.adicionarAresta(list.get(23), list.get(49), 18.7); //cupira, agrestina
		 grafo.adicionarAresta(list.get(47), list.get(48), 22.2); //Quipapa, Panelas
		 grafo.adicionarAresta(list.get(49), list.get(30), 18.5); //Agrestina, Batateira
		 grafo.adicionarAresta(list.get(47), list.get(36), 33.5); //Quipapa, Jaqueira
		 grafo.adicionarAresta(list.get(30), list.get(35), 21.8); //Batateira, Catende
		 grafo.adicionarAresta(list.get(36), list.get(35), 14.7);//Jaqueira, Catende
		 grafo.adicionarAresta(list.get(30), list.get(29), 23.6); //Batateira, Bonito
		 
		 grafo.floydWarshall();
		
		grafo.imprimirMenorCaminho(list.get(15), list.get(3));
		

	}

}
