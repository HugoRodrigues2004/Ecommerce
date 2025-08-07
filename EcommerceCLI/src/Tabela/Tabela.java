
package Tabela;

import java.util.List;
import java.util.ArrayList;

public class Tabela {
    private Cabecalho cabecalho;
    private List<TabelaDado> linhas;
    private int colunas;

    public Tabela(Cabecalho cabecalho, int colunas) {
        this.cabecalho = cabecalho;
        this.colunas = colunas;
        this.linhas = new ArrayList<>();
    }

    public void add(TabelaDado dado) {
        linhas.add(dado);
    }

    public void resetar() {
        linhas.clear();
    }

    public int getQtdColunas() {
        return colunas;
    }

    public void desenhar() {
        // Exibe o cabeçalho
        String[] nomes = cabecalho.getNomes();
        for (String nome : nomes) {
            System.out.print(nome + "\t");
        }
        System.out.println();

        // Exibe os dados
        for (TabelaDado dado : linhas) {
            for (String valor : dado.getDados()) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
