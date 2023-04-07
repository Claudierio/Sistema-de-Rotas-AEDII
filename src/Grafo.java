import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Grafo {

	private int[][] matriz;
    private List<Cidade> vertices;
    
    private int numeroVertices;

	public Grafo(int numeroVertices) {
		this.numeroVertices = numeroVertices;
		this.vertices = new ArrayList<Cidade>(numeroVertices);
		this.matriz = new int[numeroVertices][numeroVertices];
		for(int i=0; i<numeroVertices; i++) {
            this.matriz[i][i] = 0;
        }
	}
    
	public void adicionarVertice(Cidade c) {
        this.vertices.add(c);
    }
	
	
	public void adicionarAresta(Cidade origem, Cidade destino, int peso) {
	    int i = vertices.indexOf(origem);
	    int j = vertices.indexOf(destino);
	    if (i >= 0 && j >= 0) {
	        matriz[i][j] = peso;
	    }
	}
	
	public void imprimirMatriz() {
	    for (int i = 0; i < numeroVertices; i++) {
	        for (int j = 0; j < numeroVertices; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public int[][] floydWarshall() {
	    int[][] distancias = new int[numeroVertices][numeroVertices];

	    for (int i = 0; i < numeroVertices; i++) {
	        for (int j = 0; j < numeroVertices; j++) {
	            distancias[i][j] = matriz[i][j];
	        }
	    }

	    for (int k = 0; k < numeroVertices; k++) {
	        for (int i = 0; i < numeroVertices; i++) {
	            for (int j = 0; j < numeroVertices; j++) {
	                if (distancias[i][k] + distancias[k][j] < distancias[i][j]) {
	                	
	                    distancias[i][j] = distancias[i][k] + distancias[k][j];
	                }
	            }
	        }
	    }

	    return distancias;
	}



	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public List<Cidade> getVertices() {
		return vertices;
	}

	public void setVertices(List<Cidade> vertices) {
		this.vertices = vertices;
	}

	public int getNumeroVertices() {
		return numeroVertices;
	}

	public void setNumeroVertices(int numeroVertices) {
		this.numeroVertices = numeroVertices;
	}
	
	
}
