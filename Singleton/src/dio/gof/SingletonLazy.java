package dio.gof;


public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){ //construtor private garante que a classe não seja instanciada externamente
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
