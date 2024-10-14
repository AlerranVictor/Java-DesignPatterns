
import java.util.Scanner;
import singleton.ImpressoraSingleton;

public class App {
    public static void main(String[] args) throws Exception {
        ImpressoraSingleton impressora = ImpressoraSingleton.getInstancia();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto para imprimir: ");
        String texto = scanner.nextLine();
        System.out.println("Texto sendo impresso...");
        System.out.println("------");
        impressora.getInstancia().imprimirTexto(texto);
        scanner.close();
    }
}
