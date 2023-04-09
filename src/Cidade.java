import java.util.List;

public class Cidade implements Comparable<Cidade> {

    private String nome;

    public Cidade(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static Cidade findByCidade(String nome, List<Cidade> cidades) {
        for (Cidade cidade : cidades) {
            if (cidade.nome.equals(nome)) {
                return cidade;
            }
            
        }
		return null;
    }

    @Override
    public int compareTo(Cidade o) {
        // TODO Auto-generated method stub
        return 0;
    }
}