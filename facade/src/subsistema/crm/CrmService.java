package subsistema.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(String.format("Nome: %s - Cep: %s - Cidade: %s - Estado: %s", nome, cep, cidade, estado));
    }
}
