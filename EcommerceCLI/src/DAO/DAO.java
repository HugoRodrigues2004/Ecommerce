
package DAO;

import Produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    public ProdutoDAO produto() {
        return new ProdutoDAO();
    }

    public static class ProdutoDAO {
        private static List<Produto> produtos = new ArrayList<>();
        private static int idCounter = 1;

        public void inserir(Produto produto) {
            produto.setQuantidade(idCounter++); // Simula ID
            produtos.add(produto);
        }

        public void remover(int id) {
            produtos.removeIf(p -> p.getId() == id);
        }

        public void atualizar(Produto novo, Produto antigo) {
            produtos.remove(antigo);
            produtos.add(novo);
        }

        public Produto buscar(int id) {
            return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        }

        public List<Produto> buscarTodos() {
            return produtos;
        }

        public List<Produto> buscarNome(String nome) {
            List<Produto> resultado = new ArrayList<>();
            for (Produto p : produtos) {
                if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    resultado.add(p);
                }
            }
            return resultado;
        }

        public List<Produto> buscarPreco(int min, int max) {
            List<Produto> resultado = new ArrayList<>();
            for (Produto p : produtos) {
                if (p.getPreco() >= min && p.getPreco() <= max) {
                    resultado.add(p);
                }
            }
            return resultado;
        }
    }
}
