
import facade.Facade;

public class App {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();
        facade.migrarCliente("Alerran", "40028-922");
    }
}
