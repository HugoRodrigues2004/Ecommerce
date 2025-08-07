
package Tabela;

public class Cabecalho {
    private String[] nomes;
    private int[] espacos;

    public Cabecalho(String[] nomes, int[] espacos) {
        this.nomes = nomes;
        this.espacos = espacos;
    }

    public String[] getNomes() {
        return nomes;
    }

    public int[] getEspacos() {
        return espacos;
    }
}
