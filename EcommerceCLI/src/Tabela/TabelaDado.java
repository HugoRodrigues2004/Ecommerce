
package Tabela;

public class TabelaDado {
    private String[] dados;

    public TabelaDado(int colunas) {
        dados = new String[colunas];
    }

    public void add(int coluna, String valor) {
        if (coluna >= 1 && coluna <= dados.length) {
            dados[coluna - 1] = valor;
        }
    }

    public String[] getDados() {
        return dados;
    }
}
