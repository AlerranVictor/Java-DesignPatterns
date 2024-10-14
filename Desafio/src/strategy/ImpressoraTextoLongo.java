package strategy;

public class ImpressoraTextoLongo implements Impressora {

    @Override
    public void imprimir(String impressao) {
        if(impressao.length() >= 10){
            System.out.println(impressao);
        } else {
            ImpressoraTextoCurto impressoraTC = new ImpressoraTextoCurto();
            System.out.println("Texto pequeno demais");
            System.out.println("Direcionando para a impressora de textos curtos!...");
            impressoraTC.imprimir(impressao);
        }
    }

}
