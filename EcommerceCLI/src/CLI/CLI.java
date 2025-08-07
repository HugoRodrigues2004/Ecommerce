
package CLI;

import DAO.DAO;
import Tabela.Tabela;
import java.util.Scanner;

public abstract class CLI {
    protected Tabela tabela;
    protected DAO dao;

    protected static Scanner scanner = new Scanner(System.in);

    public CLI(DAO dao) {
        this.dao = dao;
    }

    // Métodos abstratos que devem ser implementados nas subclasses
    public abstract void novo();
    public abstract void remover();
    public abstract void alterar();
    public abstract void mostrar();

    // Métodos utilitários para entrada de dados
    public static String getNome() {
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.out.print("Nome inválido. Digite novamente: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    public static String getDesc() {
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.out.print("Descrição inválida. Digite novamente: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    public static int getIntPositivo() {
        while (true) {
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.print("Digite um número inteiro positivo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }

    public static double getDoublePositivo() {
        while (true) {
            try {
                double valor = Double.parseDouble(scanner.nextLine().trim());
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.print("Digite um número positivo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número decimal: ");
            }
        }
    }

    public static String getString(int maxLen) {
        String input = scanner.nextLine().trim();
        return input.length() <= maxLen ? input : input.substring(0, maxLen);
    }
}
