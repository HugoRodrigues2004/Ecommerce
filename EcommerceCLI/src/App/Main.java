
package App;

import DAO.DAO;
import Produto.ProdutoCLI;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();
        ProdutoCLI produtoCLI = new ProdutoCLI(dao);

        try {
            produtoCLI.novo();     // para testar cadastro
            produtoCLI.mostrar();  // para testar listagem
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
