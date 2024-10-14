package singleton;

public class ImpressoraSingleton {
    private static ImpressoraSingleton impressora;
    private ImpressoraSingleton(){
        super();
    }
    public static ImpressoraSingleton getInstancia(){
        if(impressora == null){
            impressora = new ImpressoraSingleton();
        }
        return impressora;
    }

    public void imprimirTexto(String texto){
        System.out.println(texto);
    }
}
