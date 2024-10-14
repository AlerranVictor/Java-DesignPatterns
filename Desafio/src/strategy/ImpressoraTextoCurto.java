package strategy;

public class ImpressoraTextoCurto implements Impressora {

    @Override
    public void imprimir(String impressao) {
        if(impressao.length() < 10){
            System.out.println(impressao);
        } else {
            ImpressoraTextoLongo impressoraTL = new ImpressoraTextoLongo();
            System.out.println("Este texto é longo");
            System.out.println("Direcionando para a impressora de textos longos!...");
            impressoraTL.imprimir(impressao);
        }
    }

}
