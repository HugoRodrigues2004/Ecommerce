
package Util;

public class Util {
    private static boolean logado = true; // simulação

    public static boolean isloged() {
        return logado;
    }

    public static void logar() {
        logado = true;
    }

    public static void deslogar() {
        logado = false;
    }
}
